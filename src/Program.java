import java.util.ArrayList;

public class Program
{
    ArrayList <Product> list_of_product = new ArrayList<Product>();
    public void add_list(Product product)
    {
        list_of_product.add(product);
    }

    public void  view_list (ArrayList list)
    {
        for (Object item: list)
        {
            System.out.println(item);
            System.out.println();
        }
    }
}
