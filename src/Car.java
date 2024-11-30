public class Car extends Vehicle implements Serviceable {
    public Car(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check() {
        super.check();
        this.checkEngine();
    }
}