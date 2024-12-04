public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.fill();
        System.out.println("Initial deck: " + deck);

        deck.shuffle();
        System.out.println("Shuffled deck: " + deck);
    }
}