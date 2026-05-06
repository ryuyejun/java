package method;

public class Methodproblem1 {
    public static void main(String[] args) {
        System.out.println(average(15,25,35));
    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3;
        return average;
    }
}
