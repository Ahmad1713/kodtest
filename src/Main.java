public class Main {


    public static void main(String args[]) {

    }

    public static StringBuffer printNumbers() {
        StringBuffer numbers = new StringBuffer();
        for(int i=0; i<=10; i++) {
            System.out.println(i + "\n");
            numbers.append(String.valueOf(i));
        }

        return numbers;
    }

    public static double calculateAreaOfATriangle(double base, double height) {
        /*
            The area A of a triangle is given by the formula A=0.5 * b * h where b is the base and h is the height of the triangle.
         */

        double area = 0.5 * base * height;
        return area;

    }


}
