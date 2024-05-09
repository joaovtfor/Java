import java.util.Scanner;

public class Ex10 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner workedHoursObj = new Scanner(System.in);
        System.out.println("Insert the amount of worked hours: ");
        int workedHours = workedHoursObj.nextInt();

        Scanner hourValueObj = new Scanner(System.in);
        System.out.println("Insert the hours price: ");
        double hourValue = hourValueObj.nextDouble();

        Scanner extraHoursObj = new Scanner(System.in);
        System.out.println("Insert how many extra hours you worked: ");
        double extraHours = extraHoursObj.nextDouble();

        double regularHoursPayment = workedHours * hourValue;
        double extraHoursPayment = extraHours * (hourValue * 1.5);

        double totalPaymentSum = regularHoursPayment + extraHoursPayment;

        System.out.println("Total salary: " + totalPaymentSum);
    }
}
