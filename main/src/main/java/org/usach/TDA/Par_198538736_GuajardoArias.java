package org.usach.TDA;

public class Par_198538736_GuajardoArias {
    String value;
    long frequency;

    public Par_198538736_GuajardoArias(String value, long frequency) {
        this.value = value;
        this.frequency = frequency;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public long getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }


    public boolean equal(String val){
        if (this.value == val){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "[" +
                "Color'" + value + '\'' +
                ", Frecuencia: " + frequency +
                ']';
    }
}
