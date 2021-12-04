public class Chroma
{
    private int r;
    private int g;
    private int b;

    public Chroma(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
    	this.b = b;
    }

    public static final Chroma RED = new Chroma(255, 0, 0);
    public static final Chroma BLUE = new Chroma(0, 0, 255);
    public static final Chroma GREEN = new Chroma(0, 255, 0);
    public static final Chroma CYAN = new Chroma(0,255,255);

    public double hue()
    {
        double h = 0;
        int max = Math.max(Math.max(r,g),b);
        int min = Math.min(Math.min(r,g),b);

        if (max==min) {
            return -1;
        }

        if (r == max) {
            h = (g-b)/(max-min);
        }

        else if (g == max) {
            h = 2.0 + (b-r)/(max-min);
        }

        else if (b == max) {
            h = 4.0 + (r-g)/(max-min);
        }
        // return h*60 // degrees from 0-360 --> h from 0-6
        h *= (Math.PI/3);
        if (h < 0) {
            h += 2*Math.PI;
        }
        return h;
    }

    @Override
    public String toString()
    {
	   return r + ", " + b + "," + g;
    }
}
