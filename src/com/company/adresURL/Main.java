package com.company.adresURL;

import java.net.URL;
import java.util.Scanner;

/*
Check if user put correct URL adress
 */
public class Main {

    public static void main(String[] args) {



        System.out.println("Put the URL adres: ");
        Scanner sc = new Scanner(System.in);
        String adres = sc.next();

        System.out.println("First Method with URL class");
        UrlValidator.isValidURL(adres);

        System.out.println("First Method with substrings");


        if((adres.substring(0, 7).equalsIgnoreCase("http://"))
                && ((adres.substring((adres.length()-3),(adres.length())).equalsIgnoreCase(".pl")))
                ){

            System.out.println("Adres URL is correct");
            }  else if((adres.substring(0, 8).equalsIgnoreCase("https://"))
                && ((adres.substring((adres.length()-3),(adres.length())).equalsIgnoreCase(".pl")))
                ){

            System.out.println("Adres URL is correct");
        }

        else {
            System.out.println("Adres URL has to have format: http://xyxyxyxyx.pl");
        }

    }
}
