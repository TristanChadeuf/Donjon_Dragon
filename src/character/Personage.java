package character;

// VARIABLE**********************************************************************************
public class Personage {
    private String name;
    private String type;
    private int levelHealth;
    private int attack;
    private String offensiveEquipment;
    private String defensiveEquipment;


    // ADVANCEMENT GETTERS******************************************************************************************
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevelHealth() {
        return levelHealth;
    }

    public int getAttack() {
        return attack;
    }

    public String getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public String getDefensiveEquipment() {
        return defensiveEquipment;
    }
    //ADVANCEMENT SETTERS********************************************************************************************

    public void setLevelHealth(int newLevelHealth) {
        this.levelHealth = newLevelHealth;
    }

    public void setAttack(int newAttack) {
        this.attack = newAttack;
    }

    //ADVANCEMENT DES CONSTRUCTORS***************************************************************************************
    public Personage(String name, String type, int attack, int levelHealth,
                     String offensiveEquipment, String defensiveEquipment) {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.levelHealth = levelHealth;
        this.offensiveEquipment = offensiveEquipment;
        this.defensiveEquipment = defensiveEquipment;

    }

    public Personage() {

    }

    //TO STRING*********************************************************************************************************
    public String toString() {

        return "Nom: " + name + "\n"
                + "Type: " + type + "\n"
                + "HP : " + levelHealth + "\n"
                + "Attack : " + attack + "\n"
                + "Offensive Equipment: " + offensiveEquipment + "\n"
                + "Defensive Equipment: " + defensiveEquipment + "\n";

    }

}




