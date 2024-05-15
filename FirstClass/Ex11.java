import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        try (Scanner userAgeObj = new Scanner(System.in)) {
            System.out.println("Insert your age: ");
            int userAge = userAgeObj.nextInt();

            if (userAge >= 18) {
                System.out.println("Able to: AB license");
                if (userAge >= 21) {
                    System.out.println("Also able to D license");
                }
            } else {
                System.out.println("Unable to drive");
            }
        }
    }
}
