package product;

/**
 * продукт Gold
 */
public class GoldReward implements GameItem {
    @Override
    public void open() {
        System.out.println("This is gold");
    }
}
