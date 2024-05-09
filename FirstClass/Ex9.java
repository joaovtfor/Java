public class Ex9 {
    public static void main(String[] args) {
        
        String name = "Dreslei";
        double grade  = 5.5;
        double testGrade  = 9.5;

        double averageGrade = (grade + testGrade) / 2;

        if (averageGrade >= 7) {
            System.out.println(name + " is approved with the average grade of " + averageGrade);
        } else {
            System.out.println(name + " isn't approved, because of the average grade of " + averageGrade);
        }
    }
}
