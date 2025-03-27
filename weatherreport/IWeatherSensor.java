package weatherreport;

public interface IWeatherSensor {

    double TemperatureInC();

    int Precipitation();

    int Humidity();

    int WindSpeedKMPH();
}
