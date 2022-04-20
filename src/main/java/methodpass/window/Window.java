package methodpass.window;

/*
Gyakorlati feladat - Ablakok mérete
        Egy ház tervezése közben gyakran előfordul, hogy a megrendelő változtatni szeretne bizonyos méreteken.

        Hozz létre egy Window osztályt, amelynek String roomName, int width és int height attribútumai legyenek! A szélesség és a magasság centiméterben értendők.

        Majd hozz létre egy WindowOperation osztályt, amelynek legyen egy void riseSize(List<Window> windows, int plusSize)metódusa! Ez a metódus megkapja egy családi ház ablakainak listáját (ami alapján majd megrendelik az ablakok gyártását), és megnöveli az összes ablak magasságát a megadott egész számmal (centiméterrel) nagyobbra.
*/

public class Window {
    private String roomName;
    private int width;
    private int height;

    public Window(String roomName, int width, int height) {
        this.roomName = roomName;
        this.width = width;
        this.height = height;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
