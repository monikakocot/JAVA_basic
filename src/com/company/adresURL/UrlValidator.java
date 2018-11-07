package com.company.adresURL;

import java.net.URL;

public class UrlValidator {

    String adres;

    public UrlValidator(String adres) {
        this.adres = adres;
    }

    public static boolean isValidURL(String adres){
        try
        {
            URL url = new URL(adres);
            url.toURI();
            System.out.println("Adres is correct");
            return true;

        } catch (Exception exception)
        {
            System.out.println("Adres is NOT correct");
            return false;
        }
    }
}
