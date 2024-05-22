package HomeworkOne;

public class Hotel {
    int clientsAmount;
    int employeesAmount;
    String name;
    int foundationYear;
    double roomCost;

    void showHotel() {
        System.out.println("Name: " + name);
        System.out.println("Foundation Year: " + foundationYear);
        System.out.println("Employees Amount: " + employeesAmount);
        System.out.println("\nClient Amount: " + clientsAmount);
    }

    double showProfit() {
        double profit = roomCost * clientsAmount;
        System.out.println("\nProfit: " + profit);
        return profit;
    }

    int showAge() {
        int actualYear = 2024;
        int difference = actualYear - foundationYear;

        System.out.println("\nAge: " + difference);
        return difference;
    }
}
