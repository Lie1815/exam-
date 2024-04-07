package Play;

import Play.Hero;
import Play.Evil;

import java.util.Objects;
public class Play {
    public static void main(String[] args) {
        Hero[] arrhero = new Hero[3];
        Evil[] arrevil = new Evil[3];
         int hp = 100;
        arrhero[0] = new Hero("King", 500, "Лунная призма", 1000, 23617323);
        arrhero[1] = new Hero("", 350, "пальзевый захват уси", 560, 3000);
        arrhero[2] = new Hero(" ", 150, "бросок хомячка", 120, 1000);
        System.out.println("-----Королевская армия------Королевская армия------Королевская армия");
    for (Hero e : arrhero){
        System.out.println(e.getType() + " " + e.getHp() + " здоровья");
        System.out.println("Навык: "+e.getSkill()+", урон  "+e.getDamage()+" единиц здоровья");
        if (Objects.equals(e.getType(), "King")){
            System.out.println("золото в казне: "+e.getGold());
        }else {
            System.out.println("золото в банке "+e.getGold());
        }
        System.out.println("---------------------------------------------------------------------");
    }
    System.out.println("--------Враги-------------Враги------------Враги------------Враги---------");
    arrevil[0] = new Evil("Dark King",1000, 8000);
    arrevil[1] = new Evil("Dark wizard", 500, 5078);
    arrevil[2] = new Evil("shadow", 50,100);
    for (Evil r : arrevil){
        System.out.println("Враг: "+r.getType()+" с уроном = "+r.getDamage()+" единиц здоровья");
        System.out.println("Получаете: "+r.getGold()+" золота");
        System.out.println("-----------------------------------------------------------------------");
    }
    }
}