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

    public void setItemPool(Rarity rarity, int number) {

        for (int i = 0; i < number; i++) {
            list.add(rarity);
        }
    }
}
