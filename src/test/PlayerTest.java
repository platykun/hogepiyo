package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import hogepiyo.Card;
import hogepiyo.Player;

public class PlayerTest {

	Player player;

	/**
	 * 乱数が取得できているかどうかは目視確認
	 */
	@Test
	public void 初期値に５枚手札が揃っているかの確認() {

		player = new Player();

		List<Card> cardList = player.getHandCards();

		assertEquals(5, cardList.size());

		for (Card card : cardList)
			System.out.println("rank : " + card.getRank() + " power :" + card.getPower());
	}

	@Test
	public void putCardメソッドのテスト() throws Exception {

		player = new Player();

		List<Card> cardList = player.getHandCards();

		assertEquals(5, cardList.size());

		player.putCard(3);
		cardList = player.getHandCards();
		assertEquals(4, cardList.size());
		player.putCard(1);
		cardList = player.getHandCards();
		assertEquals(3, cardList.size());
		player.putCard(1);
		cardList = player.getHandCards();
		assertEquals(2, cardList.size());
		player.putCard(1);
		cardList = player.getHandCards();
		assertEquals(1, cardList.size());
		player.putCard(0);
		cardList = player.getHandCards();
		assertEquals(0, cardList.size());

	}
}
