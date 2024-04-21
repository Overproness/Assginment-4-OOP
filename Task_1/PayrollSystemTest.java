// M. Muntazar
// 470861
// PayrollSystemTest

package Task_1;

public class PayrollSystemTest {
    public static void main(String[] args) {
        // create subclass objects
        SalariedEmployee salariedEmployee = new SalariedEmployee("Alice", "Johnson", "555-55-5555", new Date(5, 12, 1998),
                900.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Ethan", "Garcia", "666-66-6666", new Date(6, 18, 1999),
                18.50, 37);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Emily", "Wang", "777-77-7777",
                new Date(7, 7, 1997), 12000, .05);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Michael", "Martinez",
                "888-88-8888", new Date(8, 24, 1996), 6000, .03, 250);


        // create four-element Employee array
        Employee[] employees = new Employee[4];

        // initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        int currentMonth = 1;
        System.out.printf("Payroll -> Month %d:%n%n", currentMonth);

        // generically process each element in array employees
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee); // invokes toString

            // determine whether element is a BasePlusCommissionEmployee
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                // downcast Employee reference to
                // BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
            }

            if (currentEmployee.getBirthDate().getMonth() == currentMonth)
                System.out.printf("earned $%,.2f - with a $100.00 bonus. Happy birthday%n%n",
                        currentEmployee.earnings() + 100);
            else
                System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }

        // get type name of each object in employees array
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getSimpleName());
        }
    }
}
