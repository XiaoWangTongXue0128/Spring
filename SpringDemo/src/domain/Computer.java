package domain;

public class Computer {
    private Integer price;
    private String brand;

    public Computer(Integer price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public Computer() {
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
