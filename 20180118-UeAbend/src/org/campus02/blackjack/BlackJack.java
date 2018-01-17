package org.campus02.blackjack;

import java.util.HashMap;

public class BlackJack {

	// Attribute
	private HashMap<Player, Integer> map = new HashMap<>();
	
	
	// Methoden
	public boolean add(Player add)
	{
		if (map.containsKey(add))
			return false;
		// player ist noch nicht in der liste
		map.put(add, 0);
		
		return true;
	}
	
	public boolean addCard(Player p, Integer cardValue)
	{
		if (!map.containsKey(p))
			return false;
		// player ist noch nicht in der list
		
		Integer currentCardValue = map.get(p);
		currentCardValue += cardValue;
		map.put(p, currentCardValue);
		
		return true;
	}
	
	public Integer getValue(Player p)
	{
		return map.get(p);
	}
	
	
	public String toString()
	{
		String result = "";
		for(Player player : map.keySet())
		{
			result += player.getName() + ", Kartenwert: " 
					+ map.get(player) + "\n";
		}
		return result;
	}
	
	public HashMap<String, Integer> getPlayerAgeGroup()
	{
		HashMap<String, Integer> mapReturn = new HashMap<>();
		mapReturn.put("not allowed", 0);
		mapReturn.put("starter", 0);
		mapReturn.put("young professional", 0);
		mapReturn.put("professional", 0);
		mapReturn.put("old professional", 0);
		
		for (Player player : map.keySet()) {
			if (player.getAge() <= 18)
			{
				int value = mapReturn.get("not allowed"); // auslesen
				value++; // erhöhen
				mapReturn.put("not allowed", value); // schreiben
			} 
			else if (player.getAge() <= 25)
				mapReturn.put("starter", mapReturn.get("starter") +1);
			else if (player.getAge() <= 36)
				mapReturn.put("young professional", mapReturn.get("young professional") +1);
			else if (player.getAge() <= 57)
				mapReturn.put("professional", mapReturn.get("professional") +1);
			else
				mapReturn.put("old professional", mapReturn.get("old professional") +1);		
		}
		
		return mapReturn;	
	}
	
	public Integer getValue(String name)
	{
		for (Player player : map.keySet()) {
			if (player.getName().equals(name))
				return map.get(player);
		}
		return 0;
	}
}
