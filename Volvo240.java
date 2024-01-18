import java.awt.*;

public class Volvo240 extends Car{

    public TrimCar trimcar;

    public Volvo240(int doors, double horsepower, double speed, Color color, String model){
        super(doors, horsepower, speed, color, model);
        this.trimcar = new TrimCar(1.25);
    }

    public double speedFactor(){
        return getEnginePower() * 0.01 * trimcar.getTrim();
    }

}
