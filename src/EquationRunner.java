import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //User input for first two points
        System.out.print("Enter your first Coordinate Point: ");
        String firstPoint = s.nextLine();
        System.out.print("Enter your second Coordinate Point: ");
        String secondPoint = s.nextLine();

        //Creates an instance calculator of LinearEquation class and calls a few methods to calculate
        LinearEquation calculator = new LinearEquation(firstPoint, secondPoint);
        calculator.calculateDistance();
        calculator.calculateSlope();
        calculator.calculateYIntercept();

        //Prints info about the two points
        String info = calculator.toString();
        System.out.println(info);

        //Asks user for third x value
        System.out.print("Enter a third x-value: ");
        String thirdXValue = s.nextLine();
        s.close();


        //Calculates and prints the complete third point
        calculator.calculateYWithX(thirdXValue);
        String thirdPoint = calculator.printThirdPointInfo();
        System.out.println(thirdPoint);
    }
}
