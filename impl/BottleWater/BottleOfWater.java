package DZ.DZ_1.impl.BottleWater;

import java.time.LocalDate;

import DZ.DZ_1.Product;

public class BottleOfWater extends Product {

    private int volume;
    private String pack;
    private boolean isSpark;

    public BottleOfWater(String name, int price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.isSpark = false;
        this.pack = EPackage.PLASTIC.getMaterial();
    }

    public BottleOfWater(String name, int price, LocalDate releaseDate, boolean spark, String pack, int volume) {
        super(name, price, releaseDate, volume, volume);
        this.isSpark = false;
        this.volume = volume;
        this.pack = pack;
    }

    public String getPack() {
        return pack;
    }

    public boolean isSpark() {
        return isSpark;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                "volume=" + volume +
                ", pack='" + pack + '\'' +
                ", isSpark=" + isSpark +
                '}';
    }
}