import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.Motor;
import lejos.utility.Delay;

/**
 * Test commit
 */
public class HelloWorld {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		Motor.A.setSpeed(720);// 2 RPM
		Motor.C.setSpeed(720);
		Motor.A.forward();
		Motor.C.forward();
		Delay.msDelay(1000);
		Motor.A.stop();
		Motor.C.stop();
		
	}
}
