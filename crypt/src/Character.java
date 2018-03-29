/**
 * Created by dsochanski on 3/29/2018.
 */
public abstract class Character {
    private String name;
    private int lifePoints;
    private int strenght;
    private int dexterity;
    private String weapon;

    public Character(String name, int lifePoints, int strenght, int dexterity, String weapon) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.strenght = strenght;
        this.dexterity = dexterity;
        this.weapon = weapon;

    }

    public abstract void atack();
    public abstract void block();
    public abstract void restoreLifePoints();

    public String getName() {
        return name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getStrenght() {
        return strenght;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setName(String name) {
        this.name = name;
    }
}
