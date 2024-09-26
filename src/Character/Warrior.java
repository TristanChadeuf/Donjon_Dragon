package Character;


public abstract class Warrior extends Personage{

    private String offensiveEquipement;
    private String defensiveEquipment;


    //GETTERS***********************************************************************************************************

    public String getOffensiveEquipement(){
        return offensiveEquipement;
    }
    public String getDefensiveEquipment(){
        return defensiveEquipment;
    }

    //CONSTRUCTEUR******************************************************************************************************
    public Warrior( String offensiveEquipement, String defensiveEquipment ) {
        super("Patrick","Warrior", 10, 10,offensiveEquipement,defensiveEquipment);
        this.offensiveEquipement=offensiveEquipement;
        this.defensiveEquipment=defensiveEquipment;

    }

}
