package weatherreport;

public class HighPrecipitationLowWindStub implements IWeatherSensor {

    @Override
    public int Humidity() {
        return 72; // Stubbed humidity
    }

    @Override
    public int Precipitation() {
        return 70; // Stubbed precipitation
    }

    @Override
    public double TemperatureInC() {
        return 26; // Stubbed temperature
    }

    @Override
    public int WindSpeedKMPH() {
        return 30; // Stubbed wind speed
    }
}
