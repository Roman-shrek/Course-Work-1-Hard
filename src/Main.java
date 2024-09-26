public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Иванов Алексей Сергеевич", 65_000, 1);
        employeeBook.addEmployee("Тихонов Семен Павлович", 87_000, 1);
        employeeBook.addEmployee("Дмитриев Егор Олегович", 43_000, 3);
        employeeBook.addEmployee("Крутов Роман Сергеевич", 70_000, 5);
        employeeBook.addEmployee("Смиронов Игорь Романович", 74_000, 2);
        employeeBook.addEmployee("Денисов Сергей Валерьевич", 59_000, 1);
        employeeBook.addEmployee("Семенов Игорь Валерьевич", 78_000, 1);


        employeeBook.printAllEmployee();    // Печатать всех сотрудников
        System.out.println("Записано сотрудников " + " " + employeeBook.getWorkplace()); // Заполненные места в книге
        // Метод вычеркнуть сотрудника
        employeeBook.removeEmployee(4);

        System.out.println("Поиск по Id");// Поиск сотрудника по Id
        System.out.println(employeeBook.findEmployeeId(5));

    }
}

