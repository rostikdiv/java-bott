package TelegramBot.javabot;

public  class MyClass {
    private String param1;
    private int param2;
    private double param3;

    // Конструктор
    public MyClass(String param1, int param2, double param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    // Геттери і сеттери
    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public int getParam2() {
        return param2;
    }

    public void setParam2(int param2) {
        this.param2 = param2;
    }

    public double getParam3() {
        return param3;
    }

    public void setParam3(double param3) {
        this.param3 = param3;
    }

    // Перевизначення методу toString() для зручного виводу даних
    @Override
    public String toString() {
        return "Param1: " + param1 + ", Param2: " + param2 + ", Param3: " + param3;
    }
}

