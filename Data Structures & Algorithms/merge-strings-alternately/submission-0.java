class Solution {
    public String mergeAlternately(String word1, String word2) {
        int right = 0;

        StringBuilder sb = new StringBuilder();

        if(word1.length() <= word2.length()){
            right = word1.length();
        }
        else{right = word2.length();}

        for(int i = 0; i < right; i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if(word1.length() > right){
        sb.append(word1.substring(right, word1.length()));}
        else if(word2.length() > right){
            sb.append(word2.substring(right, word2.length()));
        }

        return sb.toString();
    }
}