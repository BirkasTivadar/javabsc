package introexceptionthrow;

public class Validation {

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    private boolean isNumber(String strNUmber) {
        char[] num = strNUmber.toCharArray();
        for (char c : num) {
            if (!(Character.isDigit(c) || c == '-')) {
                return false;
            }
        }
        return true;
    }

    public void validateName(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Invalid name");
        }
    }

    public void validateAge(String ageString) {
        if (isEmpty(ageString)) throw new IllegalArgumentException("Age must be not empty");

        if (!isNumber(ageString)) throw new IllegalArgumentException("Age must be number");

        int age = Integer.parseInt(ageString);
        if (0 > age || age > 120)
            throw new IllegalArgumentException("Age must be older than zero and younger than 120 years");
    }
}
