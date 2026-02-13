package stringimpostor;

class EjerciciosString {

    public static int ContarLetra(String s, char c) {
        if (s == null || s.isEmpty()) return 0;
        int contador = 0;
        int pos = s.indexOf(c);
        while (pos != -1) {
            contador++;
            pos = s.indexOf(c, pos + 1);
        }
        return contador;
    }

    public static String Filtrar1(String s1, String s2) {
        if (s1 == null || s1.isEmpty()) return "";
        String resultado = "";
        for (String palabra : s1.split("\\s+")) {
            if (palabra.contains(s2)) resultado += palabra + " ";
        }
        return resultado.trim();
    }

    public static String Filtrar2(String s1, String s2) {
        if (s1 == null || s1.isEmpty()) return "";
        String resultado = "";
        for (String palabra : s1.split("\\s+")) {
            if (palabra.startsWith(s2)) resultado += palabra + " ";
        }
        return resultado.trim();
    }

    public static String FiltrarCorreo(String s1, String s2) {
        if (s1 == null || s1.isEmpty()) return "";
        String resultado = "";
        for (String correo : s1.split("\\s+")) {
            if (correo.contains("@" + s2)) resultado += correo + " ";
        }
        return resultado.trim();
    }

    public static String FiltrarIP(String s1, String s2) {
        if (s1 == null || s1.isEmpty()) return "";
        String resultado = "";
        for (String ip : s1.split("\\s+")) {
            if (!ip.contains(s2)) resultado += ip + " ";
        }
        return resultado.trim();
    }

    public static String FiltrarFecha(String s1, String s2) {
        if (s1 == null || s1.isEmpty()) return "";
        int mes = 0;

        switch (s2.toUpperCase()) {
            case "ENERO": mes = 1; break;
            case "FEBRERO": mes = 2; break;
            case "MARZO": mes = 3; break;
            case "ABRIL": mes = 4; break;
            case "MAYO": mes = 5; break;
            case "JUNIO": mes = 6; break;
            case "JULIO": mes = 7; break;
            case "AGOSTO": mes = 8; break;
            case "SEPTIEMBRE": mes = 9; break;
            case "OCTUBRE": mes = 10; break;
            case "NOVIEMBRE": mes = 11; break;
            case "DICIEMBRE": mes = 12; break;
        }

        String mesStr = String.format("%02d", mes);
        String resultado = "";

        for (String fecha : s1.split("\\s+")) {
            if (!fecha.split("/")[1].equals(mesStr)) resultado += fecha + " ";
        }

        return resultado.trim();
    }
}
