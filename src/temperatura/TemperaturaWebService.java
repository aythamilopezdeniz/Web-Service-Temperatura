package temperatura;

public class TemperaturaWebService {

    public static String getWeather(java.lang.String cityName, java.lang.String countryName) {
        net.webservicex.GlobalWeather service = new net.webservicex.GlobalWeather();
        net.webservicex.GlobalWeatherSoap port = service.getGlobalWeatherSoap();
        return port.getWeather(cityName, countryName);
    }

    public static String getCitiesByCountry(java.lang.String countryName) {
        net.webservicex.GlobalWeather service = new net.webservicex.GlobalWeather();
        net.webservicex.GlobalWeatherSoap port = service.getGlobalWeatherSoap();
        return port.getCitiesByCountry(countryName);
    }
    
}
