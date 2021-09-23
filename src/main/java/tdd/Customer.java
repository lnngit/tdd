package tdd;

import java.util.HashMap;
import java.util.Map;

public class Customer {
	private Map<String, String> map = new HashMap<>();

	public void put(String key, String value) {
		if (key != null) {
			map.put(key, value);
		}
	}

	public String get(String key) {
		if (key != null) {
			return map.get(key);
		}
		return null;
	}

}
