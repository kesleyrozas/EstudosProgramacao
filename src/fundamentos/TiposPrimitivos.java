package fundamentos;

import java.util.Locale;

public class TiposPrimitivos {
    public static void main(String[] args) {
        String s = "Bom dia X";
        s.replace("X", "Senhora");
        s = s.toUpperCase();
        s.concat(",,!!");

        System.out.println(s);
    }
}
