import java.util.HashMap;
public class hogwarts {
    private final String name;
    private final int magicPower;
    private final int transgressionDistance;

    public String getName() {
        return name;
    }
    public int getMagicPower() {
        return magicPower;
    }
    public int getTransgressionDistance() {
        return transgressionDistance;
    }
    public hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }
    private int getTotalPower() {
        return magicPower + transgressionDistance;
    }
    public void comareTo(hogwarts other) {
        if (other.getTotalPower() < this.getTotalPower()) {
            System.out.println(this.getName() + " Обладает бОльшей мощностью магии, чем " + other.getName());
        } else if (other.getTotalPower() > this.getTotalPower()) {
            System.out.println(other.getName() + " Обладает бОльшей мощностью магии, чем " + this.getName());
        } else {
            System.out.println("Ученики равны по силе");
        }
    }
    @Override
    public String toString() {
        return "hogwarts{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
