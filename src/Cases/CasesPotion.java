package Cases;

public class CasesPotion implements Cases{

    @Override
    public void CasesEmpty() {

    }

    @Override
    public void CasesEnnemi() {

    }

    @Override
    public void CasesWeapon() {

    }

    @Override
    public void CasesPotion() {

        String message = toString();
        System.out.println(message);
    }
    public String toString(){
        return "Vous trouvez une potion, mais elle est vide...";
    }
}
