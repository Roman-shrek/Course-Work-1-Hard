public class EmployeeBook {
    private final Employee[] employees; // объявил массив Employee, Реализация через класс Employee
    private int workplace; // количество свободных мест для записи в книге

    public EmployeeBook() {
        this.employees = new Employee[10]; // Длина массива
    }

    public void addEmployee(String nameEmployee, int sallary, int numberDepartment) {
        if (workplace >= employees.length) {
            throw new RuntimeException("В книге нет места");
        } else {
            Employee newEmploye = new Employee(nameEmployee, sallary, numberDepartment);
            employees[workplace++] = newEmploye;
        }
    }

    public void printAllEmployee() {
        for (int i = 0; i < workplace; i++) {
            System.out.println(employees[i] + " " + " ID " + employees[i].getId());
        }
    }

    public String findEmployeeId(int id) {
        for (int i = 0; i < workplace; i++) {
            if (employees[i].getId() == id) {
                return employees[i] + " Id " + employees[i].getId();
            }
        }
        return "Сотрудник не найден";
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                System.out.println("Сотрудник вычеркнут " + employees[i] + " ID " + employees[i].getId());

                if (workplace - 1 > i){
                System.arraycopy(employees, i + 1, employees, i, workplace - i - 1);
                }
                employees[workplace - 1] = null;
                workplace--;
                break;
            }
        }
    }

    public int getWorkplace() {
        return workplace;
    }
}
