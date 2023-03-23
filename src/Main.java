public class Main {
    public static void main(String[] args) {

        EmployeeBook newBookEmployee = new EmployeeBook(10);

        newBookEmployee.addEmpl("Иванов Иван Иванович", 1, 80_000.00);
        newBookEmployee.addEmpl("Сидоров Сидор Сидорович", 2, 120_000.00);
        newBookEmployee.addEmpl("Любова Любовь Олеговна", 3, 150_000.00);
        newBookEmployee.addEmpl("Милков Станислав Алексеевич", 2, 100_000.00);
        newBookEmployee.addEmpl("Качергин Пантелей Пантелеевич", 4, 105_000.00);
        newBookEmployee.addEmpl("Тринитьев Нео Батькович", 4, 200_000.00);
        newBookEmployee.addEmpl("Дерден Тайлер Томпсонович", 4, 170_000.00);
        newBookEmployee.addEmpl("Мартынюк Иван Степанович", 1, 48_000.00);
        newBookEmployee.addEmpl("Новикова Елена Михайловна", 1, 30_000.00);
        newBookEmployee.addEmpl("Харламов Валерий Борисович", 5, 250_000.00);


        newBookEmployee.printListEmpl();
        System.out.println();
        System.out.println(newBookEmployee.sumSalaryMonth());
        System.out.println();
        System.out.println(newBookEmployee.minSalary());
        System.out.println();
        System.out.println(newBookEmployee.maxSalary());
        System.out.println();
        System.out.printf(String.format("%.2f", newBookEmployee.middleSalary()));
        System.out.println();
        System.out.println();
        newBookEmployee.printNameEmpl();
        System.out.println();
        newBookEmployee.indexEmployeeSalary(0.10);
        System.out.println();
        newBookEmployee.printListEmpl();
        System.out.println();
        System.out.println(newBookEmployee.minSalary(2));
        System.out.println();
        System.out.println(newBookEmployee.maxSalary(2));
        System.out.println();
        System.out.printf(String.format("%.2f", newBookEmployee.middleSalary(2)));
        System.out.println();
        newBookEmployee.indexEmployeeSalary(0.10, 2);
        System.out.println();
        newBookEmployee.printListEmpl();
        System.out.println();
        newBookEmployee.printListEmpl(2);
        System.out.println();
        newBookEmployee.printSalaryLess(90_000);
        System.out.println();
        newBookEmployee.printSalaryGreater(165_000.55);
        System.out.println();
        newBookEmployee.delEmpl("Харламов Валерий Борисович");
        System.out.println();
        newBookEmployee.printListEmpl();
        System.out.println();
        newBookEmployee.changeEmpl("Новикова Елена Михайловна", 2, 38_000);
        System.out.println();
        newBookEmployee.printListEmpl();
        System.out.println();
        newBookEmployee.printNameByDepartment();



    }
}