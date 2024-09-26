package Character;

import java.util.Scanner;

public class Menu {

        public void menu() {
            int choice = 0;

            Scanner clavier = new Scanner(System.in);
            while(choice != 1 && choice != 2 ) {
                System.out.print("New game ? : Yes = 1 or No = 2");
                choice = clavier.nextInt();

                if (choice == 1) {
                    System.out.println("Game started");

                } else if (choice == 2) {
                    System.out.println("End Game");
                    clavier.close();


                }else {

                    System.out.println("TU SAIS PAS LIRE CONNARD");
                }
            }
             choice = 0;

            while(choice != 1 && choice != 2 && choice != 3 ) {
                System.out.print("Choice your personage : Warrior = 1 or  Mage = 2  or Quit = 3");
                choice = clavier.nextInt();
                if (choice == 2) {
                    Personage mage = new Spell();
                    System.out.println("Start of the game with" + "\n"+mage);
                } else if (choice == 1) {
                    Personage warrior = new Weapon();
                    System.out.println("Start of the game with "+warrior);

                }else if (choice == 3){
                    System.out.println("End Game");
                    clavier.close();
                }
            }

        }


}
