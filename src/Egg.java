public class Egg extends Product_expiration_date
{
    Integer quan;

    public Egg(String name, Integer price, Integer quantity, String unit, String exp_data,Integer quan ) {
        super(name, price, quantity, unit, exp_data);
        this.quan = quan;
    }
    @Override
    public String toString() {
        
        return super.toString() + " || Кол. в упаковке: " + quan;
    }
}
