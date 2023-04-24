package OOP;

public class ServiceStation {
    public void check(Auto auto) {
        if (auto.getClass() == Car.class) {
            System.out.println("Обслуживаем " + auto.getModelName());
            for (int i = 0; i < auto.getWheelsCount(); i++) {
                auto.updateTyre();
            }
            auto.checkEngine();
        } else if (auto.getClass() == Truck.class) {
            System.out.println("Обслуживаем " + auto.getModelName());
            for (int i = 0; i < auto.getWheelsCount(); i++) {
                auto.updateTyre();
            }
            auto.checkEngine();
            auto.checkTrailer();
        } else if (auto.getClass() == Bicycle.class) {
            System.out.println("Обслуживаем " + auto.getModelName());
            for (int i = 0; i < auto.getWheelsCount(); i++) {
                auto.updateTyre();
            }
        }
    }
}
