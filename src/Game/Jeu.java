package Game;

import Cases.*;

import java.util.ArrayList;
import java.util.List;

public class Jeu {
    public void jeu(){

        List<Cases>plateau = new ArrayList<Cases>();

            plateau.add(0, new CaseEmpty());
            plateau.add(1, new CasesEnnemi());
            plateau.add(2, new CasesWeapon());
            plateau.add(3, new CasesPotion());

            System.out.println(plateau);

    }

}
