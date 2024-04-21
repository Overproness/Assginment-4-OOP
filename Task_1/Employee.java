// M. Muntazar
// 470861
// Employee

package Task_1;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private Date birthDate;

    // constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s%nbirth date: %s", getFirstName(), getLastName(),
                getSocialSecurityNumber(), getBirthDate());
    }

    public abstract double earnings();
}
