package figth;
import Character.*;
import java.util.Scanner;

public class figthGobelin {
    //VARIABLES************************************************************************
    Gobelin gobelin = new Gobelin(1,15);
    Personage Heros = new Spell();

    private int attackGobelin = gobelin.getAttack();
    private int hpGobelin= gobelin.getLevelHealth();
    private int attackHeros = Heros.getAttack();
    private int hpHeros = Heros.getLevelHealth();
    String e = Character.toString(0x1F47A);
//GETTERS****************************************************************************


    public Gobelin getGobelin() {
        return gobelin;
    }
    public Personage getHeros() {
        return Heros;
    }

    //CONSTRUCTEUR*******************************************************************
    public figthGobelin() {
        System.out.println("COMBAT"+e+e+e+e+e+e+e+e);
        int choice = 0;
        System.out.println("      ,      ,\n" +
                "            /(.-\"\"-.)\\\n" +
                "        |\\  \\/      \\/  /|\n" +
                "        | \\ / =.  .= \\ / |\n" +
                "        \\( \\   o\\/o   / )/\n" +
                "         \\_, '-/  \\-' ,_/\n" +
                "           /   \\__/   \\\n" +
                "           \\ \\__/\\__/ /\n" +
                "         ___\\ \\|--|/ /___\n" +
                "       /`    \\      /    `\\\n" +
                "       /       '----'       \\");

        while(hpGobelin >= 0 || hpHeros >= 0) {
            while(choice !=1 && choice !=2 && choice !=3) {
                Scanner clavier = new Scanner(System.in);
                System.out.println("| Attack =   [1] | \n" + "| Flee =     [2] | \n" + "| Pass =     [3] |");
                choice = clavier.nextInt();
                if (choice == 1) {
                    System.out.println("HP Gobelin " + hpGobelin);
                    hpGobelin = hpGobelin - attackHeros;
                    System.out.println("Attack Heros " + attackHeros + " !" + "\nHP Gobelin  -" + attackHeros);
                    System.out.println("HP Gobelin " + hpGobelin);
                }
                if (choice == 2) {
                    hpGobelin = 0;
                    System.out.println("You are looser");
                }
                if (choice == 3) {
                    System.out.println("What ! YOU PREFER TO HANG OUT ");
                }
            }
            if (hpGobelin <= 0 || hpHeros <= 0) {
                break;
            }

            choice=0;
            new Scanner(System.in).nextLine();
            System.out.println("Round of Gobelin");
            System.out.println("HP Heros " + hpHeros);
            hpHeros = hpHeros - attackGobelin;
            System.out.println("Attack Gobelin  " + attackGobelin + " !" + "\nHP Heros  -" + attackGobelin);
            System.out.println("HP Heros " + hpHeros);

            if (hpGobelin <= 0 || hpHeros <= 0) {
                break;
            }

        }
        System.out.println("End of figth"+e+e+e+e+e+e);

    }
}

