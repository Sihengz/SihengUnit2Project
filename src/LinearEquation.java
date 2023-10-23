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

    public void setFromPoints(String point1, String point2) {
        x1 = Integer.parseInt(point1.substring(1, point1.indexOf(",")));
        y1 = Integer.parseInt(point1.substring(point1.indexOf(",") + 2, point1.indexOf(")")));
        x2 = Integer.parseInt(point2.substring(1, point2.indexOf(",")));
        y2 = Integer.parseInt(point2.substring(point2.indexOf(",") + 2, point2.indexOf(")")));

    }

    public double distance() {
        return roundedToHundredth(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }

    public double slope() {
        return roundedToHundredth((double) (y2 - y1) / (x2 - x1));
    }

    public double yIntercept() {
        if (roundedToHundredth(y1 - slope() * x1)  % 1 == 0) {
            return (int) (Math.round(roundedToHundredth(y1 - slope() * x1)));

        }

        return roundedToHundredth(y1 - slope() * x1);

    }

    public String equation() {
        double y_inter = yIntercept();
        if (y1 == y2) {
            return "y = " + y_inter;
        } else if (slope() == 1) {
            return "y = " + "x + " + y_inter;
        } else if (slope() == -1) {
            return "y = " + "-x + " + y_inter;
        } else if (slope() % 1 == 0) {
            return "y = " + (int) slope() + "x + " + y_inter;
        }
        int denom = (x2 - x1);
        int numer = (y2 - y1);

        if (y_inter == 0) {
            if (y1 == y2) {
                return "y = 0";
            } else if (slope() == 1) {
                return "y = " + "x";
            } else if (slope() == -1) {
                return "y = " + "-x";
            } else if (slope() % 1 == 0) {
                return "y = " + (int) slope() + "x";
            }
            if (denom < 0 && numer > 0) {
                return "y = " + (numer * -1) + "/" + (denom * -1) + "x";
            } else if (denom < 0 && numer < 0) {
                return "y = " + (numer * -1) + "/" + (denom * -1) + "x";
            }

        }
        String operation = " + ";
        System.out.println("SDUIUHSDUHSDUH");

        if (yIntercept() < 0) {
            operation = " - ";
            y_inter = yIntercept() * -1;
        }
        if (y1 == y2) {
            return "y = " + y_inter;
        } else if (slope() == 1) {
            return "y = " + "x" + operation + y_inter;
        } else if (slope() == -1) {
            return "y = " + "-x" + operation + yIntercept();
        } else if (slope() % 1 == 0) {
            return "y = " + (int) slope() + "x" + operation + yIntercept();
        }
        if (denom < 0 && numer > 0) {
            return "y = " + (numer * -1) + "/" + (denom * -1) + "x" + operation + yIntercept();
        } else if (denom < 0 && numer < 0) {
            return "y = " + (numer * -1) + "/" + (denom * -1) + "x" + operation + yIntercept();
        }
        return "y = " + numer + "/" + denom + "x" + operation + yIntercept();
    }

    public String coordinateForX(double x) {
        return "(" + x + ", " + (slope() * x + yIntercept()) + ")";
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
