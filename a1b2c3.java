public class a1b2c3 {
    public static void main(String[] args) {
        String s = "a1b2c3";
        String num = ""; // last seen letter's number gets stored here
        char letter = ' '; // letter gets stored here
        for (char c : s.toCharArray()) {
            if (!(c >= '0' && c <= '9')) {
                if (num != "") {
                    int n = Integer.parseInt(num); // change string to integer
                    for (int i = 0; i < n; i++) {
                        System.out.print(letter);
                    }
                }
                letter = c; // recent char
                num = ""; // starts from empty
                // logic for alphabet
            } else {
                num += c; // appends the number
            } // logic for number
        }
        int n = Integer.parseInt(num); // for last alphabet and letter print no space to print it so

        for (int i = 0; i < n; i++) {
            System.out.print(letter);
        }
    }
}
