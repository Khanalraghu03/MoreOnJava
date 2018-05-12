package Chapter7Listings;

public class DeckOfCards {
    public static void main(String[] args) {

        //52 cards in a deck
        int[] deck = new int[52];

        //4 suits; spade: hearts: diamods:clubs
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

        //13 Ranks: A, 2,......,10, J, Q, K
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // int i gets zero
            //while i is less than 52, cannot be or equal to 52 b/c you count w/ 0 in java.
                //keep incrementing i by 1.
        for (int i = 0; i < deck.length; i++) {
            //put the deck of cards into the orders of i.
            deck[i] = i;
        }

         // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            //randomly select cards from the deck
            int index = (int)(Math.random() * deck.length);

            //set temp to the card in the i-th array
            int temp = deck[i];

            //put the array picked by the math.random array to the i-th array .
            deck[i] = deck[index];

            //put value of temp which was the i-th array, to the index.
            deck[index] = temp;
        }

         // Display the first four cards
        //set the cards in terms of i
            //while i is less than 4 (give me four cards)
                //Keep increasing i
         for (int i = 0; i < 4; i++) {
            //suit is the i-th (index) in the array which gets picked by math random and set to it and divide it by 13.
                //keep choosing cards
             String suit = suits[deck[i] / 13];
             //rank is the rank * deck(given by math random) which is in terms of 0-51: %13 gives a remainder of 1-12
               // which can be determinded which rank are the cards or zero remainder which also helps.
             String rank = ranks[deck[i] % 13];
             System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }
 }