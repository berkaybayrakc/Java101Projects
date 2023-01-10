package SalaryCalculator;

public class Employee {
    String info;
    String name;
    int salary;
    int workHours;
    int hireYear;
    int tax;
    int bonus;
    int raiseSalary;
    final int year = 2021;



    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if(salary < 1000){
            tax=0;
        }
        else if(salary > 1000) {
            tax = (salary*3)/100;
        }
        return tax;
    }

    public double bonus() {
        if(workHours >= 40) {
            this.bonus = (this.workHours*30);
        }
        return bonus;
    }

    public double raiseSalary() {
        if(year -hireYear < 10){
            this.raiseSalary = (this.salary*5)/100;
        }
        else if(year - hireYear >9 && year -hireYear<20) {
            this.raiseSalary = (this.salary*10)/100;
        }
        else if(year - hireYear >19) {
            this.raiseSalary = (this.salary*15)/100;
        }
        return raiseSalary;
    }

    public void employeeInformation() {
        info =  "İsim: " + this.name +'\n'
               +"Maaş: " + this.salary +'\n'
               +"Çalışma Saati: " + this.workHours +'\n'
               +"Başlangıç Yılı: " + this.hireYear +'\n'
               +"Vergi: " + tax()  +'\n'
               +"Bonus: " + bonus() +'\n'
               +"Maaş Artışı: " + raiseSalary() +'\n'
               +"Vergi ve Bonuslar ile birlikte maaş: "
               + (salary-tax()+bonus()) +'\n'
               +"Toplam Maaş: " + (salary-tax()+bonus()+raiseSalary()) +'\n';

        System.out.println(info);
    }
}
