import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Random random = new Random();
        String[] word = new String[]{"Baktulan", "Joomart", "Aigerim"};
        String w=word[random.nextInt(word.length)];
        if (w.equals("Baktulan")){
            System.out.println(w+" is java developer");
        } else if (w.equals("Joomart")) {
            System.out.println(w+ " is JS developer");
        } else {
            System.out.println(w + " is python developer");
        }

    }
}