import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

       
        System.out.println("\n--- Employee Details (Before Update) ---");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName.toUpperCase());  
        System.out.println("Department: " + department.trim()); 
        System.out.println("Salary: " + salary);


        if (args.length > 0) {
            String command = args[0].toLowerCase();

            switch (command) {
                case "bonus":
                    if (args.length >= 2) {
                        double bonus = Double.parseDouble(args[1]);
                        salary += bonus;
                        System.out.println("\nBonus of " + bonus + " added!");
                    } else {
                        System.out.println("\nPlease provide bonus amount!");
                    }
                    break;

                case "department":
                    if (args.length >= 2) {
                        department = args[1];
                        System.out.println("\nDepartment updated to: " + department);
                    } else {
                        System.out.println("\nPlease provide new department name!");
                    }
                    break;

                default:
                    System.out.println("\nInvalid command-line argument!");
                    break;
            }
        } else {
            System.out.println("\nNo command-line arguments provided.");
        }

       
        System.out.println("\n--- Employee Details (After Update) ---");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName.toUpperCase());
        System.out.println("Department: " + department);
        System.out.println("Updated Salary: " + salary);

        sc.close();
    }
}
