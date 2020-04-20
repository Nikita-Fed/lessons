package ru.ifmo.base.lesson11.enums;

public class User {
    private String fullName;
    private int salary;

    public User(String fullName, int salary, Position position) {
        this.fullName = fullName;
        setSalary(salary);
        this.position = position;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getSalary() {
        return salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setSalary(int salary) {
        if (salary > 0)
        this.salary = salary;
    }

    Position position;

    @Override //это добавил в последний момент так как не работает вывод массива...
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", position=" + position +
                '}';
    }
}
