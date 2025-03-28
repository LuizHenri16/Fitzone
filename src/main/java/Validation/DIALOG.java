package Validation;

import View.AvisoForm;

public class DIALOG {
    public static void exbirMensagem(java.awt.Frame parent,  String mensagem) {
        new AvisoForm(parent, true, mensagem).setVisible(true);
    }
}
