import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class CardSet {

	private static final int SUIT_SIZE = 4;
	private static final int FACE_SIZE = 13;
	
	private Set<Card> cardSet;
	
	public CardSet() {
		cardSet = new HashSet<>(52);
		for (int i = 0; i < SUIT_SIZE; i++) {
			for(int j = 0; j < FACE_SIZE; j++) {
				cardSet.add(new Card(i,j));
			}
		}
	}
	//ϴ��
	public void shuffle() {
		cardSet.clear();
		for (int i = 0; i < SUIT_SIZE; i++) {
			for(int j = 0; j < FACE_SIZE; j++) {
				cardSet.add(new Card(i,j));
			}
		}
	}
	//���ƺ�����
	public ArrayList<Card> deal() {
		ArrayList<Card> cards = new ArrayList<Card>();
		cards.addAll(cardSet);
		cards.subList(0,  13).sort(cardComparator);
		cards.subList(13, 26).sort(cardComparator);
		cards.subList(26, 39).sort(cardComparator);
		cards.subList(39, 52).sort(cardComparator);
		return cards;
	}
	//�Ӵ�С���
	private Comparator<Card> cardComparator = new Comparator<Card>() {
		@Override
		public int compare(Card o1, Card o2) {
			return -o1.compareTo(o2);
		}
	};
}
