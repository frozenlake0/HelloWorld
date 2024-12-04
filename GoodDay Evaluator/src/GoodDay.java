/**
 * @author Rehu St Louis
 */


/** declaring the public class GoodDay */

public class GoodDay {

    private int temperature;
    private double humidity;
    private boolean isHomeworkDone;
    private String dinnerMeal;

/** Initializing GoodDay to 0 */

    public GoodDay() {
        temperature = 0;
        humidity = 0.0;
        isHomeworkDone = false;
        dinnerMeal = "";
    }

/** Initializes GoodDay with accepted values */

    public GoodDay(int i, int i1, boolean b, String mashedPotato) {
        this.temperature = i;
        this.humidity = i1;
        this.isHomeworkDone = b;
        this.dinnerMeal = mashedPotato;
    }

    /** Getters and setters */

    public String getDinnerMeal() {
        return dinnerMeal;
    }

    public void setDinnerMeal(String dinnerMeal) {
        this.dinnerMeal = dinnerMeal;
    }

    public boolean isHomeworkDone() {
        return isHomeworkDone;
    }

    public void setHomeworkDone(boolean homeworkDone) {
        isHomeworkDone = homeworkDone;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

/** Boolean */
    public boolean isTodayGood(GoodDay goodDay) {
    return goodDay.isHomeworkDone() && goodDay.getTemperature() <= 90
            && goodDay.getTemperature() >= 75 && goodDay.getHumidity() <= 60
            && goodDay.getDinnerMeal() != null && !goodDay.getDinnerMeal().isEmpty();
    }

    public boolean isWeatherGood(GoodDay goodDay) {
        return goodDay.getTemperature() <= 90 && goodDay.getTemperature() >= 75
                && goodDay.getHumidity() <= 60;
    }

    @Override
    public String toString() {
        return "GoodDay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", isHomeworkDone=" + isHomeworkDone +
                ", dinnerMeal='" + dinnerMeal + '\'' +
                '}';
    }
}
