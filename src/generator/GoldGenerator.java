package generator;

import product.GameItem;
import product.GoldReward;

/**
 * фабрика создания продукта Gold
 *
 * @return
 */
public class GoldGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}
