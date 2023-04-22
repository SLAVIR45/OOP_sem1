public class Hygiene_items extends Product
{
    Integer quantity;
    public Hygiene_items(String name, Integer price, Integer quantity, String unit, Integer quant) 
    {
        super(name, price, quantity, unit);
        this.quantity = quantity;
    }
    @Override
    public String toString() 
    {
        return  super.toString() + " || Кол. в упаковке: " + quantity;
    }
}
