package stringmethods.filename;

//Gyakorlati feladatok
//        A stringmethods csomagba dolgozz!
//        Gyakorlati feladat - Fájlnevek kezelése
//        Készíts egy filename.FileNameManipulator osztályt, amely fájlnevek ellenőrzésére, illetve ehhez kapcsolódó String műveletekre alkalmas metódusokat tartalmaz.
//        Tippek:
//        Ha igény van rá, alkalmazd a metódusok láncolását! Figyelj a vezető és követő whitespace karakterekre!

public class FileNameManipulator {

    public char findLastCharacter(String str) {
        str = str.trim();
        return str.charAt(str.length() - 1);
    }

    public String findFileExtension(String fileName) {
        fileName = fileName.trim();
        int index = fileName.lastIndexOf(".");
        return fileName.substring(index + 1);
    }

    public boolean identifyFilesByExtension(String ext, String filename) {
        filename = filename.trim();
        ext = ext.trim();
        return filename.endsWith(ext);
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        searchedFileName = searchedFileName.trim();
        actualFileName = actualFileName.trim();
        return searchedFileName.equals(actualFileName);
    }

    public String changeExtensionToLowerCase(String fileName) {
        String extension = this.findFileExtension(fileName).toLowerCase();
        int index = fileName.lastIndexOf(".");
        String nameWithDot = fileName.substring(0, index + 1);

        return nameWithDot + extension;
    }

    public String replaceStringPart(String fileName, String present, String target) {
        fileName = fileName.trim();
        if (fileName.contains(present)) {
            return fileName.replace(present, target);
        }
        return fileName;
    }

    public static void main(String[] args) {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();

        System.out.println(fileNameManipulator.findLastCharacter("hello.java"));
        System.out.println(fileNameManipulator.findFileExtension("hello.java"));
        System.out.println(fileNameManipulator.identifyFilesByExtension("java", "hello.java"));
        System.out.println(fileNameManipulator.compareFilesByName("hello.java", "hello.java"));
        System.out.println(fileNameManipulator.changeExtensionToLowerCase("hello.JAVA"));
        System.out.println(fileNameManipulator.replaceStringPart("hello.JAVA", "ll", "bp"));
        System.out.println(fileNameManipulator.replaceStringPart("hello.JAVA", "bp", "kg"));
    }
}
