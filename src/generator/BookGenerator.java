package generator;

import product.BookReward;
import product.GameItem;
import product.GemReward;

/**
 * фабрика создания продукта Gold
 *
 * @return
 */
public class BookGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new BookReward();
    }
}
