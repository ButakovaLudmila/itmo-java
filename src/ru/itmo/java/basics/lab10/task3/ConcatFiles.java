package ru.itmo.java.basics.lab10.task3;

import java.io.*;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class ConcatFiles {
    // Входные файлы
    List<Path> input = Arrays.asList(
            Paths.get("files/filein1.txt"),
            Paths.get("files/filein2.txt")
    );

    // Выходной файл
    Path output = Paths.get("files/fileout3.txt");

    public void concatFiles() {

        // Склеиваем файлы
        for (Path path : input) {
            List<String> strings = null;
            try {
                strings = Files.readAllLines(path);
                Files.write(output, strings, StandardOpenOption.CREATE,
                        StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ConcatFiles outfile= new ConcatFiles();
        outfile.concatFiles();
    }
}

