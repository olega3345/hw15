public class Slytherin extends hogwarts {
    private int cunning;
    private int determination;
    private int ambition;

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }
    private int getSlytherinTotalPower() {
        return cunning + determination + ambition;
    }
    public void SlytherinComareTo(Slytherin other) {
        if (other.getSlytherinTotalPower() < this.getSlytherinTotalPower()) {
            System.out.println(this.getName() + " лучший слизеринец, чем " + other.getName());
        } else if (other.getSlytherinTotalPower() > this.getSlytherinTotalPower()) {
            System.out.println(other.getName() + " лучший слизеринец, чем " + this.getName());
        } else {
            System.out.println("Ученики равны по силе");
        }
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                '}';
    }
}
