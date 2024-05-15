package SecondClass;
import java.util.Scanner;

public class Ex1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner currentPaymentObj = new Scanner(System.in);
        System.out.println("Insert your current payment:");
        double currentPayment = currentPaymentObj.nextDouble();

        Scanner serviceTimeObj = new Scanner(System.in);
        System.out.println("Insert how many years you worked:");
        int serviceTime = serviceTimeObj.nextInt();

        if (currentPayment < 500) {
            currentPayment = currentPayment * 1.25;
        } else if (currentPayment >= 500 && currentPayment < 1000) {
            currentPayment = currentPayment * 1.20;
        } else if (currentPayment >= 1000 && currentPayment < 1500) {
            currentPayment = currentPayment * 1.20;
        } else if (currentPayment >= 1500 && currentPayment < 2000) {
            currentPayment = currentPayment * 1.20;
        } else {
            currentPayment = currentPayment * 1;
        }

        if (serviceTime < 1) {
            currentPayment = currentPayment + 0;
        } else if (serviceTime >= 1 && serviceTime < 3) {
            currentPayment = currentPayment + 100;
        } else if (serviceTime >= 4 && serviceTime < 6) {
            currentPayment = currentPayment + 200;
        } else if (serviceTime >= 7 && serviceTime < 10) {
            currentPayment = currentPayment + 300;
        } else {
            currentPayment = currentPayment + 500;
        } 

        System.out.println("Current adjusted payment: " + currentPayment);
    }
}