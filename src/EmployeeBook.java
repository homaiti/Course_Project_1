public class EmployeeBook {
    private Employee[] empl;

    public EmployeeBook(int size) {
        this.empl = new Employee[size];
    }

    //Добавление нового сотрудника
    public void addEmpl(String emplName, int department, double salary) {
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] == null) {
                empl[i] = new Employee(emplName, department, salary);
                return;
            }
        }
        System.out.println("Закончилось место");
    }

    //Удаление сотрудника
    public void delEmpl(String emplName) {
        for (int i = 0; i < empl.length; i++) {
            if (empl[i].getFullNameEmpl().equals(emplName)) {
                System.out.println(empl[i].getFullNameEmpl() + " удален");
                empl[i] = null;
                return;
            }
        }
    }

    //Изменение данных сотрудника
    public void changeEmpl(String emplName, int department, double salary) {
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] != null && empl[i].getFullNameEmpl().equals(emplName)) {
                empl[i].setDepartment(department);
                empl[i].setSalary(salary);
                System.out.println("Запись " + empl[i].getFullNameEmpl() + " была изменена");
                return;
            }
        }
        System.out.println("Запись " + emplName + " не найдена");
    }

    //Вывод всех сотрудников сгрупированных по подразделениям
    public void printNameByDepartment() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Отдел " + i + ": ");
            for (int j = 0; j < empl.length; j++) {
                if (empl[j] == null) {
                    continue;
                }
                if (empl[j].getDepartment() == i) {
                    System.out.println(empl[j].getFullNameEmpl() + " ");
                }
            }
            System.out.println();
        }

    }

    //Печать всех полей по всем сотрудникам
    public void printListEmpl() {

        for (Employee x:empl) {
            if (x == null) {
                return;
            }
            System.out.println("ID: " + x.getEmplId() + " Department: " + x.getDepartment() + " Name: "
                    + x.getFullNameEmpl() + " Salary: " + x.getSalary());
        }
    }

    //Печать всех полей по сотрудникам отдела(кроме отдела)
    public void printListEmpl(int department) {

        for (Employee x:empl) {
            if (x == null) {
                return;
            }
            if(x.getDepartment() == department)
                System.out.println("ID: " + x.getEmplId() + " Name: "
                        + x.getFullNameEmpl() + " Salary: " + x.getSalary());
        }
    }

    //Вернуть сумму всех зарплат

    public double sumSalaryMonth() {
        double sum = 0;
        for (int i = 0; i < empl.length && empl[i] != null; i++) {

            sum += empl[i].getSalary();
        }
        return sum;
    }

    //Найти сотрудника с минимальной зарплатой
    public Employee minSalary() {
        Employee min = null;
        for (Employee x : empl) {
            if (x == null) {
                break;
            }
            if (min == null || x.getSalary() < min.getSalary()) {
                min = x;
            }
        }
        return min;
    }

    //Найти сотрудника с минимальной зарплатой в отделе
    public Employee minSalary(int department) {
        Employee min = null;
        for (Employee x : empl) {
            if (x == null) {
                break;
            }
            if(x.getDepartment() == department) {
                if (min == null || x.getSalary() < min.getSalary()) {
                    min = x;
                }
            }
        }
        return min;
    }

    //Найти сотрудника с максимальной зарплатой
    public Employee maxSalary() {
        Employee max = null;
        for (Employee x : empl) {
            if (x == null) {
                break;
            }
            if (max == null ||x.getSalary() > max.getSalary()) {
                max = x;
            }
        }
        return max;
    }

    //Найти сотрудника с максимальной зарплатой в отделе
    public Employee maxSalary(int department) {
        Employee max = null;
        for (Employee x : empl) {
            if (x == null) {
                break;
            }
            if(x.getDepartment() == department) {
                if (max == null || x.getSalary() > max.getSalary()) {
                    max = x;
                }
            }
        }
        return max;
    }

    //Найти среднее значение по зарплате
    public double middleSalary() {
        double mid = 0;
        int emplSum = 0;
        for (Employee x:empl) {
            if (x == null) {
                break;
            }
            emplSum++;
            mid += x.getSalary();
        }
        mid /=emplSum;
        return mid;
    }
    //Найти среднее значение по зарплате в отделе
    public double middleSalary(int department) {
        double mid = 0;
        int emplSum = 0;
        for (Employee x:empl) {
            if (x == null) {
                break;
            }
            if(x.getDepartment() == department) {
                emplSum++;
                mid += x.getSalary();
            }
        }
        mid /=emplSum;
        return mid;
    }

    //Вывести в консоль все имена сотрудников
    public void printNameEmpl() {

        for (Employee x:empl) {
            if (x == null) {
                return;
            }
            System.out.println("Name: " + x.getFullNameEmpl());
        }
    }


    /*Индексация заработной платы на процент
    процент необходимо передавать
    Процент необходимо передавать в метод как параметр
    0.10 == 10%
    */
    public void indexEmployeeSalary(double percentIndex) {
        for (Employee x:empl) {
            if (x == null) {
                return;
            }
            x.setSalary(x.getSalary() + (x.getSalary() * percentIndex));
        }
    }
    /*Индексация заработной платы на процент В ОТДЕЛЕ
    процент необходимо передавать
    Процент необходимо передавать в метод как параметр
    0.10 == 10%
    */
    public void indexEmployeeSalary(double percentIndex, int department) {
        for (Employee x:empl) {
            if (x == null) {
                return;
            }
            if(x.getDepartment() == department) {
                x.setSalary(x.getSalary() + (x.getSalary() * percentIndex));
            }
        }
    }

    //Найти сотрудников с зарплатой меньше передаваемого параметра
    public void printSalaryLess(double number) {
        for (Employee x:empl) {
            if (x == null) {
                return;
            }
            if (x.getSalary() < number) {
                System.out.println("ID: " + x.getEmplId() + " Name: "
                        + x.getFullNameEmpl() + " Salary: " + x.getSalary());
            }
        }
    }

    //Найти сотрудников с зарплатой больше или равно передаваемого параметра
    public void printSalaryGreater(double number) {
        for (Employee x:empl) {
            if (x == null) {
                return;
            }
            if (x.getSalary() >= number) {
                System.out.println("ID: " + x.getEmplId() + " Name: "
                        + x.getFullNameEmpl() + " Salary: " + x.getSalary());
            }
        }
    }

}
