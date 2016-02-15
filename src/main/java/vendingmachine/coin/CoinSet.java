package vendingmachine.coin;

import java.util.ArrayList;
import java.util.List;

public class CoinSet {
	private List<Integer> coinSet = new ArrayList<>();

	public void add(int coin) {
		coinSet.add(coin);
	}

	@Override
	public boolean equals(Object coinSet) {
		if(!(coinSet instanceof CoinSet))
			return false;

		return this.toString().equals(coinSet.toString());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		for(Integer coin : this.coinSet)
			builder.append(coin);

		return builder.toString();
	}
}

