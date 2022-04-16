package algorithmscount.height;

/*
Gyakorlati feladat - Magassági korlát
        Egy játszótéri eszközön csak egy bizonyos magasságnál magasabb gyerekek játszhatnak. A height.Height osztályban legyen egy countChildrenWithHeightGreaterThan() metódus, amelynek két paramétere egy egész számokat tartalmazó lista, amelyben egy csapatnyi gyerek centiméterben mért magassága található, valamint egy meghatározott magassági korlát (szintén centiméterben)! A metódus feladata, hogy adja vissza, az adott gyerekcsoportból hányan játszhatnak a játszótéri játékon.
*/

import java.util.List;

public class Height {
    public int countChildrenWithHeightGreaterThan(List<Integer> heights, int i) {
        return (int) heights.stream().filter(height -> height > i).count();

    }
}
