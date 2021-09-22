package conway.test;

import java.util.HashMap;
import java.util.Map;

public class CellLifeValidator {

	public int isAlive(int neighboursCount, int cellVal) {

		Map<Integer, Integer> validators = new HashMap<Integer, Integer>() {
			{
			//	put(1, 0);
				put(2, cellVal);
				put(3, 1);
			}
		};

		return validators.getOrDefault(neighboursCount, 0);
	}
}
