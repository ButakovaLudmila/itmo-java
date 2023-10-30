//Задание 1
package ru.itmo.java.basics.lab1.task1;

public class Main
{
    public static void main(String[] args)
    {

        String st1="Я хорошо знаю Java";
        String[] parts = st1.split(" ");

        /*for (int i = 0; i<parts.length; i++)
        {
            String res = parts[i];
            System.out.println(res);
        }*/

        //Цикл вывода слов в столбик
        for (String res : parts) {
            System.out.println(res);
        }

    }
}
