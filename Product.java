package DZ.DZ_1;

import java.time.LocalDate;

public class Product {

    protected String name;
    protected int price;
    protected LocalDate releaseDate;
    protected int temperature;
    protected int volume;

    public Product(String name, int price, LocalDate releaseDate, int temperature, int volume) {
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
        this.temperature = temperature;
        this.volume = volume;
    }

    public Product(String name, int volume, int temperature) {
        this.name = name;
        this.temperature = temperature;
        this.volume = volume;
    }

    public Product(String name, int price, LocalDate releaseDate) {
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
