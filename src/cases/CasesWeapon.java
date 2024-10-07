package cases;

import db.*;
import character.*;

import java.sql.SQLException;

public class CasesWeapon implements Cases {


    public CasesWeapon() throws SQLException {
        System.out.println("""
                                           ___
                                          ( ((
                                           ) ))
                  .::.                    / /(
                 'M .-;-.-.-.-.-.-.-.-.-/| ((::::::::::::::::::::::::::::::::::::::::::::::.._
                (J ( ( ( ( ( ( ( ( ( ( ( |  ))   -====================================-      _.>
                 `P `-;-`-`-`-`-`-`-`-`-\\| ((::::::::::::::::::::::::::::::::::::::::::::::''
                  `::'                    \\ \\(
                                           ) ))
                                          (_((
                """);
        String message = toString();
        System.out.println(message);

        DataBase DbAttack = new DataBase();
        DbAttack.changeAttack(new Personage() {
            @Override
            public void setAttack(int newAttack) {
                super.setAttack(+5);
            }
        });
        System.out.println(" Attack + 5  ");
    }

    public String toString() {
        return "You find a weapon";
    }
}
