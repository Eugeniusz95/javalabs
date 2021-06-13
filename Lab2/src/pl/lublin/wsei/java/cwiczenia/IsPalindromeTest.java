package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;

public class IsPalindromeTest {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        do{
            System.out.println("Wpisz tekst (0 dla wyjścia):");
            String text = scn.next();
            if(text.equals("0")) break;
            System.out.println("Text:"+ text + " " + (StringFun.isPalindrome(text) ?"" : "nie ") + "jest palindromem");
        } while(true);
    }
}
