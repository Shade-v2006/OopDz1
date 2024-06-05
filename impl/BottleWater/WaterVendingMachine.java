package DZ.DZ_1.impl.BottleWater;

import java.util.List;

import DZ.DZ_1.Product;
import DZ.DZ_1.VendingMachine;

public class WaterVendingMachine extends VendingMachine {
    public WaterVendingMachine() {
        super();
    }

    public WaterVendingMachine(List<Product> products) {
        super(products);
    }

    @Override
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }
}