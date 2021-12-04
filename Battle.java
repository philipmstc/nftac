public class Battle
{
	public static void testBattle(UnitQueue player1, UnitQueue player2)
	{
		Unit p1Current = player1.peek();
		Unit p2Current = player2.peek();
		while (!(player1.isEmpty() || player2.isEmpty())) 
		{
			p1Current.dealDamage(p2Current);
			p2Current.dealDamage(p1Current);

			if (p1Current.isDead())
			{
				player1.remove();
				p1Current = player1.peek();
			}

			if (p2Current.isDead())
			{
				player2.remove();
				p2Current = player2.peek();
			}
		}
		if (player1.isEmpty() && player2.isEmpty())
		{
			System.out.println("------- DRAW -------");
		}
		else if (player1.isEmpty())
		{
			System.out.println("--- PLAYER 2 WIN ---");
		}
		else
		{
			System.out.println("--- PLAYER 1 WIN ---");
		}
	}
}