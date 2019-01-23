package pl.lottoPrasing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OprNaPliku {

    public int[] sprawdzListeLiczb(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("podaj 6 liczb z zakresu 1 - 49");
        int [] tablcaLiczb = new int[6];
        for (int i = 0; i<tablcaLiczb.length; i++){
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
                System.err.println("niewałaściwa liczba");
            } catch (InivalidNumber in) {
                System.err.println("liczba poza zakresem");
            }
        } while (!poprawnie);
        return j;
    }

}
