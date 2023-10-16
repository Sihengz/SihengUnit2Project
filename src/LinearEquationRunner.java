public class LinearEquationRunner {
    public static void main(String[] args) {
        LinearEquation le = new LinearEquation("(5, 6)", "(7, 8)");
        le.setFromPoints("(5, 6)", "(7, 8)");
        System.out.println("num - " + le.getX1() + le.getX2() + le.getY1() + le.getY2());

    }
}