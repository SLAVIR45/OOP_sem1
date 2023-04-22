public class Product 
{
protected String name;
protected Integer price;
protected Integer quantity;
protected String unit;

public Product(String name, Integer price, Integer quantity, String unit) 
{
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.unit = unit;

}
@Override
public String toString() 
{
    return String.format("Название: %s || Цена: %d || Колличество: %d || Ед.измерения: %s", name, price, quantity, unit);
}
}