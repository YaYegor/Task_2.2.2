package web.model;

public class Car {
    private String model;
    private int series;
    private String driver;

    public Car(String model, int series, String driver){
        this.model = model;
        this.series = series;
        this.driver = driver;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car {" +
                "driver=" + driver +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
