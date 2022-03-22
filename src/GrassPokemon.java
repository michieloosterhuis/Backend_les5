import java.util.ArrayList;
import java.util.List;

public class GrassPokemon extends Pokemon {

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        super.setType("grass");
        List<String> attacks = new ArrayList<>();
        attacks.add("leafstorm");
        attacks.add("solarbeam");
        attacks.add("leechseed");
        attacks.add("leaveblade");
        super.setAttacks(attacks);
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with LEAFSTORM");
        enemy.setHp(Math.max(enemy.getHp() - calculateDamage(enemy.getType()), 0));
        System.out.println(enemy.getName() + " is of type " + enemy.getType() + ", the HP-damage is " + calculateDamage(enemy.getType()) + " and the the remaining HP is: " + enemy.getHp());
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with SOLARBEAM");
        enemy.setHp(Math.max(enemy.getHp() - calculateDamage(enemy.getType()), 0));
        System.out.println(enemy.getName() + " is of type " + enemy.getType() + ", the HP-damage is " + calculateDamage(enemy.getType()) + " and the the remaining HP is: " + enemy.getHp());
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with LEECHSEED");
        enemy.setHp(Math.max(enemy.getHp() - calculateDamage(enemy.getType()), 0));
        name.setHp(name.getHp() + calculateDamage(enemy.getType()));
        System.out.println(enemy.getName() + " is of type " + enemy.getType() + ", the HP-damage is " + calculateDamage(enemy.getType()) + " and the the remaining HP is: " + enemy.getHp());
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with LEAVEBLADE");
        enemy.setHp(Math.max(enemy.getHp() - calculateDamage(enemy.getType()), 0));
        System.out.println(enemy.getName() + " is of type " + enemy.getType() + ", the HP-damage is " + calculateDamage(enemy.getType()) + " and the the remaining HP is: " + enemy.getHp());
    }

    @Override
    public int calculateDamage(String type) {
        int damageHP;
        switch (type) {
            case "water":
                damageHP = 20;
                break;
            case "electric":
                damageHP = 40;
                break;
            case "grass":
                damageHP = 10;
                break;
            case "fire":
                damageHP = 30;
                break;
            default:
                damageHP = 0;
        }
        return damageHP;
    }

}
