/**
 * Represents a playing card with a rank and suit.
 */
public class Card {
    private final Rank rank;
    private final Suit suit;

    /**
     * Constructs a card with the given rank and suit.
     *
     * @param rank the rank of the card
     * @param suit the suit of the card
     */
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Returns the rank of the card.
     *
     * @return the rank of the card
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * Returns the suit of the card.
     *
     * @return the suit of the card
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Compares this card to another card.
     *
     * @param otherCard the other card to compare to
     * @return a negative integer, zero, or a positive integer as this card is less
     * than, equal to, or greater than the specified card
     */
    public int compareTo(Card otherCard) {
        int rankComparison = this.rank.compareTo(otherCard.rank);
        if (rankComparison != 0) {
            return rankComparison;
        } else {
            return this.suit.compareTo(otherCard.suit);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(rank.getSymbol() + suit.getSymbol());
    }

    /**
     * An enum representing the ranks of cards.
     */
    public enum Rank {
        ACE('A'), TWO('2'), THREE('3'), FOUR('4'), FIVE('5'), SIX('6'), SEVEN('7'), EIGHT('8'), NINE('9'), TEN('T'), JACK('J'), QUEEN('Q'), KING('K');

        private final char symbol;

        Rank(char symbol) {
            this.symbol = symbol;
        }

        public char getSymbol() {
            return symbol;
        }
    }

    /**
     * An enum representing the suits of cards.
     */
    public enum Suit {
        CLUBS('♣'), HEARTS('♥'), DIAMONDS('♦'), SPADES('♠');

        private final char symbol;

        Suit(char symbol) {
            this.symbol = symbol;
        }

        public char getSymbol() {
            return symbol;
        }
    }
}