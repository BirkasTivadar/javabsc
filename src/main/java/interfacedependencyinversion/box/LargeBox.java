/*
LargeBox, amely L méretű és 3000 Ft-ba kerül a küldése.
*/

package interfacedependencyinversion.box;

public class LargeBox implements Box {

    @Override
    public Size getSize() {
        return Size.L;
    }

    @Override
    public int getPrice() {
        return 3000;
    }
}
