package model;

public enum SizeType {
    SMALL("Pequena"),
    DEFAULT("Média"),
    LARGE("Grande");

    private final String size;

    SizeType(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
