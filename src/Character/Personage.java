package Character;

// Creation de la classe Personnage**********************************************************************************
public class Personage {
    // creation des variable liés au personage
    private String  name;
    private String type;
    private int levelHealth;
    private int attack;
    private String offensiveEquipment;
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
    public String getoffensiveEquipment(){
        return offensiveEquipment;
    }
    public String getdefensiveEquipment(){
        return defensiveEquipment;
    }
     //LANCEMENT DES SETTERS********************************************************************************************

    public void setLevelHealth(int newLevelHealth){
        this.levelHealth = newLevelHealth;
    }
    public void setAttack(int newAttack){
        this.attack=newAttack;
    }

    //LANCEMENT DES CONSTRUCTEURS***************************************************************************************
    public Personage(String name, String type, int attack, int levelHealth, String offensiveEquipment,String defensiveEquipment)
    {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.levelHealth=levelHealth;
        this.offensiveEquipment=offensiveEquipment;
        this.defensiveEquipment=defensiveEquipment;

        }

        public Personage(){

        }

        public Personage(String name){
        this.name = name;

        }

    public String toString(){

        return "Nom: " + name + "\n" +  "Type: " + type + "\n"+  "HP : "+ levelHealth + "\n" + "Attack : "+ attack+"\n"+
                "Offensive Equipment: "+offensiveEquipment+ "\n"+"Defensive Equipment: "+defensiveEquipment+"\n";

    }

    }




