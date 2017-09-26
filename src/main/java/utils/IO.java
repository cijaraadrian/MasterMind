package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IO {

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public String read(String title, int length) {
        String input = "";
        boolean ok = false;
        do {
            this.write(title);
            try {
                input = bufferedReader.readLine();
                ok = input.length() == length;
            } catch (Exception ex) {
                this.write("Error de cadena de caracteres");
            }
        } while (!ok);
        return input;
    }

    public void write(String string) {
        System.out.println(string);
    }

}
