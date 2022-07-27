/*
A Point osztály final long x, long y és long z attribútumokkal rendelkezik.
*/

package interfaceextends.robot;

public record Point(long x, long y, long z) {

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
