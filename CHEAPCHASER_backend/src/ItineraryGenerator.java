import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ItineraryGenerator {

    public static List<String> generateItinerary(String budget, int duration, String interests, boolean sameAccommodation) {
        List<String> itinerary = new ArrayList<>();
        int dailyBudget = getDailyBudget(budget);
        int totalBudget = dailyBudget * duration;

        itinerary.add("Total Estimated Budget: LKR " + totalBudget);
        String[] accommodations = selectAccommodations(budget, duration, sameAccommodation);

        for (int day = 1; day <= duration; day++) {
            itinerary.add("Day " + day + " Activities:");

            if (sameAccommodation) {
                itinerary.add("Stay at: " + accommodations[0]);
            } else {
                int accommodationIndex = (day - 1) / (duration / accommodations.length);
                itinerary.add("Stay at: " + accommodations[accommodationIndex]);
            }

            itinerary.add("Transport: " + getTransport(budget));
            itinerary.add("Meal Budget: LKR " + getMealBudget(budget));
            itinerary.add("Activity: " + getActivity(interests));

            itinerary.add("---------------------------------");
        }

        return itinerary;
    }

    private static int getDailyBudget(String budget) {
        switch (budget) {
            case "Low": return 6000;
            case "Medium": return 12000;
            case "High": return 20000;
            case "Luxury": return 35000;
            default: return 10000;
        }
    }

    private static String[] selectAccommodations(String budget, int duration, boolean sameAccommodation) {
        Random random = new Random();
        String[] availableHotels;

        switch (budget) {
            case "Low":
                availableHotels = new String[]{"Jungle City Hostel", "Kalan Villa - Galle", "Backpacker Galle Hostel", "Tanty's Hostel"};
                break;
            case "Medium":
                availableHotels = new String[]{"Windy Garden Bed & Breakfast", "Sol Y Mar - Unawatuna Hotel", "Green Herbal Ayurvedic Eco-Lodge", "Fort Dew Guest House"};
                break;
            case "High":
                availableHotels = new String[]{"Voda Hotel", "Arabella On Boossa", "Closenberg Hotel", "Why House – Galle"};
                break;
            case "Luxury":
                availableHotels = new String[]{"Fort Bazaar Hotel", "KK Beach"};
                break;
            default:
                availableHotels = new String[]{"Standard Hotel"};
        }

        if (sameAccommodation || duration <= 3) {
            return new String[]{availableHotels[random.nextInt(availableHotels.length)]};
        } else if (duration <= 6) {
            return new String[]{availableHotels[random.nextInt(availableHotels.length)], availableHotels[random.nextInt(availableHotels.length)]};
        } else {
            return new String[]{availableHotels[random.nextInt(availableHotels.length)], availableHotels[random.nextInt(availableHotels.length)], availableHotels[random.nextInt(availableHotels.length)]};
        }
    }

    private static String getTransport(String budget) {
        switch (budget) {
            case "Low": return "Public Bus / Tuk-Tuk (LKR 2,000 - 3,500 per day)";
            case "Medium": return "Train / Private Car Rental (LKR 5,000 - 8,000 per day)";
            case "High": return "Luxury Car Rental (LKR 12,000 - 18,000 per day)";
            case "Luxury": return "Chauffeur-driven Vehicle (LKR 25,000 - 40,000 per day)";
            default: return "Standard Transport";
        }
    }

    private static int getMealBudget(String budget) {
        switch (budget) {
            case "Low": return 2000;
            case "Medium": return 5000;
            case "High": return 10000;
            case "Luxury": return 20000;
            default: return 4000;
        }
    }

    private static String getActivity(String interests) {
        Random random = new Random();
        switch (interests) {
            case "Beach":
                String[] beachActivities = {"Visit Unawatuna Beach 🏖️", "Snorkeling in Hikkaduwa 🤿", "Day Trip to Mirissa for Whale Watching 🐳"};
                return beachActivities[random.nextInt(beachActivities.length)];
            case "Adventure":
                String[] adventureActivities = {"Go Hiking at Ella Rock 🏔️", "Try Surfing in Weligama 🌊", "Zip-lining in Hanthana"};
                return adventureActivities[random.nextInt(adventureActivities.length)];
            case "History":
                String[] historyActivities = {"Explore Galle Dutch Fort 🏰", "Visit Kataragama Temple 🛕", "Tour Anuradhapura’s Ancient Ruins"};
                return historyActivities[random.nextInt(historyActivities.length)];
            case "Wildlife":
                String[] wildlifeActivities = {"Visit Yala National Park 🐘", "Explore Udawalawe Elephant Sanctuary 🦣", "Bird Watching in Bundala National Park"};
                return wildlifeActivities[random.nextInt(wildlifeActivities.length)];
            case "Food":
                String[] foodActivities = {"Take a Sri Lankan Cooking Class 🍛", "Go on a Street Food Tour in Galle 🌮", "Visit a Tea Plantation in Nuwara Eliya 🍵"};
                return foodActivities[random.nextInt(foodActivities.length)];
            default:
                return "General Sightseeing Tour";
        }
    }
}
