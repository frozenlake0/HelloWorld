package tutorial;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Getting user input.
        String userInput = JOptionPane.showInputDialog("Enter a number, a space, unit: in or cm");
        int spacePos = userInput.indexOf(" ");
        double number = Double.parseDouble(userInput.substring(0, userInput.indexOf(" ")));
        String unit = userInput.substring(spacePos+ 1, userInput.length()).trim();

        //Convertion material.
        final double INCH = 1;
        final double FOOT = 12 * INCH;
        final double CUBIT = 18 * INCH;
        final double STEP = 2.5 * FOOT;
        final double YARD = 3 * FOOT;
        final double MILE = 5280 * FOOT;

        double num = 0;
        String u = null;

        //If statements.
        if (unit.equalsIgnoreCase("in")) {
            num = number;
            u = "in";
        } else if (unit.equalsIgnoreCase("ft")) {
            num = number * FOOT;
            u = "in";
        } else if (unit.equalsIgnoreCase("cu")) {
            num = number * CUBIT;
            u = "in";
        } else if (unit.equalsIgnoreCase("st")) {
            num = number * STEP;
            u = "in";
        } else if (unit.equalsIgnoreCase("yd")) {
            num = number * YARD;
            u = "in";
        } else if (unit.equalsIgnoreCase("mi")) {
            num = number * MILE;
            u = "in";
        } else {
            System.out.println("Invalid unit: Please enter 'in', 'ft', 'cu', 'st', 'yd', or 'mi'.");
            return;
        }
        //Output.
        System.out.println(number + " " + unit + " = " + num + " " + u);

    }
}