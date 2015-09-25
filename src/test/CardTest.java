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
	public void ゲッターセッター() {

		Card card = new Card();

		card.setPower(3);
		card.setRank(5);

		assertEquals(3, card.getPower());
		assertEquals(5, card.getRank());
	}

}
