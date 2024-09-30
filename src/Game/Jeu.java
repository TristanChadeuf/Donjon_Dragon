package Game;

import Cases.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Jeu {
    public void jeu(){

        List<Cases>plateau = new ArrayList<Cases>();

        for (int i =0 ; i <= 3; i++ ) {

            new Scanner(System.in).nextLine();
            if(i == 0) {
                plateau.add(0, new CaseEmpty());

            }
            else if(i == 1) {
                plateau.add(1, new CasesEnnemi());


            }
            else if(i == 2) {
                plateau.add(2, new CasesWeapon());


            }
            else if(i == 3) {
                plateau.add(3, new CasesPotion());

            }
            System.out.println(plateau);

        }

    }

}
