public class Pythagorean {
    public String calculateHypotenuse(int legA, int legB) {
        double a = legA * legA;
        double b = legB * legB;
        double squareRoot = Math.sqrt(a + b);
        return "The Hypotenuse of lengths " + legA + " and " + legB + " is " + squareRoot;
    }
}