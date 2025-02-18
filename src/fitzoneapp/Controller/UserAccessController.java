package fitzoneapp.Controller;

import fitzoneapp.Model.LoginResponse;
import fitzoneapp.Service.UserAccessService;
import fitzoneapp.Util.AccessType;
import fitzoneapp.View.loginView;
import fitzoneapp.View.mainView;
import fitzoneapp.View.messageView;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserAccessController {

    private UserAccessService userAccessService = new UserAccessService();
    private loginView loginView;
    private JTextField tfUserName;
    private JPasswordField tfPassword;

    public UserAccessController(JTextField tfUserName, JPasswordField tfPassword, loginView loginView) {
        this.tfUserName = tfUserName;
        this.tfPassword = tfPassword;
        this.loginView = loginView;
    }

    public void addUser() {

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
