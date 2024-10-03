package deck;

public class Card {

    private final String name;
    private final String suit;
    private final int value;

    //Constuctor for assigning attributes to card
    //u cannot create a blank card
    public Card(String suit, String name, int value) {
        this.suit = suit;
        this.name = name;
        this.value =value;
    }

    //getters setters
    public String getName() {return name;}
    public String getSuit() {return suit;}
    public String getvalue() {return value;}

    
}
    
