package fitzoneapp.Controller;

import fitzoneapp.Model.LoginResponse;
import fitzoneapp.Repository.UserAccessRepository;
import fitzoneapp.Service.UserAccessService;
import fitzoneapp.Util.AccessType;
import fitzoneapp.View.loginView;
import fitzoneapp.View.mainView;
import javax.swing.JOptionPane;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserAccessController {

    private UserAccessService userAccessService = new UserAccessService();
    UserAccessRepository repository = new UserAccessRepository();
    private JTextField tfUserName;
    private JPasswordField tfPassword;

    public UserAccessController(JTextField tfUserName, JPasswordField tfPassword) {
        this.tfUserName = tfUserName;
        this.tfPassword = tfPassword;
    }

    public void addUser() {
        
        userAccessService.addUser("ADM", "ADM", AccessType.COMPLETO);
        
        System.out.println("Uuário cadastrado");
    }

    public void makeLogin() {

        if (tfPassword.getPassword() == null && tfUserName.getText().isBlank() || tfUserName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite os campos de usuário e senha");
        } else if (tfUserName.getText().isBlank() || tfUserName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o nome de usuário");
        } else if (tfPassword.getPassword() == null) {
            JOptionPane.showMessageDialog(null, "Digite a senha");
        } else {

            String userName = tfUserName.getText();
            String userPassword = new String(tfPassword.getPassword());

            LoginResponse response = userAccessService.makeLogin(userName, userPassword);

            if (response.isLoginResponse()) {
                mainView mainview = new mainView(response.getUserResponse().getName());
                mainview.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao entrar");
            }

        }

    }
}
