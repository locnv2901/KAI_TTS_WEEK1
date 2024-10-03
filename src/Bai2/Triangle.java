package Bai2;

public enum Triangle {
    NONE("Không phải tam giác"),
    NORMAL("Tam giác thường"),
    RIGHT_TRIANGLE("Tam giác vuông"),
    ISOSCELES_TRIANGLE("Tam giác cân"),
    ISOSCELES_RIGHT_TRIANGLE("Tam giác vuông cân");

    private final String description;

    Triangle(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return this.name();
    }
}
