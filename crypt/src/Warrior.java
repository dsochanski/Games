/**
 * Created by tadeuszx on 3/29/2018.
 */
public class Warrior extends Character {

    private int swordHeatPoints = 25;

    public Warrior(String name, int lifePoints, int strenght, int dexterity) {
        super(name, lifePoints, strenght, dexterity, "sword");

    }

    @Override
    public void atack() {
        int attackValue = swordHeatPoints + this.getStrenght();
        System.out.println(getName()+" has: "+getWeapon() +" and his attack power is: "+ attackValue);

}

    @Override
    public void block() {


    }

    @Override
    public void restoreLifePoints() {


    }
}
