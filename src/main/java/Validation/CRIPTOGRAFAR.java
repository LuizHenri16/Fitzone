package Validation;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Base64;

public class CRIPTOGRAFAR {

    private static final String ALGORITHM = "AES";
    private static final String SECRET_KEY = "MySecurityPassword828282";

    public static String toSHA256(String texto) {

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(texto.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            DIALOG.exbirMensagem("Erro ao adicionar a criptografia");
        }
        return null;
    }

    public static String criptografarAES(String textoCriptografar) {

        try {

            Cipher cipher = Cipher.getInstance(ALGORITHM);
            SecretKeySpec keySpec = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, keySpec);
            byte[] valorCriptografado = cipher.doFinal(textoCriptografar.getBytes());

            return Base64.getEncoder().encodeToString(valorCriptografado);
        } catch (Exception e) {
            DIALOG.exbirMensagem("Erro ao adicionar a criptografia");
        }
        return null;
    }

    public static String decryptAES(String encryptedData) {

        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            SecretKeySpec keySpec = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, keySpec);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));

            return new String(decryptedBytes);
        } catch (Exception e) {
            DIALOG.exbirMensagem("Erro ao remover a criptografia");
        }
        return null;
    }

}
