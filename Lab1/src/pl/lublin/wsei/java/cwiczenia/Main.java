package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String []args){
        // 30 randomowych liczb
//        int[] liczby = new int[30];
//        Random rnd = new Random();
//
//        for(int i = 0; i<30; i++){
//            liczby[i] = rnd.nextInt();
//
//        int mx = Integer.MIN_VALUE;
//        int mn = Integer.MAX_VALUE;
//        long avg = 0;
//        for(int l :  liczby)
//        {
//            System.out.println(l);
//            if(l<mn) mn = l;
//            if(l>mx) mx = l;
//            avg += l;
//        }
//            System.out.printf("MIN = %d, MAX =%d, AVG=%f,",mn,mx,(float)avg/liczby.length);

//        zmiana rejestru
//       Account acc= new Account();
//       acc.setName("yevhenii Solodkyi");
//       acc.name = "yevhenii Solodkyi";
//       System.out.println(acc.getName());
//       System.out.printf("%s%n",Account.capitalize("stanisŁaw maruSARz"));

//      trasnlit

       System.out.printf("%s%n",Account.translit("солодкий"));
      }

    }







