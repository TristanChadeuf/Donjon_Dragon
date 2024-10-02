package db;
import java.sql.*;
import Character.*;



public class DataBase {


    final String DB_URL = "jdbc:mysql://localhost:3306/" + "DD";
    final String USER = "Tristan";
    final String PASS = "1186C76f*,64000";
    Connection conn;
    Statement stmt;

    public  DataBase() throws SQLException {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            System.out.println("DB connection established");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getHeroes() throws SQLException {
        String sql = "SELECT * FROM DD.Character";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.print("ID: " + rs.getInt("id") + " TYPE: " + rs.getString("Type") + " NAME: " + rs.getString("Name") + " LEVELHEALTH : " + rs.getInt("LevelHealth") + " ATTACK : " + rs.getInt("Attack")+  " OFFENSIVE EQUIPMENT : " + rs.getString("OffensiveEquipment")+ " DEFENSIVE EQUIPMENT : " + rs.getString("DefensiveEquipment")+ "\n");
        }
    }
    public void createHeroes(Personage heros) throws SQLException {

        String sql = "INSERT INTO DD.Character (Type, Name, LevelHealth, Attack, OffensiveEquipment, DefensiveEquipment) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, heros.getType());
        pstmt.setString(2, heros.getName());
        pstmt.setInt(3, heros.getLevelHealth());
        pstmt.setInt(4, heros.getAttack());
        pstmt.setString(5, heros.getoffensiveEquipment());
        pstmt.setString(6, heros.getdefensiveEquipment());

        pstmt.executeUpdate();
    }

    public ResultSet getOneHero (int id) throws SQLException {
        String sql = "SELECT * FROM DD.Character WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.print("ID: " + rs.getInt("id") + " TYPE: " + rs.getString("Type") + " NAME: " + rs.getString("Name") + " LEVELHEALTH : " + rs.getInt("LevelHealth") + " ATTACK : " + rs.getInt("Attack")+  " OFFENSIVE EQUIPMENT : " + rs.getString("OffensiveEquipment")+ " DEFENSIVE EQUIPMENT : " + rs.getString("DefensiveEquipment")+ "\n");
        }
        return pstmt.executeQuery();

    }
    public void changeHealthPoints (Personage heros) throws SQLException {
        String sql = "UPDATE DD.Character SET LevelHealth = ? WHERE Name = ? ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, heros.getLevelHealth());
        pstmt.setString(2, heros.getName());
        pstmt.executeUpdate();
    }
}

