class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < strs[0].length(); i++){
            char target = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(strs[j].length() <= i || strs[j] == (null)){
                    return sb.toString();
                }
                else if(strs[j].charAt(i) != target){
                    return sb.toString();
                }
            }
            sb.append(target);
        }

        return sb.toString();
    }
}