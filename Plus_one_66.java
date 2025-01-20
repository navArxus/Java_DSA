public class Plus_one_66 {
    public static int[] plusOne(int[] digits) {

        int carry = 0;
        if (digits[digits.length - 1] == 9) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                    carry = 1;
                } else if (carry == 1) {
                    digits[i] = digits[i] + 1;
                    carry = 0;
                    break;
                }
            }
            if (carry == 1) {
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;
                for (int i = 1; i < newDigits.length; i++) {
                    newDigits[i] = digits[i - 1];
                }
                return newDigits;
            }
            return digits;
        } else {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }

    }

    public static void main(String[] args) {
        int[] digitsValue = new int[] { 9,8,9 };
        int[] arr = plusOne(digitsValue);
        for (int i : arr) {
            System.out.print(i);
        }

    }
}
