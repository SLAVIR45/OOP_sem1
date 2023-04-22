public class toilet_paper extends Hygiene_items
{
    Integer number_of_layers;
    public toilet_paper(String name, Integer price, Integer quantity, String unit, Integer quant, Integer number_of_layers)
    {
        super(name, price, quantity, unit, quant);
        this.number_of_layers = number_of_layers;
    }

    @Override
    public String toString() {
        return super.toString() + " || Кол. слоев: " + number_of_layers;
    }
}
