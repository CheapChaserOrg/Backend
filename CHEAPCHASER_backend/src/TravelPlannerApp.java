import java.util.List;
import java.util.Scanner;

public class TravelPlannerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Your Budget Level (Low, Medium, High, Luxury): ");
        String budget = scanner.nextLine();

        System.out.println("Enter Trip Duration (in days): ");
        int duration = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.println("Select Your Interests (Beach, Adventure, History, Wildlife, Food): ");
        String interests = scanner.nextLine();

        boolean sameAccommodation = true;
        if (duration > 3) {
            System.out.println("Would you like to stay in the same accommodation for the entire trip? (yes/no): ");
            String choice = scanner.nextLine();
            sameAccommodation = choice.equalsIgnoreCase("yes");
        }

        List<String> itinerary = ItineraryGenerator.generateItinerary(budget, duration, interests, sameAccommodation);
        System.out.println("\n------ Your Travel Itinerary ------");
        for (String item : itinerary) {
            System.out.println(item);
        }

        scanner.close();
    }
}
