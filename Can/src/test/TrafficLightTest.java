package test;

public class TrafficLightTest {

	public static void main(String[] args) {
		for(TrafficLight light: TrafficLight.values()) 
		{
			System.out.printf("light: %-7s | Duration: %d seconds %n", light, light.getDuration());
		}

	}

}
