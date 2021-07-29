package com.revature.model;

public class Nose {
    private String shape;
    private Boolean pierced;

    public Nose() {
    }

    public Nose(String shape, boolean pierced) {
        this.shape = shape;
        this.pierced = pierced;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public boolean isPierced() {
        return pierced;
    }

    public void setPierced(boolean pierced) {
        this.pierced = pierced;
    }

    @Override
    public String toString() {
        return "Nose{" +
                "shape='" + shape + '\'' +
                ", pierced=" + pierced +
                '}';
    }
}
