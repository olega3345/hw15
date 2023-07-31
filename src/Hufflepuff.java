public class Hufflepuff extends hogwarts {
    private int hardworking;
    private int loaylty;
    private int honesty;
    public int getHardworking() {
        return hardworking;
    }
    public int getLoaylty() {
        return loaylty;
    }
    public int getHonesty() {
        return honesty;
    }
    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardworking, int loaylty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loaylty = loaylty;
        this.honesty = honesty;
    }
    private int getHufflepuffTotalPower() {
        return hardworking + loaylty + honesty;
    }
    public void HufflepufComareTo(Hufflepuff other) {
        if (other.getHufflepuffTotalPower() < this.getHufflepuffTotalPower()) {
            System.out.println(this.getName() + "лучший пуффендуец чем" + other.getName());
        } else if (other.getHufflepuffTotalPower() > this.getHufflepuffTotalPower()) {
            System.out.println(other.getName() + "лучший пкуффендуец чем" + this.getName());
        } else {
            System.out.println("Ученики равны по силе");
        }
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loaylty=" + loaylty +
                ", honesty=" + honesty +
                '}';
    }
}

