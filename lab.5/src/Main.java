import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String name;
    private String email;
    private double hourRate;
    private int capacity;
    private int freeDays;

    public Employee(String name, String email, double hourRate, int capacity, int freeDays) {
        this.name = name;
        this.email = email;
        this.hourRate = hourRate;
        this.capacity = capacity;
        this.freeDays = freeDays;
    }

    public double calculateDailyIncome() {
        return hourRate * capacity;
    }

    public double calculateMonthlyIncome() {
        return calculateDailyIncome() * (21 - freeDays);
    }
}

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter details for employee #" + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Hourly Rate: ");
            double hourRate = scanner.nextDouble();
            System.out.print("Daily Capacity: ");
            int capacity = scanner.nextInt();
            System.out.print("Free Days: ");
            int freeDays = scanner.nextInt();

            employees.add(new Employee(name, email, hourRate, capacity, freeDays));

            scanner.nextLine(); // Consume the newline character
        }

        System.out.println("\nMonthly Salaries:");
        for (int i = 0; i < numberOfEmployees; i++) {
            Employee employee = employees.get(i);
            System.out.println(employee.calculateMonthlyIncome() + " USD for " + employee.getName());
        }
    }
}
