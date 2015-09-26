package hogepiyo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

	public static void main(String[] args) {

		Player player = new Player();
		Player enemy = new Player();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 5; i++) {
			try {
				int input = Integer.parseInt(br.readLine());
				Card playerCard = player.putCard(input);
				Card enemyCard = enemy.putCard(0);

				int result = playerCard.compareRankPower(enemyCard);
				if (result == 1) {
					player.addPlayerPoint(Math.abs(playerCard.getPower() - enemyCard.getPower()));
				} else if (result == -1) {
					enemy.addPlayerPoint(Math.abs(playerCard.getPower() - enemyCard.getPower()));
				}

			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
