package Play;

public class Hero {
    private static String type;
    private static int hp;
    private static String skill;
    private static int damage;
    private static int gold;


    public Hero(String type, int hp, String skill, int damage, int gold){
        this.type = type;
        this.skill = skill;
        this.damage = damage;
        this.gold = gold;
    }
    public static String getType(){
        return type;
    }
    public static int getHp(){
        return hp;
    }
    public static String getSkill(){
        return skill;
    }
    public static int getDamage(){
        return damage;
    }
    public static int getGold(){
        return gold;
    }
}
