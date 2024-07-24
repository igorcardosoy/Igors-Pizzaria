package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class Pizza {
    private final String cheese;
    private final List<String> toppings;

    private final SizeType size;
    private final CrustType crust;

    private Pizza(SizeType size, CrustType crust, String cheese, List<String> toppings) {
        this.cheese = cheese;
        this.toppings = new LinkedList<>(toppings);
        this.size = SizeType.valueOf(size.name());
        this.crust = CrustType.valueOf(crust.name());
    }

    public SizeType getSize() {
        return SizeType.valueOf(size.name());
    }

    public CrustType getCrust() {
        return CrustType.valueOf(crust.name());
    }

    public String getCheese() {
        return cheese;
    }

    public List<String> getToppings() {
        return new ArrayList<>(toppings);
    }

    @Override
    public String toString() {
        return "Pizza {" +
                " cheese='" + cheese + '\'' +
                ", toppings=" + toppings +
                ", size=" + size +
                ", crust=" + crust +
                " } ";
    }

    public static class Builder {
        private SizeType size;
        private CrustType crust;
        private String cheese;
        private final List<String> toppings;

        public Builder() {
            this.size = SizeType.DEFAULT;
            this.crust = CrustType.THIN;
            this.cheese = "Mussarela";
            this.toppings = new LinkedList<>();
        }

        public Builder size(SizeType size) throws IllegalArgumentException {
            if (size == null) {
                throw new IllegalArgumentException("Size cannot be null");
            }

            this.size = size;
            return this;
        }

        public Builder crust(CrustType crust) throws IllegalArgumentException {
            if (crust == null) {
                throw new IllegalArgumentException("Crust cannot be null");
            }

            this.crust = crust;
            return this;
        }

        public Builder cheese(String cheese) throws IllegalArgumentException {
            if (cheese == null) {
                throw new IllegalArgumentException("Cheese cannot be null or empty");
            }

            if (!cheese.isBlank()) {
                this.cheese = cheese;
            }

            return this;
        }

        public Builder addTopping(String topping) throws IllegalArgumentException {
            if (topping == null) {
                throw new IllegalArgumentException("Topping cannot be null or empty");
            }

            if (!topping.isBlank()) {
                this.toppings.add(topping);
            }

            return this;
        }

        public Pizza build() {
            return new Pizza(size, crust, cheese, toppings);
        }

    }
}


