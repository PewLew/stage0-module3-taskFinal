package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double temperature = (((float)temperatureCelsius)*(9/5))+32;
        System.out.println(temperature);
    }
}
