public class Diapers extends  Hygiene_items
{
    String size;
    Integer min_weight;
    Integer max_weight;
    String type_of_diapers;

    public Diapers(String name, Integer price, Integer quantity, String unit, Integer quant, String size, Integer min_weight, Integer max_weight, String type_of_diapers) {
        super(name, price, quantity, unit, quant);
        this.size = size;
        this.min_weight = min_weight;
        this.max_weight = max_weight;
        this.type_of_diapers = type_of_diapers;
    }

    @Override
    public String toString() {
        return super.toString() + " || Размер: " +  size + " || Мин.вес : " + min_weight + " || Мах.вес: " + max_weight + " || Тип: " + type_of_diapers;
    }
}
