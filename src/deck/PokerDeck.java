package deck;

public class PokerDeck {
    
    protected Card[] cards;
    
    cards = new Card[52];

    //create constant
    public static final String[] SUIT = {
        "Spade" , "Heart", "Club", "Diamond" 
    };
    public static final String[] NAME = {
        "Ace", "Two", "Three", "Four", "Five", "Six", 
        "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"
    };

    public static final int[] VALUE = {
        1, 2, 3, 4, 5, 6, 
        7, 8, 9, 10, 11, 12, 13
    };

    public PokerDeck () {
        

        int idx = 0;
        for (int s= 0; s< SUIT.length; s++ ) {
            String suit = SUIT[s]
            for (int n = 0; n< NAME.length; n++) {
                String name = NAME[n];
                int value = VALUE[n]

                Card card = new Card(suit, name, value);
                card[idx] = card;
                idx++;
            }

        }


    }

        Public Card get() {

            return this.get(0);
    
        }



    // public static void main(String[] args) {
        
    //     String[] suit = {
    //         "Spade" , "Heart", "Club", "Diamond" };
        
    //     String[] rank = {
    //         "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    
    // //initialise deck

    // //52 cards a deck
    // int n = suit.length * rank.length;
    // System.out.println("Number of cards in this deck: " + n);
    
    // //Make the deck
    // String[] deck = new String[n];
    // //assign values
    // for (int i =0; i < rank.length; i++) {
    //     for ( int j=0; j < suit.length; j++) {
    //         deck[suit.length*i + j] = rank[i] + " of " + suit[j];
    //     }
    // }

    //to shuffle 




    }
}
