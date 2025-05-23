/*
* Name: Zainab Olajide
* Date : 5/5/2025
* Assignment : Problem 4  - Homework 11
]*/
package homework11;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable 
{
    private double side;

    public Octagon() 
    {
    }

    public Octagon(double side) 
    {
        this.side = side;
    }

    public double getSide() 
    {
        return side;
    }

    public void setSide(double side) 
    {
        this.side = side;
    }

    public double getArea() 
    {
        return 2 * (1 + Math.sqrt(2)) * side * side;
    }

    public double getPerimeter() 
    {
        return 8 * side;
    }

    @Override
    public Object clone() 
    {
        try 
        {
            return (Octagon) super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public int compareTo(Octagon other) 
    {
        return Double.compare(this.side, other.side);
    }
    public static void main(String[] args) 
    {
        Octagon o1 = new Octagon(5);

        System.out.println("Original Octagon:");
        System.out.println("Side: " + o1.getSide());
        System.out.println("Area: " + o1.getArea());
        System.out.println("Perimeter: " + o1.getPerimeter());

        Octagon o2 = (Octagon) o1.clone();

        System.out.println("\nCloned Octagon:");
        System.out.println("Side: " + o2.getSide());

        int result = o1.compareTo(o2);
        if (result == 0) 
        {
            System.out.println("\nBoth octagons are equal.");
        } 
        else if (result > 0) 
        {
            System.out.println("\nOriginal octagon is larger.");
        } 
        else 
        {
            System.out.println("\nCloned octagon is larger.");
        }
    }
}

