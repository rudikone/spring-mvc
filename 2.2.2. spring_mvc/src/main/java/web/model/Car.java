package web.model;

public class Car {
    private String color;
    private String model;
    private String series;

    public Car(String color, String model, String series) {
        this.color = color;
        this.model = model;
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", series='" + series + '\'' +
                '}';
    }
}
