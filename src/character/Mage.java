package character;


public abstract class Mage extends Personage {

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
    public Mage(String offensiveEquipment, String defensiveEquipment) {
        super("Tristan", "Mage", 10, 10, offensiveEquipment, defensiveEquipment);
        this.offensiveEquipment = offensiveEquipment;
        this.defensiveEquipment = defensiveEquipment;
    }

}