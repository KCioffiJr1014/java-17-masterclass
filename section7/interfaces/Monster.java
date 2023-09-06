package section7.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        ArrayList<String> data = new ArrayList<>();
        data.add(0, name);
        data.add(1, String.valueOf(hitPoints));
        data.add(2, String.valueOf(strength));

        return data;
    }

    @Override
    public void read(List<String> savedData) {
        if (savedData != null && savedData.size() > 0) {
            name = savedData.get(0);
            hitPoints = Integer.parseInt(String.valueOf(savedData.get(1)));
            strength = Integer.parseInt(String.valueOf(savedData.get(2)));
        }
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return String.format("Monster{name='%s', hitPoints=%d, strength=%d}", name, hitPoints, strength);
    }
}
