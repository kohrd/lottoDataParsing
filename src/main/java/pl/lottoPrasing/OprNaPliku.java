package pl.lottoPrasing;

import javafx.beans.property.IntegerProperty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OprNaPliku {

    public int[] sprawdzListeLiczb() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        wyswieltKomunikat("podaj 6 liczb z zakresu 1 - 49");
        int[] tablcaLiczb = new int[6];
        for (int i = 0; i < tablcaLiczb.length; i++) {
            tablcaLiczb[i] = sprawdzLiczbe(br);

        }
        return tablcaLiczb;
    }

    public int sprawdzLiczbe(BufferedReader bufferedReader) {
        boolean poprawnie = false;
        int j = 0;
        do {
            try {
                try {
                    j = Integer.parseInt(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (j < 1 || j > 49) {
                    throw new InivalidNumber();
                } else {
                    poprawnie = true;
                }
            } catch (NumberFormatException nfe) {
                wyswieltBlad("niewałaściwa liczba");
            } catch (InivalidNumber in) {
                wyswieltBlad("liczba poza zakresem");
            }
        } while (!poprawnie);
        return j;
    }

    public int[] zmianaStringNaInt(String str) {
        String[] tab = str.substring(str.lastIndexOf(" ") + 1).split(",");
        int[] numbers = new int[6];
        for (int i = 0; i < tab.length; i++) {
            numbers[i] = Integer.parseInt(tab[i]);
        }
        Arrays.sort(numbers);
        return numbers;
    }

    public String wyswietlDate(String str){
        return str.substring(str.indexOf(" ")+1, str.lastIndexOf(" ")+1);

    }

    public void wyswieltBlad(String str){
        System.err.println(str);
    }

    public void wyswieltKomunikat(String str){
        System.out.println(str);
    }
}
