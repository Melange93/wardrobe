package main.cloth;

import java.util.UUID;

public abstract class Cloth {
    protected UUID id = UUID.randomUUID();
    protected String brand;

    public UUID getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }
}
