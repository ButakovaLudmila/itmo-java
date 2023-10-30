package ru.itmo.java.basics.lab3.task2;

public class Main {

        public static void main(String[] args) {
            Car car1 = new Car("BMW X1", 1500.5, Color.BLACK); // создание объекта 1
            Car car2=new Car(1000.0,Color.YELLOW); // Создание объекта 2
            car2.setModelBrand("KIA Picanto"); // установка значения ModelBrand
            //Car car2 = new Car("KIA Picanto", 1000.0, Color.YELLOW); // создание объекта 2
            System.out.println(car1.printCar()); //Вывод значения 1 объекта
            System.out.println(car2.printCar()); //Вывод значения 2 объекта
        }

}
