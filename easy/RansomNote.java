class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        ArrayList list = new ArrayList();
        boolean match = true;

        for(int i = 0; i < magazine.length(); i++) {
            list.add(magazine.charAt(i));
        }

        for(int i = 0; i < ransomNote.length(); i++) {
            if (list.contains(ransomNote.charAt(i))) {
                list.remove(list.indexOf(ransomNote.charAt(i)));
            } else {
                match = false;
                break;
            }
        }
        return match;
    }
}
