import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GoodDay goodDay = new GoodDay();
        Scanner sc = new Scanner(System.in);
        System.out.println("What did you eat for dinner ?");
        goodDay.setDinnerMeal(sc.nextLine());
        System.out.println("What was the temperature ?");
        goodDay.setTemperature(sc.nextInt());
        System.out.println("What was the humidity ?");
        goodDay.setHumidity(sc.nextDouble());
        System.out.println("Have you completed your home work today ? Note: response true/false");
        goodDay.setHomeworkDone(sc.nextBoolean());
        System.out.println(goodDay.toString());
/** Compound if statements */
        if (goodDay.isTodayGood(goodDay)) {
            System.out.println("Today was Good Day");
        } else {
            System.out.println("Today was Bad Day");
        }

        if (goodDay.isWeatherGood(goodDay)) {
            System.out.println("Today's weather was Good");
        } else {
            System.out.println("Today's weather Bad");
        }
    }
}