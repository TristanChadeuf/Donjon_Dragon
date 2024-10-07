package cases;

 import figth.*;

public class CasesEnemy implements Cases {

   public CasesEnemy() {

       int dice = 1 + (int) (Math.random() * 3);
        if (dice == 1) {
            System.out.println("DRAGON ! WATCH OUT FOR FLAMES ");
            new fightDragon();
        }
        if (dice == 2) {
            System.out.println("Goblin so boring... ");
            new fightGoblin();
        }
        if (dice == 3) {
            System.out.println("OH MONA LISA ");
            new fightMonaLisa();
        }
    }
}
