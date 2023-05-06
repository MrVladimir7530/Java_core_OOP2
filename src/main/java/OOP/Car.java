package OOP;

public class Car extends Auto{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Car(){
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
        System.out.println("Проверяем двигатель");
    }
}
