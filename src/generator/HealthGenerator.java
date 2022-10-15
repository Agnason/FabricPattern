package generator;

import product.BookReward;
import product.GameItem;
import product.HealthReward;

/**
 * фабрика создания продукта Health
 *
 * @return
 */
public class HealthGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new HealthReward();
    }
}
