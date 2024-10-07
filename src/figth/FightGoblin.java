package figth;

import character.*;
import enemy.Goblin;

import java.util.Scanner;

public class FightGoblin extends Fight {
    //VARIABLES*********************************************************************************************************
    Goblin goblin = new Goblin();
    Personage Hero = new Mage();
    String emoticonFight = Character.toString(0x1F47A);

//GETTERS***************************************************************************************************************


    public Goblin getGoblin() {
        return goblin;
    }

    public Personage getHero() {
        return Hero;
    }

    //CONSTRUCTOR*******************************************************************************************************
    public FightGoblin() {
        System.out.println("COMBAT" + emoticonFight + emoticonFight + emoticonFight + emoticonFight + emoticonFight + emoticonFight + emoticonFight + emoticonFight);
        int choice = 0;
        System.out.println("""
                      ,      ,
                            /(.-""-.)\\
                        |\\  \\/      \\/  /|
                        | \\ / =.  .= \\ / |
                        \\( \\   o\\/o   / )/
                         \\_, '-/  \\-' ,_/
                           /   \\__/   \\
                           \\ \\__/\\__/ /
                         ___\\ \\|--|/ /___
                       /`    \\      /    `\\
                       /       '----'       \\\
                """);

        int hpGoblin = goblin.getLevelHealth();
        int hpHero = Hero.getLevelHealth();
        while (hpGoblin >= 0 || hpHero >= 0) {
            while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
                Scanner clavier = new Scanner(System.in);
                System.out.println("""
                        | Attack =   [1] |\s
                        | Flee =     [2] |\s
                        | Pass =     [3] |\s
                        | Magic =    [4] |\s
                        | Potion =   [5] |""");
                choice = clavier.nextInt();
                if (choice == 1) {
                    System.out.println("HP Goblin " + hpGoblin);
                    int attackHero = Hero.getAttack();
                    hpGoblin = hpGoblin - attackHero;
                    System.out.println("Attack Hero " + attackHero + " !" + "\nHP Goblin  -" + attackHero);
                    System.out.println("HP Goblin " + hpGoblin);
                }
                if (choice == 2) {
                    hpGoblin = 0;
                    System.out.println("You are looser");
                }
                if (choice == 3) {
                    System.out.println("What ! YOU PREFER TO HANG OUT ");
                }
                if (hpHero <= 0) {
                    clavier.close();
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
                        System.out.println("HP Goblin " + hpGoblin);
                        hpGoblin = hpGoblin - 14;
                        System.out.println("FIRE BALL \n HP Goblin " + hpGoblin);
                    }
                    if (magicChoice == 2) {
                        System.out.println("HP Goblin " + hpGoblin);
                        hpGoblin = hpGoblin - 25;
                        System.out.println("BLIZZARD \n HP Goblin " + hpGoblin);
                    }
                    if (magicChoice == 3) {
                        System.out.println("HP Goblin " + hpGoblin);
                        hpGoblin = hpGoblin - 12;
                        System.out.println("THUNDER \n HP Goblin " + hpGoblin);
                    }
                }
            }
            if (hpGoblin <= 0 || hpHero <= 0) {
                break;
            }


            choice = 0;
            new Scanner(System.in).nextLine();
            System.out.println("Round of Goblin");
            System.out.println("HP Hero " + hpHero);
            int attackGoblin = goblin.getAttack();
            hpHero = hpHero - attackGoblin;
            System.out.println("Attack Goblin  " + attackGoblin + " !" + "\nHP Hero  -" + attackGoblin);
            System.out.println("HP Hero " + hpHero);

            if (hpHero <= 0) {
                break;
            }

        }
        System.out.println("End of fight" + emoticonFight + emoticonFight + emoticonFight + emoticonFight + emoticonFight + emoticonFight);

    }
}

