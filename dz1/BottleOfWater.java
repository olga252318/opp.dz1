public class BottleOfWater extends Product{

    private int volume;

    public BottleOfWater(String name, int price){
        super(name, price);
    }

    public BottleOfWater(String name, int price, int volume){
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
}
