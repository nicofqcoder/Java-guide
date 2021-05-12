public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        // Extra $200
        salary += 200;
        System.out.println(salary);

        // Discount $50
        salary -= 50;
        System.out.println(salary);

        // Two extra hours $30 c/u
        // Food: $45
        salary = salary + (30*2) - 45;
        System.out.println(salary);
        // Updating text strings
        String employeeName = "Neymar";
        employeeName = employeeName + " Junior";
        System.out.println(employeeName);

        employeeName = "Futbol player " + employeeName;
        System.out.println("The captain is: " + employeeName);
    }
}
