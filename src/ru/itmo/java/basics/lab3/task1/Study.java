package ru.itmo.java.basics.lab3.task1;

class Study {

    private String course;
    private static final String str;

    static {
        str = "Изучение Java - это просто!";
    }

    public static String getCourse() {
        return str;
    }

    public Study(String n) {
        this.course = n;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study stud = new Study(Study.getCourse()); // создание объекта
        System.out.print(stud.printCourse()); //Вывод значения поля
    }
}