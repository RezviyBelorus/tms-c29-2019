package tms.c29.lec_10.classwork.point_7;

public enum Apple {
    RED(12, "USA", "countryShort") {
        @Override
        public double toPounds() {
            return this.getKg() * POUND_INDEX;
        }
    },
    GREEN(13, "Belarus", "countryShortGreen") {
        @Override
        public double toPounds() {
            return this.getKg() * POUND_INDEX;
        }
    },
    WHITE_GOLDEN(14, "Poland", "countryShortGolden") {
        @Override
        public double toPounds() {
            return this.getKg() * POUND_INDEX;
        }
    };

    private int kg;
    private String country;
    private String countryShort;
    private static final double POUND_INDEX = 1.6;

    Apple(int kg, String country, String countryShort) {
        this.kg = kg;
        this.country = country;
        this.countryShort = countryShort;
    }

    public int getKg() {
        return kg;
    }

    public String getCountry() {
        return country;
    }

    public String getCountryShort() {
        return countryShort;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public abstract double toPounds();


}
