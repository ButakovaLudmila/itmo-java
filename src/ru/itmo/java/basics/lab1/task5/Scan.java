//Задание 5
package ru.itmo.java.basics.lab1.task5;
//С использованием BufferedReader
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered
{
    public static void main(String[] args)

    throws IOException
    {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Введите первое число:");
        String a = reader.readLine();
        System.out.println("Введите второе число:");
        String b = reader.readLine();
        System.out.println("Введите третье число:");
        String c = reader.readLine();
        System.out.println("Первое число:");
        System.out.println(a);
        System.out.println("Второе число:");
        System.out.println(b);
        System.out.println("Третье число:");
        System.out.println(c);
    }
}
*/

//С использованием Scanner
import java.util.Scanner;

public class Scan
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = scanner.nextInt();

        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        System.out.println("Введите третье число:");
        int c = scanner.nextInt();

        System.out.println("Первое число " + a);
        System.out.println("Второе число " + b);
        System.out.println("Третье число " + c);



    }
}



