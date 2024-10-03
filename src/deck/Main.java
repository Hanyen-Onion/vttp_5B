package deck;

public class Main {

    public static void main(String[] args) {
        PokerDeck deck = new PokerDeck();
        Card card = deck.get(5);
        
        PokerDeck deck = new PokerDeck();
        System.out.println("suit: %s, name: %s, value: %d\n", 
        card.getSuit(), card.getName(), card.getvalue());

        System.out.println(card);
        System.out.println(deck);
    }
    
}
