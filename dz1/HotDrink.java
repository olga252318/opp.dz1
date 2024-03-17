public class HotDrink extends Product {

    private int temperature;
    private double volume;

    public HotDrink(String name, int price) {
        super(name, price);
    }

    public HotDrink(String name, int price, int temperature, double volume){
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    
}
