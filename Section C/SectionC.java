public class SectionC {
    public static void main(String[] args) {
        // test the function with some example inputs
        String[] inputs = {"0-306-40615-2", "978030640615X", "123456789X", "1234567890123", "0-321-14653-0", "9780321146534", "123]]]"};
        for (String isbn : inputs) {
            System.out.println(isbn + ": " + check_ISBN(isbn));
        }
    }

    public static String check_ISBN(String isbn) {
        // remove any hyphens or spaces from the string
        isbn = isbn.replace("-", "").replace(" ", "");

        // check if the string contains any invalid characters
        if (!isbn.matches("[0-9X]+")) {
            return "Invalid";
        }

        // convert ISBN-10 to ISBN-13
        if (isbn.length() == 10) {
            // add 978 to the start of the string
            String isbn13 = "978" + isbn.substring(0, 9);

            // calculate the check digit for ISBN-13
            int[] factor = {1, 3};// repeated 6 times
            int sum = 0;
            for (int i = 0; i < 12; i++) {
                sum += Character.getNumericValue(isbn13.charAt(i)) * factor[i % 2];
            }
            int check_digit = (10 - (sum % 10)) % 10;
            isbn13 += check_digit;

            return isbn13.equals(isbn) ? "Valid" : isbn13;
        }

        // check if the string is a valid ISBN-13
        if (isbn.length() == 13) {
            int[] factor = {1, 3};// repeated 6 times
            int sum = 0;
            for (int i = 0; i < 12; i++) {
                sum += Character.getNumericValue(isbn.charAt(i)) * factor[i % 2];
            }
            int check_digit = (10 - (sum % 10)) % 10;
            return check_digit == Character.getNumericValue(isbn.charAt(12)) ? "Valid" : "Invalid";
        }

        return "Invalid";
    }
}