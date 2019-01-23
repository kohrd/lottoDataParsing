package pl.lottoPrasing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Odczyt {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.mbnet.com.pl/dl.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));





        in.close();





    }
}

// wyniki pobierane z internetu
// odczyt pliku
// wpisanie własnego zestawu cyfr
// porównanie danych uzytkownia z danymi wpisanymi do internetu
// wyświtlenie odpowienidego komuniktatu

