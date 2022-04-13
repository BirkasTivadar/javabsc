package introexceptionthrow;

public class AdultContent {

    public static void main(String[] args) {
        Adult adult = new Adult("Joe", 33);
        System.out.println(adult);

        Adult child = new Adult("John", 16);
        System.out.println(child);

    }
}
