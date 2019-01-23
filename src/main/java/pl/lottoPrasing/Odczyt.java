package pl.lottoPrasing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Odczyt {
    //ta klasa przyjmuje adres url odczytuje plik i wyswietla wiadomosc koncową


    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.mbnet.com.pl/dl.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        // wyszukieanie lizczb cała logika aplikacji
//        String str;
//        while ((str = in.readLine()) != null){
//            System.out.println(str);
//
//        }


        System.out.println("Koniec");


        in.close();





    }
}

// wyniki pobierane z internetu
// odczyt pliku
// wpisanie własnego zestawu cyfr
// porównanie danych uzytkownia z danymi wpisanymi do internetu
// wyświtlenie odpowienidego komuniktatu

