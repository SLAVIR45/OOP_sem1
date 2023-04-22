

public class Bread extends Product_expiration_date
{
    String Type_of_flour;
    public Bread(String name, Integer price, Integer quantity, String unit, String exp_data, String Type_of_flour)
    {
        super(name, price, quantity, unit, exp_data);
        this.Type_of_flour = Type_of_flour;
    }

    @Override
    public String toString() {
        return super.toString() + " || Тип муки: " + Type_of_flour;
    }
}
