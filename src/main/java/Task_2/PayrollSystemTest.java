// M. Muntazar
// 470861
// PayrollSystemTest

package Task_2;

public class PayrollSystemTest {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee("Alice", "Johnson", "555-55-5555", 900.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Ethan", "Garcia", "666-66-6666", 18.50, 37);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Emily", "Wang", "777-77-7777", 12000, .05);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Michael", "Martinez",
                "888-88-8888", 6000, .03, 250);
        PieceWorker pieceWorker = new PieceWorker("Sophia", "Nguyen", "999-99-9999", 12, 55);


        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned",
                basePlusCommissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", pieceWorker, "earned", pieceWorker.earnings());


        Employee[] employees = new Employee[5];


        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorker;

        System.out.printf("Employees processed polymorphically:%n%n");


        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);


            if (currentEmployee instanceof BasePlusCommissionEmployee) {

                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
            }

            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }


        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getSimpleName());
        }
    }
}