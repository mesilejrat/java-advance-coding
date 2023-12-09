package exercise18_19;

import java.util.Objects;

public class Laptop extends Computer {
    private Integer batteryParameter;

    public Laptop(String processor, String ram, String graphicsCard, String company, String model, Integer batteryParameter) {
        super(processor, ram, graphicsCard, company, model);
        this.batteryParameter = batteryParameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(batteryParameter, laptop.batteryParameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryParameter);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryParameter=" + batteryParameter +
                '}' + super.toString();
    }

    public Integer getBatteryParameter() {
        return batteryParameter;
    }

    public void setBatteryParameter(Integer batteryParameter) {
        this.batteryParameter = batteryParameter;
    }
}
