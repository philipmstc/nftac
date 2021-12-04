import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class UnitQueue
{
	private Queue<Unit> units;

	public UnitQueue(List<Unit> units)
	{
		this.units = new LinkedList(units);
	}

	public boolean isEmpty()
	{
		return units.isEmpty();
	}

	public Unit remove()
	{
		return units.remove();
	}

	public Unit peek()
	{
		return units.peek();
	}
}