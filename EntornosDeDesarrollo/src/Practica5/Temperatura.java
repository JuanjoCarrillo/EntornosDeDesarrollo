package Practica5;

public class Temperatura {
	public float FahrenheitACelsius(float gradosF) {
		return (float)((gradosF-32)/1.8);
	}
	public float CelsiusAFahrenheit(float gradosC) {
		return (float) ((gradosC*1.8)+32);
	}
}
