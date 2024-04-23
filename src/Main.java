import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double grossSalary = scanner.nextDouble();

        if (grossSalary > 5000) {
           double tax18 = grossSalary * 0.18;
           double cleanSalary18 = grossSalary - tax18;
            System.out.println("Your clean salary (after tax 18%): " + cleanSalary18);
        } else {
            double tax10 = grossSalary * 0.10;
            double cleanSalary10 = grossSalary - tax10;
            System.out.println("Your clean salary (after tax 10%): " + cleanSalary10);
        }

    }
}