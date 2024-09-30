package Cases;

public class CasesEnnemi implements Cases {

    @Override
    public void CasesEmpty() {

    }

    @Override
   public void CasesEnnemi() {

        String message = toString();
        System.out.println(message);

    }

    @Override
    public void CasesWeapon() {

    }

    @Override
    public void CasesPotion() {

    }

    public String toString(){
        return "Graou je suis un ennemi";
    }
}
