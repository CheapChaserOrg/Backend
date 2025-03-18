import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        InputService inputService = new InputService();

        // Collect user input for budget, days, and attractions
        String budgetLevel = inputService.getBudgetLevel();
        int days = inputService.getNumberOfDays();
        List<String> activities = inputService.getActivities(days); // Assuming this method exists for activity input
        List<String> userAttractions = inputService.getUserAttractions();

        // Validate the budget level
        BudgetRange budgetRange = BudgetRanges.getBudgetRangeByLevel(budgetLevel);
        if (budgetRange == null) {
            System.out.println("Invalid budget level. Please choose from Low, Medium, High, or Luxury.");
            return;
        }

        // Assign activities based on the selected budget range
        List<String[]> activityPlan = ItineraryService.assignActivityProviders(budgetRange, days, activities);

        // Distribute the selected attractions across the days
        Map<Integer, List<String>> dailyAttractions = AttractionService.distributeAttractions(days, userAttractions);

        // Print out the travel itinerary
        System.out.println("\nYour Complete Travel Itinerary:");
        for (int day = 1; day <= days; day++) {
            String[] plan = activityPlan.get(day - 1);
            System.out.println("\nDay " + day + ":");
            System.out.println("   - Activity: " + plan[1] + " (Provider: " + plan[0] + ", Cost: " + plan[2] + ")");
            System.out.println("   - Attractions to visit: " + dailyAttractions.get(day));
        }
    }
}
