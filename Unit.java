public class Unit
{
    private int attack;
    private int defense;

    private double health;

    private Chroma attackValue;
    private Chroma defenseValue;

    private String name = "";

    public Unit(int attack, int defense, Chroma attackValue, Chroma defenseValue)
    {
        this.attack = attack;
        this.defense = defense;
        this.health = defense + 0.0;
        this.attackValue = attackValue;
        this.defenseValue = defenseValue;
    }

    public Unit(String name, int attack, int defense, Chroma color)
    {
        this(attack, defense, color, color);
        this.name = name;
    }

    public Unit(int attack, int defense, Chroma color)
    {
        this(attack, defense, color, color);
    }

    public Chroma attackValue()
    {
        return this.attackValue;
    }

    public Chroma defenseValue()
    {
        return this.defenseValue;
    }

    public int attack()
    {
        return this.attack;
    }

    public int defense()
    {
        return this.defense;
    }

    public boolean isDead()
    {
        return this.health <= 0;
    }

    public void dealDamage(Unit other)
    {
        System.out.println(this + " deals " + calculateDamage(this, other) + " to " + other);
        other.health -= calculateDamage(this, other);
    }

    public static double calculateDamage(Unit attacker, Unit defender)
    {
        double theta = calculateHueDiffAngle(attacker.attackValue(), defender.defenseValue());
        double modifier = 0;
        double theta_mod = 0;
        if (theta <= 4 || theta > 8)
        { 
            theta_mod = (3.0/4.0)*theta*(Math.PI/6.0);
            modifier = Math.sin(theta_mod);
        }
        else 
        {
            theta_mod = ((3.0/2.0)*(theta+6)*(Math.PI/6.0));
            modifier = Math.sin(theta_mod);
        }
        return round(Math.pow(2, modifier),2) * attacker.attack();
    }

    public static double calculateHueDiffAngle(Chroma attacker, Chroma defender)
    {
        double theta = attacker.hue() - defender.hue();
        if (theta < 0) 
        {
            theta = theta + (2*Math.PI);
        }
        return round((6 * theta / Math.PI),2);
    }

    public static double round(double d, int places)
    {
        return Math.round(d * Math.pow(10, places)) / Math.pow(10, places);
    }


    @Override
    public String toString()
    {
	   return this.name + " " + health + " / " + defense;
    }
}
