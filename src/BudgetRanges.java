import java.util.*;

public class BudgetRanges {
    public static final BudgetRange LOW = new BudgetRange(
            "Low",
            2500, 5500, // Accommodation
            2000, 3500, // Transport
            2000, 4000, // Meals
            1500, 4000, // Activities
            6000, 17000  // Total Daily Budget
    );

    public static final BudgetRange MEDIUM = new BudgetRange(
            "Medium",
            7000, 15000, // Accommodation
            4000, 7000,  // Transport
            4500, 7500,  // Meals
            4000, 8000,  // Activities
            19500, 37500 // Total Daily Budget
    );

    public static final BudgetRange HIGH = new BudgetRange(
            "High",
            16000, 30000, // Accommodation
            7000, 12000,  // Transport
            7500, 12000,  // Meals
            8000, 15000,   // Activities
            38500, 69000   // Total Daily Budget
    );

    public static final BudgetRange LUXURY = new BudgetRange(
            "Luxury",
            31000, Double.MAX_VALUE, // Accommodation
            12000, Double.MAX_VALUE, // Transport
            12000, Double.MAX_VALUE,  // Meals
            15000, Double.MAX_VALUE,  // Activities
            70000, Double.MAX_VALUE   // Total Daily Budget
    );

    // List of all budget ranges
    public static final List<BudgetRange> ALL_BUDGET_RANGES = List.of(LOW, MEDIUM, HIGH, LUXURY);

    // Get a budget range by level
    public static BudgetRange getBudgetRangeByLevel(String level) {
        return ALL_BUDGET_RANGES.stream()
                .filter(b -> b.getLevel().equalsIgnoreCase(level))
                .findFirst()
                .orElse(null);
    }
}