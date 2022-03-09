package Class3;

public class Homework3 {
    public static void main(String[] args) {
        double cTemp = 16.5 ;
        double fTemp = cTemp * 9/5 + 32 ;
        System.out.println( "\n" + cTemp + "°C Celsius Conversation to Fahrenheit " + fTemp + "°F");

        double kTemp = cTemp + 273.15 ;
        System.out.println(cTemp + "°C Celsius Conversation to Kelvin " + kTemp + "K");

        fTemp = 75 ;
        cTemp = (fTemp - 32) * 5/9 ;
        System.out.println( fTemp + "°F Fahrenheit Conversation to Celsius " + cTemp +"°C");

        kTemp = ( fTemp + 459.67) * 5/9 ;
        System.out.println( fTemp + "°F Fahrenheit Conversation to Kelvin " + kTemp + "K");

        kTemp = 310 ;
        cTemp = kTemp - 273.15 ;
        System.out.println( kTemp + "K Kelvin Conversation to Celsius " + cTemp + "°C");

        fTemp = kTemp * 9/5 - 459.67 ;
        System.out.println( kTemp + "K Kelvin Conversation to Fahrenheit " + fTemp + "°F");



    }


}
