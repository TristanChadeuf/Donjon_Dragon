package Character;

import java.net.StandardSocketOptions;

// Creation de la classe Personnage**********************************************************************************
public class Personage {
    // creation des variable liés au personnage
    private String  name;
    private String type;
    private int levelHealth;
    private int attack;
    private String offensiveEquipement;
    private String defensiveEquipment;

    // LANCEMENT DES GETTERS******************************************************************************************
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public int getLevelHealth(){
        return levelHealth;
    }
    public int getAttack(){
        return attack;
    }
    public String getOffensiveEquipement(){
        return offensiveEquipement;
    }
    public String getDefensiveEquipment(){
        return defensiveEquipment;
    }

    //LANCEMENT DES CONSTRUCTEURS***************************************************************************************
    public Personage(String name, String type) {
        this.name = name;
        this.type = type;

         if(type.equals("warrior")){
            levelHealth=10;
            attack=10;
            offensiveEquipement="Weapon";
            defensiveEquipment="Shield";

        }
        else if(type.equals("mage")){
            levelHealth=6;
            attack=15;
            offensiveEquipement="Spell";
            defensiveEquipment="Philter";
        }

    }
// LANCEMENT DE LA CREATION DES PERSONNAGES*****************************************************************************
    public String toString(){
        return "Nom: " + name + "\n" +  "Type: " + type + "\n"+  "HP : "+ levelHealth + "\n" + "Attack : "+ attack+"\n"+
                "Offensive Equipment: "+ offensiveEquipement +"\n"+"Defensive Equipment: "+defensiveEquipment+"\n";

    }


}
