import java.util.ArrayList;
import java.util.List;

public class WaterPokemon extends Pokemon {

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        super.setType("water");
        List<String> attacks = new ArrayList<>();
        attacks.add("surf");
        attacks.add("hydropump");
        attacks.add("hydrocanon");
        attacks.add("raindance");
        super.setAttacks(attacks);
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with SURF");
        enemy.setHp(Math.max(enemy.getHp() - calculateDamage(enemy.getType()), 0));
        System.out.println(enemy.getName() + " is of type " + enemy.getType() + ", the HP-damage is " + calculateDamage(enemy.getType()) + " and the the remaining HP is: " + enemy.getHp());
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with HYDROPUMP");
        enemy.setHp(Math.max(enemy.getHp() - calculateDamage(enemy.getType()), 0));
        System.out.println(enemy.getName() + " is of type " + enemy.getType() + ", the HP-damage is " + calculateDamage(enemy.getType()) + " and the the remaining HP is: " + enemy.getHp());

    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with HYDROCANON");
        enemy.setHp(Math.max(enemy.getHp() - calculateDamage(enemy.getType()), 0));
        System.out.println(enemy.getName() + " is of type " + enemy.getType() + ", the HP-damage is " + calculateDamage(enemy.getType()) + " and the the remaining HP is: " + enemy.getHp());
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with RAINDANCE");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " is of type " + enemy.getType() + " and the attack has no effect.");
                break;
            case "grass":
                System.out.println(enemy.getName() + " is of type " + enemy.getType() + " and gets an HP-boost of + 20.");
                enemy.setHp(enemy.getHp() + 20);
            default:
                enemy.setHp(Math.max(enemy.getHp() - calculateDamage(enemy.getType()), 0));
                System.out.println(enemy.getName() + " is of type " + enemy.getType() + ", the HP-damage is " + calculateDamage(enemy.getType()) + " and the the remaining HP is: " + enemy.getHp());
        }
    }

    @Override
    public int calculateDamage(String type) {
        int damageHP;
        switch (type) {
            case "water":
                damageHP = 10;
                break;
            case "electric":
                damageHP = 30;
                break;
            case "grass":
                damageHP = 20;
                break;
            case "fire":
                damageHP = 40;
                break;
            default:
                damageHP = 0;
        }
        return damageHP;
    }

}
