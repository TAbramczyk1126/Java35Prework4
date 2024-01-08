public class Prework4TaskAdd6 {

    public static void main(String[] args) {

        System.out.println(getNumberOfSignsContains("Java Enterprise Edition", 'i'));
    }

    public static int getNumberOfSignsContains(String sentence, char sign) {

        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == sign)
                count++;
        }
        return count;
    }
}