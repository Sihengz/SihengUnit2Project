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
        return round(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }

    private double round(double toRound) {
        return Math.round(toRound * 100.0) / 100.0;
    }



}
