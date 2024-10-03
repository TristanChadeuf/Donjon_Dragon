package figth;
import Character.*;
import java.util.Scanner;

public class figthDragon {
//VARIABLES************************************************************************
    Dragon dragon = new Dragon(2,30);
    Personage Heros = new Spell();

    private int attackDragon = dragon.getAttack();
    private int hpDragon= dragon.getLevelHealth();
    private int attackHeros = Heros.getAttack();
    private int hpHeros = Heros.getLevelHealth();
    String e = Character.toString(0x1F47A);
//GETTERS****************************************************************************


    public Dragon getDragon() {
        return dragon;
    }
    public Personage getHeros() {
        return Heros;
    }

    //CONSTRUCTEUR*******************************************************************
    public figthDragon() {
        System.out.println("COMBAT"+e+e+e+e+e+e+e+e);
    int choice = 0;
            System.out.println("               ___====-_  _-====___\n" +
                    "           _--^^^#####//      \\\\#####^^^--_\n" +
                    "        _-^##########// (    ) \\\\##########^-_\n" +
                    "       -############//  |\\^^/|  \\\\############-\n" +
                    "     _/############//   (@::@)   \\\\############\\_\n" +
                    "    /#############((     \\\\//     ))#############\\\n" +
                    "   -###############\\\\    (oo)    //###############-\n" +
                    "  -#################\\\\  / VV \\  //#################-\n" +
                    " -###################\\\\/      \\//###################-\n" +
                    "_#/|##########/\\######(   /\\   )######/\\##########|\\#_\n" +
                    "|/ |#/\\#/\\#/\\/  \\#/\\##\\  |  |  /##/\\#/  \\/\\#/\\#/\\#| \\|\n" +
                    "`  |/  V  V  `   V  \\#\\| |  | |/#/  V   '  V  V  \\|  '\n" +
                    "   `   `  `      `   / | |  | | \\   '      '  '   '\n" +
                    "                    (  | |  | |  )\n" +
                    "                   __\\ | |  | | /__\n" +
                    "                  (vvv(VVV)(VVV)vvv)");
        while(hpDragon >= 0 || hpHeros >= 0) {
            while(choice !=1 && choice !=2 && choice !=3) {
                Scanner clavier = new Scanner(System.in);
                System.out.println("| Attack =   [1] | \n" + "| Flee =     [2] | \n" + "| Pass =     [3] |");
                choice = clavier.nextInt();
                if (choice == 1) {
                    System.out.println("HP Dragon " + hpDragon);
                    hpDragon = hpDragon - attackHeros;
                    System.out.println("Attack Heros " + attackHeros + " !" + "\nHP Dragon  -" + attackHeros);
                    System.out.println("HP Dragon " + hpDragon);
                }
                if (choice == 2) {
                    hpDragon = 0;
                    System.out.println("You are looser");
                }
                if (choice == 3) {
                    System.out.println("What ! YOU PREFER TO HANG OUT ");
                }
            }
                if (hpDragon <= 0 || hpHeros <= 0) {
                    break;
                }

            choice=0;
                new Scanner(System.in).nextLine();
                System.out.println("Round of dragon");
                System.out.println("HP Heros " + hpHeros);
                hpHeros = hpHeros - attackDragon;
                System.out.println("Attack Dragon  " + attackDragon + " !" + "\nHP Heros  -" + attackDragon);
                System.out.println("HP Heros " + hpHeros);

                if (hpDragon <= 0 || hpHeros <= 0) {
                    break;
                }

}
        System.out.println("End of figth"+e+e+e+e+e+e);

    }
}
