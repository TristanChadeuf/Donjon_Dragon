package figth;

import character.*;
import enemy.MonaLisa;

import java.util.Scanner;

public class fightMonaLisa {
    //VARIABLES*****************************************************************************************************
    MonaLisa monaLisa = new MonaLisa(3, 50);
    Personage Hero = new Spell();
    String emoticonFight = Character.toString(0x1F47A);

    //CONSTRUCTOR*******************************************************************
    public fightMonaLisa() {
        System.out.println("FIGHT" + emoticonFight + emoticonFight + emoticonFight + emoticonFight + emoticonFight + emoticonFight + emoticonFight + emoticonFight);
        int choice = 0;
        System.out.println("""
                          ____ \s
                        o8%8888,   \s
                      o88%8888888. \s
                     8'-    -:8888b  \s
                    8'         8888 \s
                   d8.-=. ,==-.:888b \s
                   >8 `~` :`~' d8888  \s
                   88         ,88888  \s
                   88b. `-~  ':88888 \s
                   888b ~==~ .:88888\s
                   88888o--:':::8888     \s
                   `88888| :::' 8888b \s
                   8888^^'       8888b \s
                  d888           ,%888b.  \s
                 d88%            %%%8--'-. \s
                /88:.__ ,       _%-' ---  - \s
                    '''::===..-'   =  --.""");

        int hpMonaLisa = monaLisa.getLevelHealth();
        int hpHero = Hero.getLevelHealth();
        while (hpMonaLisa >= 0 || hpHero >= 0) {
            while (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
                Scanner clavier = new Scanner(System.in);
                System.out.println("""
                        | Attack =   [1] |\s
                        | Flee =     [2] |\s
                        | Pass =     [3] |\s
                        | Magic =    [4] |\s
                        | Potion =   [5] |""");
                choice = clavier.nextInt();
                if (choice == 1) {
                    System.out.println("HP Mona Lisa " + hpMonaLisa);
                    int attackHero = Hero.getAttack();
                    hpMonaLisa = hpMonaLisa - attackHero;
                    System.out.println("Attack Hero " + attackHero + " !" + "\nHP Mona Lisa  -" + attackHero);
                    System.out.println("HP Mona Lisa " + hpMonaLisa);
                }
                if (choice == 2) {
                    hpMonaLisa = 0;
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
                        System.out.println("HP Mona Lisa " + hpMonaLisa);
                        hpMonaLisa = hpMonaLisa - 14;
                        System.out.println("FIRE BALL \n HP Mona Lisa " + hpMonaLisa);
                    }
                    if (magicChoice == 2) {
                        System.out.println("HP Mona Lisa " + hpMonaLisa);
                        hpMonaLisa = hpMonaLisa - 25;
                        System.out.println("BLIZZARD \nHP Mona Lisa " + hpMonaLisa);
                    }
                    if (magicChoice == 3) {
                        System.out.println("HP Mona Lisa " + hpMonaLisa);
                        hpMonaLisa = hpMonaLisa - 12;
                        System.out.println("THUNDER \n HP Mona Lisa" + hpMonaLisa);
                    }
                }

                if (hpHero <= 0) {
                    clavier.close();
                }
            }
            if (hpMonaLisa <= 0 || hpHero <= 0) {
                break;
            }

            choice = 0;

            new Scanner(System.in).nextLine();
            System.out.println("Round of Mona Lisa");
            System.out.println("HP Hero " + hpHero);
            int attackMonaLisa = monaLisa.getAttack();
            hpHero = hpHero - attackMonaLisa;
            System.out.println("Attack Mona Lisa  " + attackMonaLisa + " !" + "\nHP Hero  -" + attackMonaLisa);
            System.out.println("HP Hero " + hpHero);

            if (hpHero <= 0) {
                Scanner clavier = new Scanner(System.in);
                clavier.close();
            }

            if (hpHero <= 0) {
                break;
            }

        }
        System.out.println("End of fight" + emoticonFight + emoticonFight + emoticonFight + emoticonFight + emoticonFight + emoticonFight);

    }
}

