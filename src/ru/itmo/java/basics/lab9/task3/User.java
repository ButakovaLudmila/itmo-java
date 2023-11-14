package ru.itmo.java.basics.lab9.task3;

import java.util.*;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public static Map<User, Integer> fillMap() {
        User usr1 = new User("Ivan");
        User usr2 = new User("Feodor");
        User usr3 = new User("Filipp");
        User usr4 = new User("Egor");
        int pointUsr1 = 10;
        int pointUsr2 = 20;
        int pointUsr3 = 30;
        int pointUsr4 = 40;
        Map<User, Integer> map = new HashMap<>();
        map.put(usr1, pointUsr1);
        map.put(usr2, pointUsr2);
        map.put(usr3, pointUsr3);
        map.put(usr4, pointUsr4);
        return map;
    }

    public void printPoint() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Список игроков: ");
        for (Map.Entry<User, Integer> user : fillMap().entrySet()) {
            User name = user.getKey();
            System.out.print(name.getName() + ", ");
        }
        System.out.println();
        System.out.print("Введите имя игрока, чтобы посмотреть баллы: ");
        String nameUser = scanner.next();
        for (Map.Entry<User, Integer> pair : fillMap().entrySet()) {
            User name = pair.getKey();
            Integer pairValue = pair.getValue();
            if (Objects.equals(name.getName(), nameUser)) {
                System.out.print("У игрока " + name.getName() + " " + pairValue + " баллов");
            }
        }

    }

    public static void main(String[] args) {
        User user = new User();
        user.printPoint();
    }
}
