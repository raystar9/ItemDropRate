package test.itemdroprate;

import java.util.Vector;

/**
 * Created by Koo on 2017-05-29.
 */

public class ItemPool {

    private Vector<Rarity> list = new Vector<>();

    public Rarity getItem() {
        int size = list.size();
        int indexRandom = (int) (Math.random() * size);
        return list.get(indexRandom);
    }

    public void setItemPool(int legend, int hero, int magic, int uncommon, int common) {

        for (int i = 0; i < legend; i++) {
            list.add(Rarity.legend);
        }

        for (int i = 0; i < legend; i++) {
            list.add(Rarity.legend);
        }

        for (int i = 0; i < legend; i++) {
            list.add(Rarity.legend);
        }

        for (int i = 0; i < legend; i++) {
            list.add(Rarity.legend);
        }

        for (int i = 0; i < legend; i++) {
            list.add(Rarity.legend);
        }
    }
}
