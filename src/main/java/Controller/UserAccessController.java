package Controller;

import Entity.UserAccess;
import Service.UserAccessService;
import Validation.DIALOG;

import javax.naming.ldap.Control;
import javax.swing.*;
import java.util.List;

public class UserAccessController {

    public UserAccessController() {
    }

    public static UserAccess loginController(JTextField userNameLogin, JPasswordField passwordFieldLogin) {
        UserAccess usuario = null;

        String password = new String(passwordFieldLogin.getPassword());

        if (userNameLogin.getText().isBlank() && password.isBlank()) {
            DIALOG.exbirMensagem(null, "Digite seu login");
        } else if (userNameLogin.getText().isBlank()) {
            DIALOG.exbirMensagem(null, "Digite o nome de usuário");
        } else if (password.isBlank()) {
            DIALOG.exbirMensagem(null, "Digite a senha");
        } else {
            return UserAccessService.loginService(userNameLogin.getText() , password);
        }
        return null;
    }

    public static void cadastrarController(JTextField userNameLogin, JPasswordField passwordFieldLogin, JPasswordField passwordConfirmFieldLogin, JComboBox tipoUsuarioCombobox) {

        try {
            String password = new String(passwordFieldLogin.getPassword());
            String passwordConfirm = new String(passwordConfirmFieldLogin.getPassword());

            if (userNameLogin.getText().isBlank() && password.isBlank() && passwordConfirm.isBlank()) {
                DIALOG.exbirMensagem(null, "Preencha os campos para adicionar um novo usuário");
            } else if (userNameLogin.getText().isBlank()) {
                DIALOG.exbirMensagem(null, "Digite o nome de usuário");
            } else if (password.isBlank()) {
                DIALOG.exbirMensagem(null, "Digite a senha do usuário");
            } else if (password.length() < 8) {
                DIALOG.exbirMensagem(null, "A senha deve conter ao menos 8 caracteres");
            } else if (passwordConfirm.isBlank()) {
                DIALOG.exbirMensagem(null, "Digite a senha de confirmação");
            } else if (!passwordConfirm.equals(password)) {
                DIALOG.exbirMensagem(null, "As senhas não conferem");
            } else if (tipoUsuarioCombobox.getSelectedIndex() == 0) {
                DIALOG.exbirMensagem(null, "Selecione um tipo de acesso");
            } else {
                  UserAccessService.cadastrarService(userNameLogin.getText(), passwordConfirm, (String) tipoUsuarioCombobox.getSelectedItem());

            }

        } catch (Exception e) {
            DIALOG.exbirMensagem(null, "Ocorreu algum erro ao tentar adicionar o usuário");
        }
    }

    public static List<UserAccess> listarController() {
        List<UserAccess> lista = UserAccessService.listarService();

        return lista;
    }

    public static void apagarController(String id) {
        UserAccessService.apagarService(id);
    }
}
