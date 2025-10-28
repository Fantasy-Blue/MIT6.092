
public class FooCorporation {

    public static void main(String[] args) {
        salarycalculator(7.5, 35);
        salarycalculator(8.2, 47);
        salarycalculator(10, 73);
    }

    public static void salarycalculator(double basepay, double hourworked) {
        double basesalary = basepay * hourworked;
        if (hourworked > 40) {
            basesalary += (hourworked - 40) * basepay * 1.5;
        }
        if (basepay < 8) {
            System.out.println("The base pay must not be less than the minimum wage ($8.00 an hour)");
        } else if (hourworked > 60) {
            System.out.println("error:the number of hours is greater than 60");
        } else {
            System.out.println(basesalary);
        }
    }
}
