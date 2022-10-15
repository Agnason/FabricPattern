package generator;

import product.GameItem;
import product.HealthReward;
import product.OilReward;

/**
 * фабрика создания продукта Oil
 *
 * @return
 */
public class OilGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new OilReward();
    }
}
