import java.awt.*;

public class Saab95 extends Car {

    public TurboCar turbocar;

    public Saab95(int doors, double horsepower, double speed, Color color, String model){
        super(doors, horsepower, speed, color, model);
        this.turbocar = new TurboCar();
    }

    public double speedFactor(){
        return getEnginePower() * 0.01 * turbocar.getTurbo();
    }
}
