import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class InputService {
    private Scanner scanner = new Scanner(System.in);

    // Define a list of available attractions
    private static final List<String> AVAILABLE_ATTRACTIONS = List.of(
            "Ancient Temple", "Waterfall Viewpoint", "National Park",
            "Historic Fort", "Lakeside Walk", "Local Market",
            "Wildlife Sanctuary", "Sunset Beach", "Mountain View"
    );

    // Get the budget level
    public String getBudgetLevel() {
        System.out.print("Enter your budget level (Low, Medium, High, Luxury): ");
        return scanner.nextLine().trim();
    }

    // Get the number of days
    public int getNumberOfDays() {
        System.out.print("Enter the number of days for your trip: ");
        return Integer.parseInt(scanner.nextLine().trim());
    }

    // Get the list of activities user wants to include in their itinerary
    public List<String> getActivities(int days) {
        List<String> activities = new ArrayList<>();
        System.out.println("Enter the activities you want to include in your itinerary. (One per day):");
        for (int i = 1; i <= days; i++) {
            System.out.print("Enter activity for Day " + i + ": ");
            activities.add(scanner.nextLine().trim());
        }
        return activities;
    }

    // Get the list of attractions user wants to visit
    public List<String> getUserAttractions() {
        List<String> attractions = new ArrayList<>();
        System.out.println("Choose attractions you want to visit (Enter the number corresponding to the attraction). Type 'done' when finished:");

        // Display the available attractions with numbers
        for (int i = 0; i < AVAILABLE_ATTRACTIONS.size(); i++) {
            System.out.println((i + 1) + ". " + AVAILABLE_ATTRACTIONS.get(i));
        }

        // Let the user choose attractions
        while (true) {
            System.out.print("Enter attraction number (or 'done' to finish): ");
            String input = scanner.nextLine().trim();
            if ("done".equalsIgnoreCase(input)) {
                break;
            }

            try {
                int choice = Integer.parseInt(input);
                if (choice > 0 && choice <= AVAILABLE_ATTRACTIONS.size()) {
                    attractions.add(AVAILABLE_ATTRACTIONS.get(choice - 1));
                } else {
                    System.out.println("Invalid choice, please choose a number from the list.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return attractions;
    }
}
