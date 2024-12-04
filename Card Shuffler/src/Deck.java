import java.util.Random;

/**
 * Represents a deck of playing cards.
 */
public class Deck {
    private Card[] cards;

    /**
     * Constructs an empty deck.
     */
    public Deck() {
        cards = new Card[52];
    }

    /**
     * Fills the deck with a standard 52-card deck.
     */
    public void fill() {
        int index = 0;
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards[index++] = new Card(rank, suit);
            }
        }
    }

    /**
     * Shuffles the deck using a simple random swap algorithm.
     */
    public void shuffle() {
        Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    /**
     * Returns a string representation of the deck, showing each card's rank and suit.
     *
     * @return a string representation of the deck
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}