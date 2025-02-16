class Solution {
    public int countValidWords(String sentence) {
        int count =0;
        String[] words=sentence.trim().split("\\s+");
        for(String word:words){
            if(word.matches("^[a-z]+(-[a-z]+)?[!,.]?|[!,.]$")){
                count++;
            }
        }    
        return count;
    }
}