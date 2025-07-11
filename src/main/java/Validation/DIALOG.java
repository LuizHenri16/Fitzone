package Validation;

import View.AvisoForm;

public class DIALOG {
    public static void exbirMensagem(String mensagem) {
        new AvisoForm(null,true, mensagem).setVisible(true);
    }
}
