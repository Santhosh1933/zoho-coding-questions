package question3;

public class Main {

    public static int countPrefix(String[] arr, String pref) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith(pref)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words1 = { "pay", "attention", "practice", "attend" };
        String pref1 = "at";
        System.out.println(countPrefix(words1, pref1));

        String[] words2 = {"leetcode", "win", "loops", "success"};
        String pref2 = "code";
        System.out.println(countPrefix(words2, pref2));
    }

}
