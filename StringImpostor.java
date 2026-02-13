package stringimpostor;

public class StringImpostor {

    public static int Indice(String s, char c, int n) {

        if (s == null || s.length() == 0) {
            return -1;
        }

        if (n < 0) {
            n = 0;
        }

        for (int i = n; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return i;
            }
        }

        return -1;
    }

    public static int UltimoIndice(String s, char c, int m) {

        if (s == null || s.length() == 0) {
            return -1;
        }

        if (m >= s.length()) {
            m = s.length() - 1;
        }

        if (m < 0) {
            return -1;
        }

        for (int i = m; i >= 0; i--) {
            if (s.charAt(i) == c) {
                return i;
            }
        }

        return -1;
    }

    public static String SinSangria(String s) {

        if (s == null || s.length() == 0) {
            return "";
        }

        int inicio = 0;
        int fin = s.length() - 1;

        while (inicio <= fin && s.charAt(inicio) == ' ') {
            inicio++;
        }

        while (fin >= inicio && s.charAt(fin) == ' ') {
            fin--;
        }

        if (inicio > fin) {
            return "";
        }

        return CortarString(s, inicio, fin + 1);
    }

    public static String CortarString(String s, int a, int b) {

        if (s == null || s.length() == 0) {
            return "";
        }

        if (a < 0) {
            a = 0;
        }

        if (b > s.length()) {
            b = s.length();
        }

        if (a >= b) {
            return "";
        }

        StringBuilder resultado = new StringBuilder();

        for (int i = a; i < b; i++) {
            resultado.append(s.charAt(i));
        }

        return resultado.toString();
    }

    public static void main(String[] args) {

        String s0 = "";
        String in1 = "Hola ¿que tal? ¡soy una String grande! AAAAAAAAAAA";

        System.out.println(Indice(s0, 'a', 0));
        System.out.println(Indice(in1, 'a', 0));
        System.out.println(Indice(in1, 'a', 15));
        System.out.println(Indice(in1, 'a', 35));

        System.out.println(UltimoIndice(s0, 'a', 0));
        System.out.println(UltimoIndice(in1, 'A', in1.length() - 1));
        System.out.println(UltimoIndice(in1, 'A', 40));
        System.out.println(UltimoIndice(in1, 'A', -1));

        System.out.println("|" + SinSangria("    HOLA    ") + "|");
        System.out.println("|" + SinSangria("       ") + "|");

        System.out.println(CortarString("Hola mundo", 0, 4));
        System.out.println(CortarString("Hola mundo", 4, 9));
    }
}