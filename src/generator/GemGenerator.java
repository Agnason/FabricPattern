package generator;

import product.GameItem;
import product.GemReward;

/**
 * фабрика создания продукта Gem
 *
 * @return
 */
public class GemGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}
