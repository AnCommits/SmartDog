public class SmartDogOwner {

    public static String woofDecoder(String str) {
        java.util.function.Function<String, Integer> countWoofs = woofs -> {
            java.util.function.Predicate<String> isValidWoof = woof -> {
                int w = woof.indexOf('w');
                int f = woof.lastIndexOf('f');
                if (w < 0 || f <= w) return false;
                String s = woof.substring(w, f);
                return s.indexOf('o') != s.lastIndexOf('o');
            };

            int result = 0;
            for (String woof : woofs.split("-")) {
                if (isValidWoof.test(woof)) result++;
            }
            return result;
        };

        StringBuilder result = new StringBuilder();
        for (String woofs : str.toLowerCase().split("!")) {
            int n = countWoofs.apply(woofs);
            if (n > 26) return "just barking!";
            if (n > 0) result.append((char) ('a' - 1 + n));
        }
        return result.length() > 0 ? result.toString() : "nothing to decode!";
    }
}
