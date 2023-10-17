public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    public LinearEquation(String point1, String point2) {
        x1 = Integer.parseInt(point1.substring(1, point1.indexOf(",")));
        y1 = Integer.parseInt(point1.substring(point1.indexOf(",") + 2, point1.indexOf(")")));
        x2 = Integer.parseInt(point2.substring(1, point2.indexOf(",")));
        y2 = Integer.parseInt(point2.substring(point2.indexOf(",") + 2, point1.indexOf(")")));

    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public void setFromPoints(String point1, String point2) {
        x1 = Integer.parseInt(point1.substring(1, point1.indexOf(",")));
        y1 = Integer.parseInt(point1.substring(point1.indexOf(",") + 2, point1.indexOf(")")));
        x2 = Integer.parseInt(point2.substring(1, point2.indexOf(",")));
        y2 = Integer.parseInt(point2.substring(point2.indexOf(",") + 2, point1.indexOf(")")));

    }

    public double distance() {
        return roundedToHundredth(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }

    public double slope() {
        return roundedToHundredth((double) (y2 - y1) / (x2 - x1));
    }

    public double yIntercept() {
        return roundedToHundredth(y1 - slope() * x1);
    }

    public String equation() {
        if (y1 == y2) {
            return "y = " + yIntercept();
        }
        return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x + " + yIntercept();
    }

    public Double coordinateForX(double x) {
        return slope() * x + yIntercept();
    }

    public String lineInfo() {
        String returnString = "";
        returnString += "The two points are: " + "(" + x1 + ", " + y1 + ")" + " and (" + x2 + ", " + y2 + ")\n";
        returnString += "The equation of the line between these points is: " + equation() + "\n";
        returnString += "The slope of this line is: " + slope() + "\n";
        returnString += "The y-intercept of this line is: " + yIntercept() + "\n";
        returnString += "The distance between these two points is: " + distance() + "\n";
        return returnString;
    }

    private double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100.0) / 100.0;
    }

}
