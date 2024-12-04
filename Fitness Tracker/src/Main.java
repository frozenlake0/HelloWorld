public class Main {
    public static void main(String[] args) {
        FitnessTracker ft = new FitnessTracker();
        FitnessTracker ft2 = new FitnessTracker("", 66, 3000, 60, 60);
        ft2.addSteps(77);
        ft2.calculateDistance();
        System.out.println(ft2.calculateDistance());
        ft2.calculateCalories();
        System.out.println(double caloriesBurned);
        ft2.updateHeartRate();
        System.out.println(int heartRate)
    }
}