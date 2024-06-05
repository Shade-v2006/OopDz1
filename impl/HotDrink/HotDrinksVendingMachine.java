package DZ.DZ_1.impl.HotDrink;

import java.util.List;

import DZ.DZ_1.Product;
import DZ.DZ_1.VendingMachine;

public class HotDrinksVendingMachine extends VendingMachine {
    public HotDrinksVendingMachine() {
        super();
    }

    public HotDrinksVendingMachine(List<Product> products, List<Integer> volume, List<Integer> temperature) {
        super(products, volume, temperature);
    }

    @Override
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

}
