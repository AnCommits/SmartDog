public class SmartDogOwner {

    public static String woofDecoder(String str) {
        StringBuilder result = new StringBuilder();
        for (String woofs : str.toLowerCase().split("!")) {
            int n = countWoofs(woofs);
            if (n > 26) return "just barking!";
            if (n > 0) result.append((char) ('a' - 1 + n));
        }
        return result.length() > 0 ? result.toString() : "nothing to decode!";
    }

    static int countWoofs(String woofs) {
        int result = 0;
        for (String woof : woofs.split("-")) {
            result += isValidWoof(woof) ? 1 : 0;
        }
        return result;
    }

    static boolean isValidWoof(String woof) {
        int w = woof.indexOf('w');
        int f = woof.lastIndexOf('f');
        if (w < 0 || f <= w) return false;
        String s = woof.substring(w, f);
        return s.indexOf('o') != s.lastIndexOf('o');
    }
}
