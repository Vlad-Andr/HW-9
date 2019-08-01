package com.company.task4;

public class Thing {

        private String nameThing;
        private boolean isFragile;

    public Thing(String nameThing, boolean isFragile) {
        this.nameThing = nameThing;
        this.isFragile = isFragile;
    }

    public String getNameThing() {
        return nameThing;
    }

    public void setNameThing(String nameThing) {
        this.nameThing = nameThing;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public void setFragile(boolean fragile) {
        isFragile = fragile;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "nameThing='" + nameThing + '\'' +
                ", isFragile=" + isFragile +
                '}';
    }
}


