package DZ.DZ_1.impl.BottleWater;

import java.util.List;

import DZ.DZ_1.Product;
import DZ.DZ_1.VendingMachine;

public class HotDrinkVM extends VendingMachine {

    public HotDrinkVM() {
        super();
    }

    @Override
    public void addProducts(List<Product> products) {
        System.out.println("Всегда ничего не верну");
    }
}