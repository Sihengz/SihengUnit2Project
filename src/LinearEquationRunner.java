public class LinearEquationRunner {
    public static void main(String[] args) {
        LinearEquation le = new LinearEquation("(5, 6)", "(7, 8)");
        le.setFromPoints("(1, 1)", "(2, 3)");
        System.out.println(le.lineInfo());
        System.out.println(le.coordinateForX(5));

    }
}