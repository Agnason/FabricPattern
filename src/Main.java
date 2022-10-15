import generator.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
//        создаем класс Random для генерации чисел
        Random random = ThreadLocalRandom.current();
//        cоздаём коллекцию куда запишем все наши продукты
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new BookGenerator());
        generatorList.add(new GemGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new HealthGenerator());
        generatorList.add(new ManaGenerator());
        generatorList.add(new OilGenerator());
        generatorList.add(new TicketGenerator());

//        c помощью цикла и random выведем разные продукты (исходя из индекса)
        for (int i = 0; i < 50; i++) {
            int index = Math.abs(random.nextInt(generatorList.size()));
            ItemGenerator itemGenerator = generatorList.get(index);
            itemGenerator.openReward();
        }
    }
}
