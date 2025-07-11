package Validation;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class CPF {

    public static boolean validar(String cpf) {
        CPFValidator validarCPF = new CPFValidator();

        try {
            validarCPF.assertValid(cpf);
            return true;
        } catch (InvalidStateException e ) {
            DIALOG.exbirMensagem("CPF inválido!");
            return false;
        }
    }
}
