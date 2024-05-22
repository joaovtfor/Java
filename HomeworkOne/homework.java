package HomeworkOne;
import HomeworkOne.Hotel;

public class homework {
    public static void main(String[] args) {
        Hotel hotelOne = new Hotel();
        Hotel hotelTwo = new Hotel();

        hotelOne.name = "D'Napoles";
        hotelOne.foundationYear = 1980;
        hotelOne.clientsAmount = 100;
        hotelOne.employeesAmount = 20;
        hotelOne.roomCost = 349.99;

        hotelTwo.name = "Villa Vergueiro";
        hotelTwo.foundationYear = 1997;
        hotelTwo.clientsAmount = 40;
        hotelTwo.employeesAmount = 10;
        hotelTwo.roomCost = 149.99;

        hotelOne.showHotel();
        hotelOne.showAge();
        hotelOne.showProfit();

        hotelTwo.showHotel();
        hotelTwo.showAge();
        hotelTwo.showProfit();

    }
}