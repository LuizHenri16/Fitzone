package fitzoneapp.Controller;

import fitzoneapp.Model.LoginResponse;
import fitzoneapp.Service.UserAccessService;
import fitzoneapp.Util.AccessType;
import fitzoneapp.View.loginView;
import fitzoneapp.View.mainView;
import fitzoneapp.View.messageView;

import javax.swing.*;

public class UserAccessController {

    private UserAccessService userAccessService = new UserAccessService();
    private loginView loginView;
    private JTextField tfUserName;
    private JPasswordField tfPassword;

    private JTextField tfNewUser;
    private JPasswordField tfNewPassword;
    private JPasswordField passwordConfirm;
    private JComboBox cbAccessType;

    public UserAccessController(JTextField tfUserName, JPasswordField tfPassword, loginView loginView) {
        this.tfUserName = tfUserName;
        this.tfPassword = tfPassword;
        this.loginView = loginView;
    }
    
    public UserAccessController(JTextField tfNewUser, JPasswordField tfNewPassword, JPasswordField passwordConfirm, JComboBox cbAccessType) {
        this.tfNewUser = tfNewUser;
        this.tfNewPassword = tfNewPassword;
        this.passwordConfirm = passwordConfirm;
        this.cbAccessType = cbAccessType;
    }

    public void addUser() {

        try {
            String newUserName = tfNewUser.getText();
            String newPassword = new String(tfNewPassword.getPassword());
            String newPasswordConfirm = new String(passwordConfirm.getPassword());

            if (newUserName.isEmpty() || newUserName.isBlank()) {
                new messageView("O usuário precisa ter um nome", "Erro nome usuário").setVisible(true);
            } else if (newPassword.isEmpty() || newPassword.isBlank() || newPassword.length() < 8) {
                new messageView("Digite uma senha válida", "Erro de senha").setVisible(true);
            } else if (!newPasswordConfirm.equals(newPassword)) {
                new messageView("Senhas não conferem", "Erro de senha").setVisible(true);
            } else if (cbAccessType.getSelectedIndex() == 0) {
                new messageView("Selecione um tipo de usuário", "Tipo Usuário").setVisible(true);
            } else {
                AccessType newAccessType = null;

                if (cbAccessType.getSelectedIndex() == 1) {
                    newAccessType = AccessType.PARCIAL;
                } else if (cbAccessType.getSelectedIndex() == 2) {
                    newAccessType = AccessType.COMPLETO;
                }

                userAccessService.addUser(newUserName, String.valueOf(passwordConfirm), newAccessType);

                new messageView("Usuário cadastrado com sucesso!", "Usuário Cadastrado").setVisible(true);
            }

        } catch (Exception e) {

        }

        userAccessService.addUser("ADM", "ADM", AccessType.COMPLETO);  //Usuário para testes
        userAccessService.addUser("ADM2", "ADM2", AccessType.PARCIAL); //Usuário para testes

        System.out.println("Uuário cadastrado");
    }

    public void makeLogin() {
        
        String userName;
        String userPassword = new String(tfPassword.getPassword());
        
        if (tfUserName.getText().isBlank() || tfUserName.getText().isEmpty()) {
            new messageView("Digite o nome de usuário", "Erro Login").setVisible(true);
        } else if (userPassword.isBlank() || userPassword.isEmpty() ) {
            new messageView("Digite a senha", "Erro Login").setVisible(true);
        } else {

            userName = tfUserName.getText();
            userPassword = new String(tfPassword.getPassword());

            LoginResponse response = userAccessService.makeLogin(userName, userPassword);

            if (response.isLoginResponse()) {
                mainView mainview = new mainView(response);
                mainview.setVisible(true);
                loginView.dispose();

            } else {
                new messageView("Usuário incorreto", "Erro Login").setVisible(true);
            }

        }

    }
}
