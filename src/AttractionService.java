import java.util.*;

public class AttractionService {

    // Distribute the user-selected attractions across the days
    public static Map<Integer, List<String>> distributeAttractions(int days, List<String> userAttractions) {
        Map<Integer, List<String>> dailyAttractions = new HashMap<>();
        for (int i = 1; i <= days; i++) {
            dailyAttractions.put(i, new ArrayList<>());
        }

        int dayIndex = 1;
        for (String attraction : userAttractions) {
            dailyAttractions.get(dayIndex).add(attraction);
            dayIndex = (dayIndex % days) + 1;
        }
        return dailyAttractions;
    }
}
