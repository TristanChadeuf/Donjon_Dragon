package Game;

import Cases.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Jeu {
    public void jeu() throws SQLException {

        List<Cases>plateau = new ArrayList<Cases>();

            plateau.add(0, new CasesEmpty());
            plateau.add(1, new CasesEnnemi());
            plateau.add(2, new CasesWeapon());
            plateau.add(3, new CasesPotion());



    }

}
