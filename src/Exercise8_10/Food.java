package Exercise8_10;

public enum Food {

    APPLE("Fruits", "206"),
    BANANA("Fruits", "189"),
    CARROTS("Vegetable", "153");

    private final String type;
    private final String numberOfCalories;

    Food(String type, String numberOfCalories) {
        this.type = type;
        this.numberOfCalories = numberOfCalories;
    }

    public String getType() {
        return type;
    }

    public String getNumberOfCalories() {
        return numberOfCalories;
    }

}
