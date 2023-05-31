package com.polymorphism.example;


public class Main {
    static void p(Employee e1){
        e1.print();
    }
    public static void main(String[] args) {
        p(new HourlyEmployee());
        Employee employee = new Employee("Doha", "doha@gmail.com", "03044360787", "IT", "Isb", 1995, 3000);
        System.out.println(employee.getSalary());
        SaleredEmployee employee1 = new SaleredEmployee("Waseem", "doha1@gmail.com", "0304437650787", "ITI", "Isb", 1985, 3000, 200);
        System.out.println(employee1.getSalary());
        DailyEmployee dailyEmployee = new DailyEmployee("Jana", "doha1@gmail.com", "0304437650787", "ITI", "Isb", 1985, 4300, 600, 30);
        System.out.println(dailyEmployee.getSalary());
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Saja", "doha1@gmail.com", "0304437650787", "ITI", "Isb", 1985, 4300, 900, 30);
        System.out.println(hourlyEmployee.getSalary());

        Employee[] refArray = new Employee[4];

        refArray[0] = new Employee();
        refArray[1] = new DailyEmployee();
        refArray[2] = new HourlyEmployee();
        refArray[3] = new SaleredEmployee();

        for(int i =0 ; i < refArray.length ; i++){
            refArray[i].print();
        }
    }
}
