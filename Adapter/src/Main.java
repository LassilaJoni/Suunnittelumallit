public class Main {
    public static void main(String[] args) {
        OilTemperatureSensor sensor = new OilTemperatureSensor();
        System.out.println("Temperature in Celsius: " + sensor.getTemperatureInCelsius());

        OilTemperatureSensorIF sensorInFahrenheit = new OilTemperatureSensorAdapter(sensor);
        System.out.println("Temperature in Fahrenheit: " + sensorInFahrenheit.getTemperatureInFahrenheit());
    }
}