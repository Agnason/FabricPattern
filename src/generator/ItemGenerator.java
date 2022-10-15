package generator;

import product.GameItem;

/**
 * абстрактный класс (заготовка) для фабрики(генератора) продукта (ItemGenerator)
 */
public abstract class ItemGenerator {

    public void openReward() {
        GameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract GameItem createItem();

}
