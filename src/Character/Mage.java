package Character;


public abstract class Mage extends Personage{

    private String offensiveEquipement;
    private String defensiveEquipment;


    //GETTERS***********************************************************************************************************

    public String getOffensiveEquipement(){
        return offensiveEquipement;
    }
    public String getDefensiveEquipment(){
        return defensiveEquipment;
    }

    public Mage(String offensiveEquipement, String defensiveEquipment ) {
        super("Fabrice","Mage", 15, 6,offensiveEquipement,defensiveEquipment);
        this.offensiveEquipement=offensiveEquipement;
        this.defensiveEquipment=defensiveEquipment;

    }

}