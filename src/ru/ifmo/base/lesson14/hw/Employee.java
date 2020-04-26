package ru.ifmo.base.lesson14.hw;

// Создать список объетов List<Employee> (использовать метод employeeGenerator)
// и сортировать по:
// имени
// имени и зарплете
// имени, зарплете, возрасту и компании

import java.util.*;

public class Employee {
    private String name;
    private String company;
    private int salary;
    private int age;

    // TODO: конструктор, геттеры и сеттеры


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, String company, int salary, int age) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public static List<Employee> employeeGenerator(int num) {
        Random random = new Random();
        // метод для создания списка объектов класса Employee
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        List<Employee> employees = new ArrayList<>(num);

        // добавление num объектов Employee в список (employees)
        for (int i = 0; i < num; i++) {
            employees.add(new Employee(names[random.nextInt(names.length)],companies[random.nextInt(companies.length)],(random.nextInt(1000)+1000),(random.nextInt(40)+21))); // TODO: объекты создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп
        }
        return employees;
    }

    public static void main(String[] args) {
        List<Employee> workers = employeeGenerator(16);
        workers.forEach(System.out::println);
        Comparator<Employee> empNameComparator = new EmpNameComparator();
        Comparator<Employee> empNameSalComparator = new EmpNameComparator().thenComparing(new EmpSalComparator());
        Comparator<Employee> fullComparator = new EmpNameComparator().thenComparing(new EmpSalComparator()).thenComparing(new EmpAgeComparator()).thenComparing(new EmpCompanyComparator());

        System.out.println("-----------------------------------------------");
        Collections.sort(workers,empNameComparator);
        workers.forEach(System.out::println);

        System.out.println("-----------------------------------------------");
        Collections.sort(workers,empNameSalComparator);
        workers.forEach(System.out::println);

        System.out.println("-----------------------------------------------");
        Collections.sort(workers,fullComparator);
        workers.forEach(System.out::println);

    }
}

class EmpNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class EmpSalComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}

class EmpAgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

class EmpCompanyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getCompany().compareTo(o2.getCompany());
    }
}
