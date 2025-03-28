package Validation;

public class FORMAT {

    public static String converterData(String data) {


        return data;
    }
    public static String formatarData(String cpfFormatar) {
        String dataLimpo = cpfFormatar.replace("/", "").trim();

        return dataLimpo;
    }

    public static String formatarNumero(String telefoneFormatar) {
            String numeroLimpo = telefoneFormatar.replace("(", "").replace(")", "").replace("-", "").trim();
        return numeroLimpo;
    }

    public static String formatarCPF(String cpfFormatar) {
        String cpfLimpo = cpfFormatar.replace(".", "").replace("-", "").trim();

        return cpfLimpo;
    }

}

