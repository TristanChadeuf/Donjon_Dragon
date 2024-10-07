package character;


public abstract class Warrior extends Personage {

    private final String offensiveEquipment;
    private final String defensiveEquipment;


    //GETTERS***********************************************************************************************************

    public String getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public String getDefensiveEquipment() {
        return defensiveEquipment;
    }

    //CONSTRUCTOR******************************************************************************************************
    public Warrior(String offensiveEquipment, String defensiveEquipment) {
        super("Tristan", "Warrior", 10, 10, offensiveEquipment, defensiveEquipment);
        this.offensiveEquipment = offensiveEquipment;
        this.defensiveEquipment = defensiveEquipment;

    }

}
