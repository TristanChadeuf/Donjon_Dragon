package figth;

import character.*;
import enemy.Dragon;

import java.util.Scanner;

public class FightDragon extends Fight{
    //VARIABLES*********************************************************************************************************
    Dragon dragon = new Dragon();
    Personage Hero = new Mage();

    String emoticonFight = Character.toString(0x1F47A);

    //CONSTRUCTOR******************************************************************************************************
    public FightDragon() {
        System.out.println("COMBAT" + emoticonFight + emoticonFight + emoticonFight + emoticonFight + emoticonFight + emoticonFight + emoticonFight + emoticonFight);
        int choice = 0;
        System.out.println("""
                               ___====-_  _-====___
                           _--^^^#####//      \\\\#####^^^--_
                        _-^##########// (    ) \\\\##########^-_
                       -############//  |\\^^/|  \\\\############-
                     _/############//   (@::@)   \\\\############\\_
                    /#############((     \\\\//     ))#############\\
                   -###############\\\\    (oo)    //###############-
                  -#################\\\\  / VV \\  //#################-
                 -###################\\\\/      \\//###################-
                _#/|##########/\\######(   /\\   )######/\\##########|\\#_
                |/ |#/\\#/\\#/\\/  \\#/\\##\\  |  |  /##/\\#/  \\/\\#/\\#/\\#| \\|
                `  |/  V  V  `   V  \\#\\| |  | |/#/  V   '  V  V  \\|  '
                   `   `  `      `   / | |  | | \\   '      '  '   '
                                    (  | |  | |  )
                                   __\\ | |  | | /__
                                  (vvv(VVV)(VVV)vvv)""");
        int hpDragon = dragon.getLevelHealth();
        int hpHero = Hero.getLevelHealth();
        while (hpDragon >= 0 || hpHero >= 0) {
            while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
                Scanner clavier = new Scanner(System.in);
                System.out.println("""
                        | Attack =   [1] |\s
                        | Flee =     [2] |\s
                        | Pass =     [3] |
                        | Magic =    [4] |\s
                        | Potion =   [5] |""");
                choice = clavier.nextInt();
                if (choice == 1) {
                    System.out.println("HP Dragon " + hpDragon);
                    int attackHero = Hero.getAttack();
                    hpDragon = hpDragon - attackHero;
                    System.out.println("Attack Hero " + attackHero + " !" + "\nHP Dragon  -" + attackHero);
                    System.out.println("HP Dragon " + hpDragon);
                }

                if (choice == 2) {
                    hpDragon = 0;
                    System.out.println("You are looser");
                }

                if (choice == 3) {
                    System.out.println("What ! YOU PREFER TO HANG OUT ");
                }

                if (choice == 5) {
                    System.out.println(hpHero);
                    hpHero = hpHero + 3;
                    System.out.println("HP + 3");
                    System.out.println(hpHero);
                }

                if (choice == 4) {
                    int magicChoice;
                    System.out.println("""
                            | Fire Ball =    [1] |\s
                            | Blizzard =     [2] |\s
                            | Thunder =      [3] |""");
                    magicChoice = clavier.nextInt();
                    if (magicChoice == 1) {
                        System.out.println("HP Dragon " + hpDragon);
                        hpDragon = hpDragon - 14;
                        System.out.println("FIRE BALL \n HP Dragon " + hpDragon);
                    }
                    if (magicChoice == 2) {
                        System.out.println("HP Dragon " + hpDragon);
                        hpDragon = hpDragon - 25;
                        System.out.println("BLIZZARD \n HP Dragon " + hpDragon);
                    }
                    if (magicChoice == 3) {
                        System.out.println("HP Dragon " + hpDragon);
                        hpDragon = hpDragon - 12;
                        System.out.println("THUNDER \n HP Dragon " + hpDragon);
                    }
                }


            }
            if (hpDragon <= 0) {
                break;
            }

            choice = 0;
            new Scanner(System.in).nextLine();
            System.out.println("Round of dragon");
            System.out.println("HP Hero " + hpHero);
            int attackDragon = dragon.getAttack();
            hpHero = hpHero - attackDragon;
            System.out.println("Attack Dragon  " + attackDragon + " !" + "\nHP Hero  -" + attackDragon);
            System.out.println("HP Hero " + hpHero);

            if (hpHero <= 0) {
                break;
            }

        }
        System.out.println("End of fight" + emoticonFight + emoticonFight + emoticonFight + emoticonFight + emoticonFight + emoticonFight);

    }

}
