package hogepiyo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {

	/** 手札のカード */
	private List<Card> handCards;
	/** 勝ち点 */
	private int playerPoint;

	/**
	 * オブジェクト作成時に、ランダムに手札を５枚にする。
	 */
	public Player() {

		handCards = new ArrayList<Card>();

		// ランダムで５枚手札に加える。
		Random rnd = new Random();
		for (int i = 0; i < 5; i++) {
			int rank = rnd.nextInt(5) + 1;
			int power = rnd.nextInt(200) + 1;
			Card card = new Card(rank, power);
			handCards.add(card);
		}
	}

	public void showStatus() {
		System.out.println("player");
		System.out.println("point: " + playerPoint);
		for (Card card : handCards) {
			card.showStatus();
		}
	}

	public List<Card> getHandCards() {
		return handCards;
	}

	public void addPlayerPoint(int addPoint) {
		this.playerPoint += addPoint;
	}

	public void setHandCards(List<Card> handCards) {
		this.handCards = handCards;
	}

	public int getPlayerPoint() {
		return playerPoint;
	}

	public void setPlayerPoint(int playerPoint) {
		this.playerPoint = playerPoint;
	}

	/**
	 * 手札から一枚カードを出す。
	 *
	 * @return 提示カード
	 * @throws Exception
	 *             引数例外
	 */
	public Card putCard(int cardNum) throws Exception {
		if (handCards.isEmpty()) {
			return null;
		}

		if (handCards.size() < cardNum) {
			throw new Exception("カード番号が大きすぎる");
		}

		Card returnCard = handCards.get(cardNum);
		handCards.remove(cardNum);

		return returnCard;
	}

}
