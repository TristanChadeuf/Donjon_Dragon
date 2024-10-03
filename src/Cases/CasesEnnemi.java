package Cases;

 import figth.*;

public class CasesEnnemi implements Cases {

   public CasesEnnemi() {

       int dice = 1 + (int) (Math.random() * 3);
        if (dice == 1) {
            System.out.println("DRAGON ! WATCH OUT FOR FLAMES ");
            new figthDragon();
        }
        if (dice == 2) {
            System.out.println("Gobelin so boring ... ");
            new figthGobelin();
        }
        if (dice == 3) {
            System.out.println("OH PUTAIN FADA MONA LISA FUIT ");
            new figthMonaLisa();
        }
    }
}
