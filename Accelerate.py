package example;



import ev3dev.actuators.lego.motors.EV3LargeRegulatedMotor;
import ev3dev.sensors.Battery;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class HomeworkOfSomeType {

    public static void main(final String[] args){

        System.out.println("Creating Motor A & D");
        final EV3LargeRegulatedMotor motorLeft = new EV3LargeRegulatedMotor(MotorPort.A);
        final EV3LargeRegulatedMotor motorRight = new EV3LargeRegulatedMotor(MotorPort.D);

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                System.out.println("Emergency Stop");
                motorLeft.stop();
                motorRight.stop();
            }
        }));

        System.out.println("Defining the Stop mode");
        motorLeft.brake();
        motorRight.brake();
        
        int motorSpeed = 10;
        motorLeft.setSpeed(motorSpeed);
        motorRight.setSpeed(motorSpeed);
        
        motorLeft.forward();
        motorRight.forward();
        while(true){
        	motorSpeed++ ;
        	motorLeft.setSpeed(motorSpeed);
            motorRight.setSpeed(motorSpeed);
            motorLeft.forward();
            motorRight.forward();
            Delay.msDelay(100);
}}
}
    
