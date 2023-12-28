class ReverseWordsInAString {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        String words[] = s.trim().split("\\s+");

        for(int i = words.length-1; i >= 1; i--) {
            sb.append(words[i]+" ");
        }
        sb.append(words[0]);

        return sb.toString();
    }
}
