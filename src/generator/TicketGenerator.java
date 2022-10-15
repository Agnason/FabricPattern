package generator;

import product.GameItem;
import product.HealthReward;
import product.TicketReward;

/**
 * фабрика создания продукта Ticket
 *
 * @return
 */
public class TicketGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new TicketReward();
    }
}
