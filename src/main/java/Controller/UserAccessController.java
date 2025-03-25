package Controller;

import Entity.UserAccess;
import Service.UserAccessService;
import View.AvisoForm;

import javax.swing.*;
import java.util.List;

public class UserAccessController {

    public UserAccessController() {
    }

    public static UserAccess login(JTextField userNameLogin, JPasswordField passwordFieldLogin) {
        UserAccess usuario = null;

        return usuario;
    }

    public static void cadastrarController(JTextField userNameLogin, JPasswordField passwordFieldLogin, JPasswordField passwordConfirmFieldLogin, JComboBox tipoUsuarioCombobox) {

        try {
            String password = new String(passwordFieldLogin.getPassword());
            String passwordConfirm = new String(passwordConfirmFieldLogin.getPassword());

            if (userNameLogin.getText().isBlank() && password.isBlank() && passwordConfirm.isBlank()) {
                new AvisoForm(null, true, "Preencha os campos para adicionar um novo usuário").setVisible(true);
            } else if (userNameLogin.getText().isBlank()) {
                new AvisoForm(null, true, "Digite o nome de usuário").setVisible(true);
            } else if (password.isBlank()) {
                new AvisoForm(null, true, "Digite a senha do usuário").setVisible(true);
            } else if (password.length() < 8) {
                new AvisoForm(null, true, "A senha deve conter ao menos 8 caracteres").setVisible(true);
            } else if (passwordConfirm.isBlank()) {
                new AvisoForm(null, true, "Digite a senha de confirmação").setVisible(true);
            } else if (!passwordConfirm.equals(password)) {
                new AvisoForm(null, true, "As senhas não conferem").setVisible(true);
            } else if (tipoUsuarioCombobox.getSelectedIndex() == 0) {
                new AvisoForm(null, true, "Selecione um tipo de acesso").setVisible(true);
            } else {
                  UserAccessService.cadastrarService(userNameLogin.getText(), passwordConfirm, (String) tipoUsuarioCombobox.getSelectedItem());
            }

        } catch (Exception e) {
            new AvisoForm(null, true, "Ocorreu algum erro ao tentar adicionar o usuário").setVisible(true);
        }
    }

    public static List<UserAccess> listarController() {
        List<UserAccess> lista = UserAccessService.listarService();

        return lista;
    }

    public static void apagarController() {

    }
}
