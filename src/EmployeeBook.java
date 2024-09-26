public class EmployeeBook {
    private final Employee[] employee; // объявил массив Employee, Реализация через класс Employee
    private int workplace; // количество свободных мест для записи в книге

    public EmployeeBook() {
        this.employee = new Employee[10]; // Длина массива
    }

    public void addEmployee(String nameEmployee, int sallary, int numberDepartment) {
        if (workplace >= employee.length) {
            throw new RuntimeException("В книге нет места");
        } else {
            Employee newEmploye = new Employee(nameEmployee, sallary, numberDepartment);
            employee[workplace++] = newEmploye;
        }
    }

    public void printAllEmployee() {
        for (int i = 0; i < workplace; i++) {
            System.out.println(employee[i] + " " + " ID " + employee[i].getCount());
        }
    }

    public String findEmployeeId(int id) {
        for (int i = 0; i < workplace; i++) {
            if (employee[i].getCount() == id) {
                return employee[i] + " Id " + employee[i].getCount();
            }
        }
        return "Сотрудник не найден";
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getCount() == id) {
                System.out.println("Сотрудник вычеркнут " + employee[i] + " ID " + employee[i].getCount());

                System.arraycopy(employee, i + 1, employee, i, workplace - i - 1);
                employee[workplace - 1] = null;
                workplace--;
                return;
            }
        }
    }

    public int getWorkplace() {
        return workplace;
    }
}
