package figth;
import Character.*;
import java.util.Scanner;

    public class figthMonaLisa  {
        //VARIABLES************************************************************************
        MonaLisa monaLisa = new MonaLisa(3,50);
        Personage Heros = new Spell();

        private int attackMonaLisa = monaLisa.getAttack();
        private int hpMonaLisa= monaLisa.getLevelHealth();
        private int attackHeros = Heros.getAttack();
        private int hpHeros = Heros.getLevelHealth();
        String e = Character.toString(0x1F47A);
//GETTERS****************************************************************************


        public MonaLisa getMonaLisa() {
            return monaLisa;
        }
        public Personage getHeros() {
            return Heros;
        }

        //CONSTRUCTEUR*******************************************************************
        public figthMonaLisa() {
            System.out.println("COMBAT"+e+e+e+e+e+e+e+e);
            int choice = 0;
            System.out.println("          ____  \n" +
                    "        o8%8888,    \n" +
                    "      o88%8888888.  \n" +
                    "     8'-    -:8888b   \n" +
                    "    8'         8888  \n" +
                    "   d8.-=. ,==-.:888b  \n" +
                    "   >8 `~` :`~' d8888   \n" +
                    "   88         ,88888   \n" +
                    "   88b. `-~  ':88888  \n" +
                    "   888b ~==~ .:88888 \n" +
                    "   88888o--:':::8888      \n" +
                    "   `88888| :::' 8888b  \n" +
                    "   8888^^'       8888b  \n" +
                    "  d888           ,%888b.   \n" +
                    " d88%            %%%8--'-.  \n" +
                    "/88:.__ ,       _%-' ---  -  \n" +
                    "    '''::===..-'   =  --.");

            while(hpMonaLisa >= 0 || hpHeros >= 0) {
                while(choice !=1 && choice !=2 && choice !=3) {
                    Scanner clavier = new Scanner(System.in);
                    System.out.println("| Attack =   [1] | \n" + "| Flee =     [2] | \n" + "| Pass =     [3] | \n"+"| Potion =   [4] |");
                    choice = clavier.nextInt();
                    if (choice == 1) {
                        System.out.println("HP Mona Lisa " + hpMonaLisa);
                        hpMonaLisa = hpMonaLisa - attackHeros;
                        System.out.println("Attack Heros " + attackHeros + " !" + "\nHP Mona Lisa  -" + attackHeros);
                        System.out.println("HP Mona Lisa " + hpMonaLisa);
                    }
                    if (choice == 2) {
                        hpMonaLisa = 0;
                        System.out.println("You are looser");
                    }
                    if (choice == 3) {
                        System.out.println("What ! YOU PREFER TO HANG OUT ");
                    }
                    if (choice == 4) {
                        System.out.println(hpHeros);
                        hpHeros=hpHeros + 3;
                        System.out.println("HP + 3");
                        System.out.println(hpHeros);
                    }

                    if(hpHeros <= 0){
                        clavier.close();
                    }
                }
                if (hpMonaLisa <= 0 || hpHeros <= 0) {
                    break;
                }

                choice=0;

                new Scanner(System.in).nextLine();
                System.out.println("Round of Mona Lisa");
                System.out.println("HP Heros " + hpHeros);
                hpHeros = hpHeros - attackMonaLisa;
                System.out.println("Attack Mona Lisa  " + attackMonaLisa + " !" + "\nHP Heros  -" + attackMonaLisa);
                System.out.println("HP Heros " + hpHeros);

                if(hpHeros <= 0){
                    Scanner clavier = new Scanner(System.in);
                    clavier.close();
                }

                if (hpMonaLisa <= 0 || hpHeros <= 0) {
                    break;
                }

            }
            System.out.println("End of figth"+e+e+e+e+e+e);

        }
    }

