public class Trucks extends MotorTransport {

    public Trucks (String modelName) {
        super(modelName, 6);
    }
    public Trucks (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void service() {
        super.service();
        checkTrailer();
    }
}