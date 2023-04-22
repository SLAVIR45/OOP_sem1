public class Product_expiration_date extends Product
{
String exp_data;

public Product_expiration_date(String name, Integer price, Integer quantity, String unit, String exp_data)
{
    super(name, price, quantity, unit);
    this.exp_data = exp_data;
}

@Override
public String toString() 
{
    return  super.toString() + " || срок годности: " + exp_data;
}

}

