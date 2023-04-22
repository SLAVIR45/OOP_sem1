public class Drink extends Product
{
    protected Integer volume;
    public Drink(String name, Integer price, Integer quantity, String unit, Integer volume) 
    {
        super(name, price, quantity, unit);
        this.volume = volume;
    }

    @Override
    public String toString() 
    {
        return  super.toString() + " || Обьем: " + volume;
    }
}

