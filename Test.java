import java.util.List;
import java.util.ArrayList;

public class Test
{

	public static void main(String[] args)
	{
		List player1Units = new ArrayList<>();
		List player2Units = new ArrayList<>();

		player1Units.add(new Unit("P1:1/2 RED", 1,2,Chroma.RED));
		player1Units.add(new Unit("P1:1/1 RED", 1,1,Chroma.RED));

		player2Units.add(new Unit("P2:1/2 CYAN", 1,2,Chroma.CYAN));
		player2Units.add(new Unit("P2:1/1 RED", 1,1,Chroma.RED));

		UnitQueue player1 = new UnitQueue(player1Units);
		UnitQueue player2 = new UnitQueue(player2Units);
		Battle.testBattle(player1, player2);
	}

    /*public static void testColorDamages()
    {
		Unit p1 = new Unit(1,1, Chroma.RED);
		Unit p2 = new Unit(1,1, Chroma.BLUE);
		Unit p3 = new Unit(1,1, Chroma.GREEN);
		Unit p4 = new Unit(1,1, new Chroma(  0, 255, 255));
		Unit p5 = new Unit(1,1, new Chroma(255, 255,   0));
		Unit p6 = new Unit(1,1, new Chroma(255,   0, 255));

		double damage = 0;
		System.out.println("R attacks R: ");
		damage = calculateDamage(p1,p1);
		System.out.println("... dealt " + damage + " damage");
		System.out.println("R attacks B: ");
		damage = calculateDamage(p1,p2);
		System.out.println("... dealt " + damage + " damage");
		System.out.println("R attacks G: ");
		damage = calculateDamage(p1,p3);
		System.out.println("... dealt " + damage + " damage");
		System.out.println("R attacks C: ");
		damage = calculateDamage(p1,p4);
		System.out.println("... dealt " + damage + " damage");
		System.out.println("R attacks Y: ");
		damage = calculateDamage(p1,p5);
		System.out.println("... dealt " + damage + " damage");
		System.out.println("R attacks M: ");
		damage = calculateDamage(p1,p6);
		System.out.println("... dealt " + damage + " damage");

    }*/

   
}
