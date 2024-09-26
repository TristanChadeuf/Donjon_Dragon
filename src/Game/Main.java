package Game;

import Character.Menu;

public class Main {

    //ADVANCEMENT DES PROGRAMMES****************************************************************************************
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.menu();

        Game game = new Game();
        game.game();
    }
}