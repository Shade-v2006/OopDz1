package DZ.DZ_1.impl.HotDrink;

import java.time.LocalDate;

import DZ.DZ_1.Product;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, int temperature, int volume) {
        super(name, volume, temperature);
    }

    public HotDrink(String name, int price, LocalDate releaseDate, int temperature, int volume) {
        super(name, price, releaseDate, temperature, volume);
        this.temperature = temperature;

    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                " temperature='" + temperature + "'" +
                ", volume='" + volume + "'" +
                "}";
    }

}
