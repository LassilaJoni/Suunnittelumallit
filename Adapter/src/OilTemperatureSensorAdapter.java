public class OilTemperatureSensorAdapter implements OilTemperatureSensorIF {
    private OilTemperatureSensor sensor;

    public OilTemperatureSensorAdapter(OilTemperatureSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTemperatureInFahrenheit() {
        double celsius = sensor.getTemperatureInCelsius();
        return celsiusToFahrenheit(celsius);
    }

    private double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
