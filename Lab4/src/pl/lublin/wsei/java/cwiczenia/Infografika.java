package pl.lublin.wsei.java.cwiczenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika{

    String tytul, adresStrony, szerokosc, wysokosc, adresGrafiki, adresMiniaturki;

    public Infografika(String text){

        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(text);

        if (m.find())
           tytul = m.group(1);
        else
            tytul = "";


        pat = Pattern.compile("<link>(.*)</link>");
        m = pat.matcher(text);

        if (m.find())
            adresStrony = m.group(1);
        else
            adresStrony = "";

        pat = Pattern.compile("width=\"(.*)\" height");
        m = pat.matcher(text);

        if (m.find())
            szerokosc = m.group(1);
        else
            szerokosc = "";

        pat = Pattern.compile("height=\"(.*)\"");
        m = pat.matcher(text);

        if (m.find())
            wysokosc = m.group(1);
        else
            wysokosc = "";

        // <media:content url="(.*.jpg)

        pat = Pattern.compile("<media:content url=\"(.*.jpg)");
        m = pat.matcher(text);

        if (m.find())
            adresGrafiki = m.group(1);
        else
            adresGrafiki = "";

        pat = Pattern.compile("<media:thumbnail url=\"(.*.jpg)");
        m = pat.matcher(text);

        if (m.find())
            adresMiniaturki = m.group(1);
        else
            adresMiniaturki = "";

//        System.out.println("Infografika: ");
//        System.out.println("\ttytul: " + tytul);
//        System.out.println("\tadres strony: " + adresStrony);
//        System.out.println("\tadres grafiki: " + adresGrafiki);
//        System.out.println("\tadres miniaturki: " + adresMiniaturki);
//        System.out.println("\trozmiary: " + Szerokosc + "x" + Wysokosc);


    }


    public void print() {
        System.out.println("\nInfografika: ");
        System.out.println("\ttytul: " + tytul);
        System.out.println("\tadres strony: " + adresStrony);
        System.out.println("\tadres grafiki: " + adresGrafiki);
        System.out.println("\tadres miniaturki: " + adresMiniaturki);
        System.out.println("\trozmiary: " + szerokosc + "x" + wysokosc);

    }
}
