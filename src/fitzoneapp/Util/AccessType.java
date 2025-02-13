package fitzoneapp.Util;
 /**
  * Tipos de acesso dispoível no programa, para um controle melhor e com o intuito de padronizar o projeto.
  */

public enum AccessType {
    COMPLETO("Completo"),
    PARCIAL("Parcial");

    private String type;

    AccessType(String type) {
        this.type = type;
    }

     @Override
     public String toString() {
         return "AccessType{}";
     }
 }
