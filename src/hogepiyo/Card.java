package hogepiyo;

/**
 * カードオブジェクト
 *
 * @author Platykun
 *
 */
public class Card {

	private int rank;

	private int power;

	/**
	 * コンストラクタ
	 */
	public Card(){
		setRank(0);
		setPower(0);
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


}
