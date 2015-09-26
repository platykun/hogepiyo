package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import hogepiyo.Card;

public class CardTest {

	Card card;

	@Before
	public void before() {

	}

	@Test
	public void コンストラクタ() {

		Card card = new Card();
		assertEquals(0, card.getPower());
		assertEquals(0, card.getRank());
	}

	@Test
	public void 引数付きコンストラクタ() {

		Card card = new Card(1, 2);
		assertEquals(1, card.getRank());
		assertEquals(2, card.getPower());
	}

	@Test
	public void ゲッターセッター() {

		Card card = new Card();

		card.setPower(3);
		card.setRank(5);

		assertEquals(3, card.getPower());
		assertEquals(5, card.getRank());
	}

	@Test
	public void 価値比較メソッド() {

		Card card1_10 = new Card(1, 10);
		Card card1_30 = new Card(1, 30);
		Card card3_10 = new Card(3, 10);
		Card card5_30 = new Card(5, 30);

		assertEquals(-1, card1_10.compareRankPower(card1_30));
		assertEquals(0, card1_10.compareRankPower(card1_10));
		assertEquals(1, card1_30.compareRankPower(card1_10));
		assertEquals(-1, card1_10.compareRankPower(card3_10));
		assertEquals(1, card1_30.compareRankPower(card1_10));
		assertEquals(-1, card5_30.compareRankPower(card1_10));
		assertEquals(1, card1_10.compareRankPower(card5_30));

	}

}
