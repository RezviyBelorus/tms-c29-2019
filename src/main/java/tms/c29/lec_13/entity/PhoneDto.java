package tms.c29.lec_13.entity;

import java.util.Objects;

public class PhoneDto {
    private String model;
    private int price;

    public PhoneDto(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PhoneDto phoneDto = (PhoneDto) o;
        return price == phoneDto.price && Objects.equals(model, phoneDto.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            model,
            price);
    }

    @Override
    public String toString() {
        return "PhoneDto{" +
            "model='" + model + '\'' +
            ", price=" + price +
            '}';
    }
}
