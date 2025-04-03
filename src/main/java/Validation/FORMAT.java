package Validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FORMAT {

    public static String converterData(String dataRecebida) {
        SimpleDateFormat formatoOriginal = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoMySQL = new SimpleDateFormat("yyyy-MM-dd");

        try {
            if (dataRecebida.matches("\\d{2}/\\d{2}/\\d{4}")) {
                Date data = formatoOriginal.parse(dataRecebida);
                return formatoMySQL.format(data);
            } else if (dataRecebida.matches("\\d{4}-\\d{2}-\\d{2}")) {
                Date data = formatoMySQL.parse(dataRecebida);
                return formatoOriginal.format(data);
            }
        } catch (ParseException e) {
            DIALOG.exbirMensagem(null, "Erro ao converter data");
        }
        return null;
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

