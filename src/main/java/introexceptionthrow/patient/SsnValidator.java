package introexceptionthrow.patient;

public class SsnValidator {

    public boolean isValidSsn(String ssn) {
        if (ssn.length() != 9) {
            throw new IllegalArgumentException("Wrong SSN");
        }

        try {
            Integer.parseInt(ssn);
        } catch (NumberFormatException nfe) {
            throw new NumberFormatException("SSN must be number");
        }

        char[] ssnArray = ssn.toCharArray();
        int[] ssnDigits = new int[9];
        for (int i = 0; i < 9; i++) {
            ssnDigits[i] = ssnArray[i] - 48;
        }

        return isVallidNumber(ssnDigits);
    }

    private boolean isVallidNumber(int[] digits) {
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            sum += i % 2 == 0 ? digits[i] * 3 : digits[i] * 7;
        }
        return sum % 10 == digits[8];
    }
}
