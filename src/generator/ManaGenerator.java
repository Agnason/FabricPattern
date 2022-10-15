package generator;

import product.GameItem;
import product.HealthReward;
import product.ManaReward;

/**
 * фабрика создания продукта Mana
 *
 * @return
 */
public class ManaGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new ManaReward();
    }
}
