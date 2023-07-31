public class Gryffindor extends hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public int getNobility() {
        return nobility;
    }
    public int getHonor() {
        return honor;
    }
    public int getBravery() {
        return bravery;
    }
    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    private int getGryffindorTotalPower() {
        return nobility + honor + bravery;
    }
    public void GryffindorComareTo(Gryffindor other) {
        if (other.getGryffindorTotalPower() < this.getGryffindorTotalPower()) {
            System.out.println(this.getName() + "лучший гриффиндорец чем" + other.getName());
        } else if (other.getGryffindorTotalPower() > this.getGryffindorTotalPower()) {
            System.out.println(other.getName() + "лучший гриффиндорец чем" + this.getName());
        } else {
            System.out.println("Ученики равны по силе");
        }
    }
    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
