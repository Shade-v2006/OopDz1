package DZ.DZ_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class VendingMachine {

    protected List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products, List<Integer> volume, List<Integer> temperature) {
        this.products = products;

    }

    public Product getProduct(String name, int volume, int temperature) {
        Iterator<Product> iterator = products.iterator();

        while (iterator.hasNext()) {
            Product product = iterator.next();

            // Проверяем соответствие имени продукта
            if (!product.getName().equals(name)) {
                continue; // Если имя не совпадает, переходим к следующему продукту
            }

            // Проверяем соответствие объема
            if (product.getVolume() != volume) {
                continue; // Если объем не совпадает, переходим к следующему продукту
            }

            // Проверяем соответствие температуры
            if (product.getTemperature() != temperature) {
                continue; // Если температура не совпадает, переходим к следующему продукту
            }

            // Если все три параметра совпадают, удаляем продукт из списка и возвращаем его
            iterator.remove();
            return product;
        }

        // Если продукт не найден, возвращаем null или другое значение по вашему выбору
        return null;
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public abstract void addProducts(List<Product> products);

    public Product getProduct(String name) {

        // products.stream().filter(product ->
        // product.getName().equals(name)).findFirst().orElse(null);

        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
        }

        System.out.println("No such product: " + name);
        return null;
    }

    // public Product getProduct(String name) {
    //
    // for (Product product : products) {
    // if (product.getName().equals(name)) {
    // products.remove(product);
    // return product;
    // }
    // }
    //
    // throw new RuntimeException("No such product: " + name);
    // }

    public List<Product> getProducts() {
        return products;
    }
}