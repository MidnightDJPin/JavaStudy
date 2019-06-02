import java.util.ArrayList;

public class CardDealer {

	public static void main(String[] args) {
		CardSet cardSet = new CardSet();
		ArrayList<Card> cards = cardSet.deal();

		System.out.println(cards.subList(0, 13).toString());
		System.out.println(cards.subList(13, 26).toString());
		System.out.println(cards.subList(26, 39).toString());
		System.out.println(cards.subList(39, 52).toString());
	}

}
