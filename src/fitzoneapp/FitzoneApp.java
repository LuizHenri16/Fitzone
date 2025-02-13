
package fitzoneapp;

import fitzoneapp.Controller.UserAccessController;
import fitzoneapp.Model.LoginResponse;
import fitzoneapp.Util.AccessType;
import fitzoneapp.Util.LoginMenu;
import fitzoneapp.Util.State;
import java.util.Scanner;

public class FitzoneApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        State ProgramaState = null;
        LoginMenu switchMenu = null;
        UserAccessController userAccessController = new UserAccessController();


        do {
            ProgramaState = State.Run;
            int menuLoginOpt;

            System.out.println("1 - Entrar\n" +
                    "2 - Criar Usuário\n" +
                    "3 - Sair");
            System.out.println("digite aqui: ");
            menuLoginOpt =Integer.parseInt(input.nextLine());

            switchMenu = switch (menuLoginOpt) {
                case 1 -> LoginMenu.LOGIN;
                case 2 -> LoginMenu.CRIAR_USUARIO;
                case 3 -> LoginMenu.SAIR;

                default -> LoginMenu.LOGIN;
            };

            switch (switchMenu) {
                case LOGIN -> {

                    System.out.println("Nome de Usuário:");
                    String name = input.nextLine();

                    System.out.println("Senha de Usuário:");
                    String password = input.nextLine();

                    LoginResponse response = userAccessController.makeLogin(name, password);

                    if (response.isLoginResponse()) {
                        System.out.println("tipo de acesso: " + response.getAccessTypeResponse());
                    } else {
                        System.out.println("Voltando ao menu incial");
                    }
                }
                case CRIAR_USUARIO -> {
                    AccessType accessType = null;
                    String name,password, passwordConfirm;
                    String securityCode = "FITZONEAPP_CODE";
                    String codeSecurityConfirm = null;

                    System.out.println("Nome de Usuário:");
                    name = input.nextLine();

                    System.out.println("---- Tipo acesso ----\n1 - Completo 2 - Parcial\nescolha:");
                    int accessTypeInt = Integer.parseInt(input.nextLine());
                    accessType = switch (accessTypeInt) {
                        case 1 -> AccessType.COMPLETO;
                        case 2 -> AccessType.PARCIAL;
                        default -> AccessType.PARCIAL;
                    };

                    do {
                        System.out.println("Senha de Usuário:");
                        password = input.nextLine();

                        System.out.println("Confirme a senha de Usuário:");
                        passwordConfirm = input.nextLine();

                        if (!password.equals(passwordConfirm)) {
                            System.out.println("Senha não confere");
                        }

                    } while (!password.equals(passwordConfirm)); // Aqui a estrutura será um pouco diferente, essas verificações devem ocorrer ao clicar no botão de criar usuário.
                                                                // Já aproveitando que teremos as telas. Substituiondo esse loop que roda o programa.

                    do {
                        System.out.println("Digite o código de segurança: ");
                        codeSecurityConfirm = input.nextLine();

                        if(!securityCode.equals(codeSecurityConfirm)) {
                            System.out.println("Código de segurança não confere.");
                        }
                    } while (!securityCode.equals(codeSecurityConfirm));

                    userAccessController.addUser(name, passwordConfirm, accessType);
                }
                case SAIR -> ProgramaState = State.Stop;
            }

        } while (ProgramaState != State.Stop);


        input.close();
    }
}
