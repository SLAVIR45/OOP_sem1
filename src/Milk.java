public class Milk extends Drink
{
Integer fat_content;
String expir_date;

public Milk(String name, Integer price, Integer quantity, String unit, Integer volume, Integer fat_content, String expir_date ) {
    super(name, price, quantity, unit, volume);
    this.fat_content = fat_content;
    this.expir_date = expir_date;
}
@Override
public String toString() {
    return  super.toString() + " || % Жирности: " + fat_content + " || Срок годности: " + expir_date ;
}
}

