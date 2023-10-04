import java.text.DecimalFormat;
import java.math.RoundingMode;
public class LinearEquation {
            //Variables about first point
    private String x1ValueBeforeParse;
    private String y1ValueBeforeParse;
    private double x1Value;
    private double y1Value;

            //Variables about second point
    private String x2ValueBeforeParse;
    private String y2ValueBeforeParse;
    private double x2Value;
    private double y2Value;

            //Distance
    private double xDistance;
    private double yDistance;
    private double distance;

            //Variables about third point
    private String x3ValueBeforeParse;
    private double x3Value;
    private double y3Value;

            //Variables for slope and y intercept
    private double slope;
    private double yIntercept;


    public LinearEquation(String userInput1, String userInput2) {
        //Taking out values of first point
        x1ValueBeforeParse = userInput1.substring(1, userInput1.indexOf(","));
        y1ValueBeforeParse = userInput1.substring(userInput1.indexOf(",") + 1, userInput1.length()-1);
        //Taking out values of second point
        x2ValueBeforeParse = userInput2.substring(1, userInput2.indexOf(","));
        y2ValueBeforeParse = userInput2.substring(userInput2.indexOf(",") + 1, userInput2.length()-1);
        //Parsing values of first point
        x1Value = Double.parseDouble(x1ValueBeforeParse);
        y1Value = Double.parseDouble(y1ValueBeforeParse);
        //Parsing values of second point
        x2Value = Double.parseDouble(x2ValueBeforeParse);
        y2Value = Double.parseDouble(y2ValueBeforeParse);
    }

    public void calculateSlope() {
        slope = (y2Value - y1Value) / (x2Value - x1Value);
    }

    public void calculateYIntercept() {
        yIntercept = y1Value - (slope * x1Value);
    }

    public void calculateDistance() {
        xDistance = x2Value - x1Value;
        yDistance = y2Value - y1Value;
        distance = Math.hypot(xDistance, yDistance);

    }

    public void calculateYWithX(String x3ValueBeforeParse) {
        x3Value = Double.parseDouble(x3ValueBeforeParse);
        y3Value = (slope * x3Value) + yIntercept;
    }


    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        df.setRoundingMode(RoundingMode.HALF_UP);

        return "First pair: (" + x1Value + "," + y1Value + ")\n" +
                "Second pair: (" + x2Value + "," + y2Value + ")\n" +
                "Slope of line: " + slope +"\n" +
                "Y-intercept: " + yIntercept + "\n" +
                "Slope intercept form: y= " + yDistance + "/" + xDistance + " + " + yIntercept + "\n" +
                "Distance between two points: " + df.format(distance) + "\n";
    }

    public String printThirdPointInfo() {
        return "(" + x3Value + "," + y3Value + ")";
    }
}
