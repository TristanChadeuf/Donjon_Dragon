package cases;
import character.*;
import db.DataBase;
import java.sql.SQLException;

public class CasesPotion implements Cases{



    public CasesPotion() throws SQLException {
        System.out.println("""
                 _____
                     `.___,'
                      (___)
                      <   >
                       ) (
                      /`-.\\
                     /     \\
                    / _    _\\
                   :,' `-.' `:
                   |         |
                   :         ;
                    \\       /
                     `.___.'\
                """);
        DataBase DBd = new DataBase();
        DBd.changeHealthPoints(new Personage() {
            @Override
            public void setLevelHealth(int newlineHealth) {
                super.setLevelHealth(+5);
            }
        });
        System.out.println(" HP + 5 ");

    }
}
