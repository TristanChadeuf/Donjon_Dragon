package cases;

import java.sql.SQLException;

public class CasesMysteryBox implements Cases {

    public CasesMysteryBox() throws SQLException {
        System.out.println("""
                      .-------.    ______
                      /   o   /|   /\\     \\
                     /_______/o|  /o \\  o  \\
                     | o     | | /   o\\_____\\
                     |   o   |o/ \\o   /o    /
                     |     o |/   \\ o/  o  /
                     '-------'     \\/____o/\
                """);

        int dice = 1 + (int) (Math.random() * 3);
        System.out.println("IS TIME TO LUCK FOR YOU");

        if (dice == 1) {
            System.out.println("OOPS IS FIGHT ASSHOLE");
            new CasesEnemy();
        }
        if (dice == 2) {
            System.out.println("LUCKY DRINK THIS DISGUSTING POTION");
            new CasesPotion();
        }
        if (dice == 3) {
            System.out.println("LUCKY TAKE THIS WEAPON");
            new CasesWeapon();
        }

    }
}
