public class Palindrome {

    public boolean check(String sentence) {

        boolean isPalindrome = true;
        if(sentence.length()>0) {
            sentence = sentence.toUpperCase().replaceAll("\\s", "");
            int start_index = 0, end_index = sentence.length() - 1;
            for (; start_index < end_index; start_index++, end_index--) {
                char start_char = sentence.charAt(start_index),end_char = sentence.charAt(end_index);
                if (!(Character.isLetterOrDigit(start_char)) || !(Character.isLetterOrDigit(end_char)) || (start_char != end_char)) {
                    isPalindrome = false;
                    break;
                }
            }
        }
        return isPalindrome;

    }
}
