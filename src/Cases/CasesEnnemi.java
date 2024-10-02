package Cases;
 import Character.*;

public class CasesEnnemi implements Cases {

    Dragon dragon = new Dragon(2,10);

   public CasesEnnemi() {

        String message = toString();
        System.out.println(message);
    }
    public String toString(){

        return  "Graou je suis un ennemi" + dragon;
    }
}
