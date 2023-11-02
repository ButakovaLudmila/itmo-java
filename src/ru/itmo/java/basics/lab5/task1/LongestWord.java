package ru.itmo.java.basics.lab5.task1;

public class LongestWord {
    public String str;

    {
        str = "Грядут большие перемены в нашей жизни";
    }

    public void searchLongestWord() {
        int a = 0;
        int b = 0;
        String[] parts = str.split(" ");
        for (int i = 0; i < parts.length; i++) {
            int length = parts[i].length();
            if (a < length) {
                a = length;
                b = i;
            }
        }
        System.out.println("Самое длинное слово в тексте: " + str + ". Это слово: " + parts[b]);
    }

    public static void main(String[] args) {
        LongestWord res = new LongestWord();
        res.searchLongestWord();
    }
}
