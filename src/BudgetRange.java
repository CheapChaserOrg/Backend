public class BudgetRange {
    private String level; // Low, Medium, High, Luxury
    private double accommodationMin;
    private double accommodationMax;
    private double transportMin;
    private double transportMax;
    private double mealsMin;
    private double mealsMax;
    private double activitiesMin;
    private double activitiesMax;
    private double totalDailyMin;
    private double totalDailyMax;

    // Constructor
    public BudgetRange(String level, double accommodationMin, double accommodationMax, double transportMin, double transportMax,
                       double mealsMin, double mealsMax, double activitiesMin, double activitiesMax, double totalDailyMin, double totalDailyMax) {
        this.level = level;
        this.accommodationMin = accommodationMin;
        this.accommodationMax = accommodationMax;
        this.transportMin = transportMin;
        this.transportMax = transportMax;
        this.mealsMin = mealsMin;
        this.mealsMax = mealsMax;
        this.activitiesMin = activitiesMin;
        this.activitiesMax = activitiesMax;
        this.totalDailyMin = totalDailyMin;
        this.totalDailyMax = totalDailyMax;
    }

    // Getters and Setters
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getAccommodationMin() {
        return accommodationMin;
    }

    public void setAccommodationMin(double accommodationMin) {
        this.accommodationMin = accommodationMin;
    }

    public double getAccommodationMax() {
        return accommodationMax;
    }

    public void setAccommodationMax(double accommodationMax) {
        this.accommodationMax = accommodationMax;
    }

    public double getTransportMin() {
        return transportMin;
    }

    public void setTransportMin(double transportMin) {
        this.transportMin = transportMin;
    }

    public double getTransportMax() {
        return transportMax;
    }

    public void setTransportMax(double transportMax) {
        this.transportMax = transportMax;
    }

    public double getMealsMin() {
        return mealsMin;
    }

    public void setMealsMin(double mealsMin) {
        this.mealsMin = mealsMin;
    }

    public double getMealsMax() {
        return mealsMax;
    }

    public void setMealsMax(double mealsMax) {
        this.mealsMax = mealsMax;
    }

    public double getActivitiesMin() {
        return activitiesMin;
    }

    public void setActivitiesMin(double activitiesMin) {
        this.activitiesMin = activitiesMin;
    }

    public double getActivitiesMax() {
        return activitiesMax;
    }

    public void setActivitiesMax(double activitiesMax) {
        this.activitiesMax = activitiesMax;
    }

    public double getTotalDailyMin() {
        return totalDailyMin;
    }

    public void setTotalDailyMin(double totalDailyMin) {
        this.totalDailyMin = totalDailyMin;
    }

    public double getTotalDailyMax() {
        return totalDailyMax;
    }

    public void setTotalDailyMax(double totalDailyMax) {
        this.totalDailyMax = totalDailyMax;
    }

    @Override
    public String toString() {
        return "BudgetRange{" +
                "level='" + level + '\'' +
                ", accommodationMin=" + accommodationMin +
                ", accommodationMax=" + accommodationMax +
                ", transportMin=" + transportMin +
                ", transportMax=" + transportMax +
                ", mealsMin=" + mealsMin +
                ", mealsMax=" + mealsMax +
                ", activitiesMin=" + activitiesMin +
                ", activitiesMax=" + activitiesMax +
                ", totalDailyMin=" + totalDailyMin +
                ", totalDailyMax=" + totalDailyMax +
                '}';
    }
}