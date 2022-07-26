/*
MediumBox, amely M méretű és 2000 Ft a szállítási díja.
*/

package interfacedependencyinversion.box;

public class MediumBox implements Box {
    @Override
    public Size getSize() {
        return Size.M;
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
