public class LinearEquationRunner {
    public static void main(String[] args) {
        LinearEquation le = new LinearEquation("(5, 6)", "(7, 8)");
        le.setFromPoints("(1, 1)", "(2, 5)");
        System.out.println("num - " + le.getX1() + le.getX2() + le.getY1() + le.getY2());
        System.out.println(le.distance());
        System.out.println(le.slope());
        System.out.println(le.yIntercept());
        System.out.println(le.equation());

    }
}