import java.util.*;

public class ItineraryService {
    private static final List<ActivityProvider> ACTIVITY_PROVIDERS = Arrays.asList(
            new ActivityProvider("Provider A", "Hiking", 2000),
            new ActivityProvider("Provider B", "Scuba Diving", 5000),
            new ActivityProvider("Provider C", "Safari", 7000),
            new ActivityProvider("Provider D", "City Tour", 3000),
            new ActivityProvider("Provider E", "Skiing", 10000),
            new ActivityProvider("Provider F", "Museum Visit", 1500),
            new ActivityProvider("Provider G", "Beach Relaxation", 2500),
            new ActivityProvider("Provider H", "Adventure Park", 6000),
            new ActivityProvider("Provider I", "Cultural Show", 4000),
            new ActivityProvider("Provider J", "Wine Tasting", 4500)
    );

    public static List<String[]> assignActivityProviders(BudgetRange budgetRange, int days, List<String> activities) {
        List<String[]> activityPlan = new ArrayList<>();
        double budgetMin = budgetRange.getActivitiesMin();
        double budgetMax = budgetRange.getActivitiesMax();

        for (int day = 0; day < days; day++) {
            String activity = activities.get(day);
            Optional<ActivityProvider> suitableProvider = ACTIVITY_PROVIDERS.stream()
                    .filter(provider -> provider.getActivity().equalsIgnoreCase(activity))
                    .filter(provider -> provider.getCost() >= budgetMin && provider.getCost() <= budgetMax)
                    .findFirst();

            if (suitableProvider.isPresent()) {
                ActivityProvider provider = suitableProvider.get();
                activityPlan.add(new String[]{provider.getName(), provider.getActivity(), String.valueOf(provider.getCost())});
            } else {
                activityPlan.add(new String[]{"No provider found", activity, "0"});
            }
        }
        return activityPlan;
    }
}
