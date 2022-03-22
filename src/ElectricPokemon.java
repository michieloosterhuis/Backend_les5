import java.util.ArrayList;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        super.setType("electric");
        List<String> attacks = new ArrayList<>();
        attacks.add("thunderpunch");
        attacks.add("electroball");
        attacks.add("thunder");
        attacks.add("volttackle");
        super.setAttacks(attacks);
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with THUNDERPUNCH");
        enemy.setHp(Math.max(enemy.getHp() - calculateDamage(enemy.getType()), 0));
        System.out.println(enemy.getName() + " is of type " + enemy.getType() + ", the HP-damage is " + calculateDamage(enemy.getType()) + " and the the remaining HP is: " + enemy.getHp());
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with ELECTROBALL");
        enemy.setHp(Math.max(enemy.getHp() - calculateDamage(enemy.getType()), 0));
        System.out.println(enemy.getName() + " is of type " + enemy.getType() + ", the HP-damage is " + calculateDamage(enemy.getType()) + " and the the remaining HP is: " + enemy.getHp());
    }

    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with THUNDER");
        if (enemy.getType().equals("electric")) {
            System.out.println(enemy.getName() + " is of type " + enemy.getType() + " and gets an HP-boost of + 20.");
            enemy.setHp(enemy.getHp() + 20);
        } else {
            enemy.setHp(Math.max(enemy.getHp() - calculateDamage(enemy.getType()), 0));
            System.out.println(enemy.getName() + " is of type " + enemy.getType() + ", the HP-damage is " + calculateDamage(enemy.getType()) + " and the the remaining HP is: " + enemy.getHp());
        }
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with VOLTTACKLE");
        enemy.setHp(Math.max(enemy.getHp() - calculateDamage(enemy.getType()), 0));
        System.out.println(enemy.getName() + " is of type " + enemy.getType() + ", the HP-damage is " + calculateDamage(enemy.getType()) + " and the the remaining HP is: " + enemy.getHp());
    }

    @Override
    public int calculateDamage(String type) {
        int damageHP;
        switch (type) {
            case "water":
                damageHP = 40;
                break;
            case "electric":
                damageHP = 10;
                break;
            case "grass":
                damageHP = 30;
                break;
            case "fire":
                damageHP = 20;
                break;
            default:
                damageHP = 0;
        }
        return damageHP;
    }
}
