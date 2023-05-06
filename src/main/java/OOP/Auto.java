package OOP;

public abstract class Auto implements AutoCheck {
    private String modelName;
    private int wheelsCount;

    public Auto(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public Auto(){
    }

    public void check(){
        System.out.println("Не предусмотренно");
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
