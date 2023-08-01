public class Ravenclaw extends hogwarts{
    private int smart;
    private int wise;
    private int witty;

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }
    public Ravenclaw(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
    }
    private int getRavenclawTotalPower() {
        return smart + wise + witty;
    }
    public void RavebclawComareTo(Ravenclaw other) {
        if (other.getRavenclawTotalPower() < this.getRavenclawTotalPower()) {
            System.out.println(this.getName() + " лучший когтевранец, чем " + other.getName());
        } else if (other.getRavenclawTotalPower() > this.getRavenclawTotalPower()) {
            System.out.println(other.getName() + " лучший когтевранец, чем " + this.getName());
        } else {
            System.out.println("Ученики равны по силе");
        }
    }
    @Override
    public String toString() {
        return "Ravenclaw{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                '}';
    }
}
