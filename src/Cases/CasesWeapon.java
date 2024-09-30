package Cases;

public class CasesWeapon implements Cases {


    @Override
    public void CasesEmpty() {

    }

    @Override
    public void CasesEnnemi() {

    }

    @Override
    public void CasesWeapon() {

        String message = toString();
       System.out.println(message);
   }

    @Override
    public void CasesPotion() {

    }

    public String toString(){
        return "Vous trouvez une arme, mais nul";
    }
}
