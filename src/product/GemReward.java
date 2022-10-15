package product;

/*
продукт Gem
* */
public class GemReward implements GameItem {
    @Override
    public void open() {
        System.out.println("This is gem");
    }
}
