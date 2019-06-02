public class Card implements Comparable<Card>{
	private int suit;
	private int face;
	//�����������ڼ����ϣֵ
	private double seed;
	
	public Card(int _suit, int _face) {
		suit = _suit;
		face = _face;
		seed = Math.random();
	}
	
	@Override
	public String toString() {
		String suitString;
		String faceString;
		switch (suit) {
		case 0:
			suitString = "����";
			break;
		case 1:
			suitString = "÷��";
			break;
		case 2:
			suitString = "����";
			break;
		default:
			suitString = "����";
			break;
		}
		switch (face) {
		case 0:
			faceString = "2";
			break;
		case 1:
			faceString = "3";
			break;
		case 2:
			faceString = "4";
			break;
		case 3:
			faceString = "5";
			break;
		case 4:
			faceString = "6";
			break;
		case 5:
			faceString = "7";
			break;
		case 6:
			faceString = "8";
			break;
		case 7:
			faceString = "9";
			break;
		case 8:
			faceString = "10";
			break;
		case 9:
			faceString = "J";
			break;
		case 10:
			faceString = "Q";
			break;
		case 11:
			faceString = "K";
			break;
		default:
			faceString = "A";
			break;
		}
		return "[" + suitString + " " + faceString + "]";
	}

	//�ȱȽ������ٱȽϻ�ɫ
	@Override
	public int compareTo(Card o) {
		return suit + face * 10 - o.suit - o.face * 10;
	}
	
	
}
