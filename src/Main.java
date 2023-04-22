public class Main
{
    public static void main(String[] args)
    {
        Program p = new Program();
        Product milk = new Milk("Derevenka", 65, 2, "шт.", 1000, 35, "14 дней");
        p.add_list(milk);
        Product bread = new Bread("Батон нарезной", 40, 1, "шт.", "7 дней", "Пшеничная");
        p.add_list(bread);
        Product egg = new Egg("Куриные яица", 100, 3, "касеты", "31 день", 10);
        p.add_list(egg);
        Product Cola = new lemonade("Cola", 100, 7, "щт.", 2000);
        p.add_list(Cola);
        Product mask = new Mask("halloween", 500, 5, "щт.", 12, true);
        p.add_list(mask);
        Product toilet_paper = new toilet_paper("Zeta", 200, 5, "уп.", 12, 2);
        p.add_list(toilet_paper);
        Product diapers = new Diapers("Hugi", 300, 6, "уп.", 10, "S", 6, 11, "Одноразовые");
        p.add_list(diapers);
        Product baby_pacifier = new Baby_pacifier("Пустышка", 120, 8, "шт.", 3, true);
        p.add_list(baby_pacifier);

        p.view_list(p.list_of_product);
    }
}
