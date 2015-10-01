package hogepiyo;

/**
 * カードオブジェクト
 *
 * @author platykun
 *
 */
public class Card {

	private int rank;

	private int power;

	/**
	 * コンストラクタ
	 */
	public Card() {
		setRank(0);
		setPower(0);
	}

	public Card(int rank, int power) {
		setRank(rank);
		setPower(power);
	}

	public void showStatus() {
		System.out.println("rank: " + rank);
		System.out.println("power: " + power);
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	/**
	 * 引数のカードとの価値を比較する
	 *
	 * @param card
	 *            比較用カード
	 * @return 自分のカードのほうが価値が高いならtrue
	 */
	public int compareRankPower(Card card) {

		// ランクが１と５の場合は特殊な価値比較
		if (getRank() == 1 && card.getRank() == 5) {
			return 1;
		}
		if (getRank() == 5 && card.getRank() == 1) {
			return -1;
		}

		if (getRank() > card.getRank()) {
			return 1;
		}

		if (getRank() < card.getRank()) {
			return -1;
		}

		// ランクが引数のカードと等しい場合
		if (getPower() > card.getPower()) {
			return 1;
		}
		if (getPower() < card.getPower()) {
			return -1;
		}

		return 0;
	}

}
