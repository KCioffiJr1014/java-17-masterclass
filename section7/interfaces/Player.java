package section7.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        weapon = "Sword";
    }

    @Override
    public List<String> write() {
        ArrayList<String> data = new ArrayList<>();
        data.add(0, name);
        data.add(1, String.valueOf(hitPoints));
        data.add(2, String.valueOf(strength));
        data.add(3, weapon);

        return data;
    }

    @Override
    public void read(List<String> savedData) {
        if (savedData != null && savedData.size() > 0) {
            name = savedData.get(0);
            hitPoints = Integer.parseInt(savedData.get(1));
            strength = Integer.parseInt(savedData.get(2));
            weapon = savedData.get(3);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return String.format("Player{name='%s', hitPoints=%d, strength=%d, weapon='%s'}", name, hitPoints, strength, weapon);
    }


}
