package modelo;

public class Coordenada 
{
    private double x;
    private double y;

    public Coordenada()
    {

    }

    public Coordenada(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() 
    {
        return x;
    }

    public void setX(double x) 
    {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) 
    {
        this.y = y;
    }

    @Override
    public String toString() 
    {
        return "(" + x+"," + y + ")";
    }

    @Override
    public boolean equals(Object obj) 
    {
        Coordenada cord = (Coordenada)obj;
        return x == cord.getX() && y == cord.getY();

    }

}
