package ru.ifmo.base.lesson11.enums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;

public class EnumsHomeTask {
    public static void main(String[] args) throws IOException {
//        User user1 = new User("Petr Ivanov", 2000, Position.TRAINER);
//        User user2 = new User("Ivan Glyzin", 3000, Position.SPECIALIST);
//        User user3 = new User("Igor Sechin", 2000000, Position.BOSS);
//        User user4 = new User("Dima Leshev", 4500, Position.TRAINER);
//        User user5 = new User("Alex Somov", 21700, Position.SPECIALIST);
//        User user6 = new User("Levan Gogidze", 800, Position.TRAINER);

       /* User[] usersTrainer = new User[5];
        User[] usersSpecialist = new User[5];
        User[] usersBoss = new User[5];*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        EnumsHomeTask task = new EnumsHomeTask();
        ArrayList<User> users = new ArrayList<>();
        ArrayList<User> usersTrainer = new ArrayList<>();
        ArrayList<User> usersSpecialist = new ArrayList<>();
        ArrayList<User> usersBoss = new ArrayList<>();
        ArrayList<User> usersMaster = new ArrayList<>();


        System.out.println("Нажмите Enter для начала работы или q для выхода.");
        while (!reader.readLine().equals("q")) {
            users.add(task.inputUser());
        }
        System.out.println(users.get(1).position.name());
        for (int i = 0; i < users.size(); i++) {
            switch (users.get(1).position.name()) {
                case "TRAINER": usersTrainer.add(users.get(i)); break;
                case "SPECIALIST": usersSpecialist.add(users.get(i)); break;
                case "BOSS": usersBoss.add(users.get(i)); break;
                case "MASTER": usersMaster.add(users.get(i)); break;
            }
        }
        for (int i = 0; i < usersTrainer.size(); i++) {
            System.out.println(usersTrainer.get(i));
        }
    }

    public User inputUser() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        int salary;
        Position position;
        System.out.println("Введите данные пользователя в формате Имя Фамилия");
        name = reader.readLine();
        System.out.println("Введите зарплату пользователя:");
        salary = Integer.parseInt(reader.readLine());
        System.out.println("Введите первую букву должности:");
        switch (reader.readLine()) {
            case "T": position = Position.TRAINER; break;
            case "B": position = Position.BOSS; break;
            case "S": position = Position.SPECIALIST; break;
            case "M": position = Position.MASTER; break;
            default:
                throw new IllegalStateException("Unexpected value: " + reader.readLine());
        }
        return new User(name, salary,position);

    }

}

enum Position {
    TRAINER ("T"),
    BOSS("B"),
    SPECIALIST ("S"),
    MASTER ("M");

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    Position(String title) {
        this.title = title;
    }
}
