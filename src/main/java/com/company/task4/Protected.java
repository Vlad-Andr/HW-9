package com.company.task4;

public class Protected {
    private Thing thing;

    public Protected(Thing thing)
    {
        this.thing = thing;
    }

    public Thing getThing() {
        return thing;
    }

    public void setThing(Thing thing) {
        this.thing = thing;
    }

    @Override
    public String toString() {
        return "Protected{" +
                "thing=" + thing +
                '}';
    }
}
