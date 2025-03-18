import java.util.*;

class ActivityProvider {
    private String name;
    private String activity;
    private double cost;

    // Constructor
    public ActivityProvider(String name, String activity, double cost) {
        this.name = name;
        this.activity = activity;
        this.cost = cost;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getActivity() {
        return activity;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Provider: " + name + ", Activity: " + activity + ", Cost: " + cost;
    }
}