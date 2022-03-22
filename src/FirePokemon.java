import java.util.ArrayList;
import java.util.List;

public class FirePokemon extends Pokemon {

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        super.setType("fire");
        List<String> attacks = new ArrayList<>();
        attacks.add("inferno");
        attacks.add("pyroball");
        attacks.add("firelash");
        attacks.add("flamethrower");
        super.setAttacks(attacks);
    }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with INFERNO");
        enemy.setHp(Math.max(enemy.getHp() - calculateDamage(enemy.getType()), 0));
        System.out.println(enemy.getName() + " is of type " + enemy.getType() + ", the HP-damage is " + calculateDamage(enemy.getType()) + " and the the remaining HP is: " + enemy.getHp());
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with PYROBALL");
        enemy.setHp(Math.max(enemy.getHp() - calculateDamage(enemy.getType()), 0));
        System.out.println(enemy.getName() + " is of type " + enemy.getType() + ", the HP-damage is " + calculateDamage(enemy.getType()) + " and the the remaining HP is: " + enemy.getHp());
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with FIRELASH");
        enemy.setHp(Math.max(enemy.getHp() - calculateDamage(enemy.getType()), 0));
        System.out.println(enemy.getName() + " is of type " + enemy.getType() + ", the HP-damage is " + calculateDamage(enemy.getType()) + " and the the remaining HP is: " + enemy.getHp());
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with FLAMETHROWER");
        enemy.setHp(Math.max(enemy.getHp() - calculateDamage(enemy.getType()), 0));
        System.out.println(enemy.getName() + " is of type " + enemy.getType() + ", the HP-damage is " + calculateDamage(enemy.getType()) + " and the the remaining HP is: " + enemy.getHp());
    }

    @Override
    public int calculateDamage(String type) {
        int damageHP;
        switch (type) {
            case "water":
                damageHP = 30;
                break;
            case "electric":
                damageHP = 40;
                break;
            case "grass":
                damageHP = 20;
                break;
            case "fire":
                damageHP = 10;
                break;
            default:
                damageHP = 0;
        }
        return damageHP;
    }
}
