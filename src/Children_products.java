public class Children_products extends Product
{
    protected  Integer min_age;
    protected Boolean Hypoallergenic;

    public Children_products(String name, Integer price, Integer quantity, String unit, Integer min_age, Boolean Hypoallergenic)
    {
        super(name, price, quantity, unit);
        this.min_age = min_age;
        this.Hypoallergenic = Hypoallergenic;
    }

    @Override
    public String toString() 
    {
        return  super.toString() + " || MIN Возраст: " + min_age + " || Гипоаллергенность: " + Hypoallergenic;
    }
}
