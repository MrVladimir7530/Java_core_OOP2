package OOP;

public class Car extends Auto{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Car(){
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
