
public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 20, 22, 24, 13, 6);
        Gryffindor hermionaGranger = new Gryffindor("Hermiona Granger ", 16, 7, 17, 13, 21);
        Gryffindor ronWesley = new Gryffindor("Ron Wesley", 15, 19, 65, 78, 43);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory",68,89,98,56,86);
        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith ",78,42,45,67,53);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley ",32,46,75,89,43);
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 34, 68, 58, 71, 43);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 65, 56, 83, 32, 69);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 96, 56, 45, 32, 56);
        Ravenclaw choChang = new Ravenclaw("Cho Chang", 36, 11, 12, 16, 17);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 10, 19, 6, 9, 12);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 14, 7, 8, 10, 9);
        harryPotter.comareTo(dracoMalfoy);
        harryPotter.GryffindorComareTo(ronWesley);
        justinFinchFletchley.comareTo(dracoMalfoy);
        System.out.println(harryPotter);
        System.out.println(dracoMalfoy);
        System.out.println(zachariasSmith);
        }
    }
