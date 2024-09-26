import java.util.Objects;

public class Employee {
    private String nameEmployee;
    private int sallary;
    private int numberDepartment;
    private static int count;
    private int id;

    public Employee(String nameEmployee, int sallary, int numberDepartment) {
        this.nameEmployee = nameEmployee;
        this.sallary = sallary;
        this.numberDepartment = numberDepartment;
        this.id=++count;
    }

    public int getCount() {
        return id;
    }
    public String getNameEmployee() {
        return this.nameEmployee;
    }

    public int getSallary() {
        return this.sallary;
    }

    public int getNumberDepartment() {
        return this.numberDepartment;
    }

    public void setSallary(int sallary) {
        this.sallary = sallary;
    }
    public void setNumberDepartment(int numberDepartment) {
        this.numberDepartment = numberDepartment;
    }
    @Override
    public boolean equals(Object object) {
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Employee employee = (Employee) object;
        return Objects.equals(nameEmployee, employee.nameEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nameEmployee);
    }

    @Override
    public String toString() {
        return "Ф.И.О: " + this.nameEmployee + "." + " Зарпалата: " + this.sallary + "." +
                " Отдел: " + this.numberDepartment + ".";
    }
}
