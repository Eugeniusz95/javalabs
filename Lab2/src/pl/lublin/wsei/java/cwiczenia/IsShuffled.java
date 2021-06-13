package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;

public class IsShuffled {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        do{
            System.out.println("Wpisz tekst: (zamiast spacji wpisać '_'):");
            String text = scn.next();
            if(text.equals("0")) break;
            System.out.println("Wynik metody shuffle: "+ StringFun.shuffle(text));
        } while (true);
    }
}
