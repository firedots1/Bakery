import java.util.ArrayList;

public class BakeryStore {

    private ArrayList<BakedGoods> storeItems = new ArrayList<>();

    public BakeryStore() {
        populateStoreItems();
    }

    public void populateStoreItems() {

        storeItems.add(new BakedGoods(" White Bread ", 10.95, "5/30/2020 ",
                21, "gluten free, dairy free, egg free, soy free," +
                " nut free, vegan ","Breads & Muffins "));

        storeItems.add(new BakedGoods("Cinnamon Raisin Bread ", 10.95, "6/1/2020",
                15, "gluten free, dairy free, egg free, nut free, sesame free",
                "Breads & Muffins "));

        storeItems.add(new BakedGoods("Large Hamburger Buns ", 5.00, "8/15/2020",
                30, "gluten free, dairy free, nut free, sesame free ",
                "Breads & Muffins "));

        storeItems.add(new BakedGoods("3-Pack Muffins ", 8.25, "8/30/2020",
                12, "nut free, sesame free ","Breads & Muffins "));

        storeItems.add(new BakedGoods("Remedy Cookie Brownie Bar ", 4.95, "7/31/2020",
                10, "gluten free, soy free, nut free, sesame free ",
                "Brownies & Bars "));

        storeItems.add(new BakedGoods("Powdered Brownie ", 4.50, "7/15/2020",
                17, "gluten free, sesame free ","Brownies & Bars "));

        storeItems.add(new BakedGoods("Vegan Cookie Dough ", 2.50, "7/4/2020",
                9, "gluten free, dairy free, egg free, soy free, nut free, " +
                "sesame free, vegan ","Cookies "));
    }

    public ArrayList<String> searchStore(String StrToSearch) {
        ArrayList<String> selectedItems = new ArrayList();
        switch(StrToSearch) {
            case "all":
                for (int i = 0; i < storeItems.size(); i++) {
                    selectedItems.add(storeItems.get(i).toString());
                }
            default:
                for (int i = 0; i < storeItems.size(); i++) {
                    selectedItems.add(storeItems.get(i).toString());
                }
        }
        return selectedItems;
    }

}
