import java.util.List;
import java.util.Scanner;

public abstract class Pokemon {

    // instance variables
    private String type;
    private String name;
    private int level;
    private int hp;
    private String food;
    private String sound;
    private List<String> attacks;

    // constructor
    public Pokemon(String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    public abstract int calculateDamage(String type);

    public void feed() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welk voer geef je aan " + getName() + "? ");
        String food = scanner.next();
        if (food.equals(this.food)) {
            setHp(getHp() + 50);
            System.out.println("Je hebt " + getName() + " gevoerd, zijn HP is toegenomen met +50 en is nu: " + getHp());
        } else {
            System.out.println("Dit soort voer een ik niet!");
        }
    }
}
