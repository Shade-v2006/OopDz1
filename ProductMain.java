package DZ.DZ_1;

import java.time.LocalDate;

import java.util.List;

import DZ.DZ_1.impl.BottleWater.BottleOfWater;
import DZ.DZ_1.impl.BottleWater.EPackage;

import DZ.DZ_1.impl.BottleWater.WaterVendingMachine;
import DZ.DZ_1.impl.HotDrink.HotDrink;
import DZ.DZ_1.impl.HotDrink.HotDrinksVendingMachine;

public class ProductMain {

    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));
        Product glass = new HotDrink("Кофе", 150, LocalDate.now(), 80, 100);
        Product glass1 = new HotDrink("Чай", 100, LocalDate.now(), 90, 100);
        Product glass2 = new HotDrink("Кокао", 120, LocalDate.now(), 70, 100);

        Product bottle2 = new BottleOfWater("Родники Газированная", 55,
                LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 50);

        VendingMachine vm = new WaterVendingMachine();

        VendingMachine vm1 = new HotDrinksVendingMachine();

        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2,
                bottle2));

        vm1.addProducts(List.of(glass, glass1, glass2, glass1));

        System.out.println(vm1.getProducts());

        vm1.getProduct("Чай", 100, 90);
        vm1.getProduct("Чай", 100, 90);

        System.out.println();

        System.out.println(vm1.getProducts());
    }
}
