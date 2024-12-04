public class FitnessTracker {
    public static final double kilometersPerStep = 0.000762;
    public static final double caloriesPerStep = 0.04;
    public String name;
    public int dailySteps;
    public double caloriesBurned;
    public int heartRate;

    public FitnessTracker() {
        name = "";
        dailySteps = 0;
        caloriesBurned = 0.0;
        heartRate = 0;
    }

    public FitnessTracker(String name, int dailySteps, int distanceWalked, double caloriesBurned, int heartRate) {
        this.name = name;
        this.dailySteps = dailySteps;
        this.caloriesBurned = caloriesBurned;
        this.heartRate = heartRate;
    }
    public void addSteps(int steps) {
        dailySteps += steps;
    }
    public double calculateDistance() {
        return dailySteps * kilometersPerStep;
    }

    public void calculateCalories() {
        caloriesBurned += caloriesPerStep * dailySteps;
    }
    public void updateHeartRate() {
        heartRate += 1;
    }
    public resetDailyStats(){
        dailySteps = 0;
        caloriesBurned = 0.0;
        heartRate = 0;
    }
    
}
