class Solution {
    public int numTilePossibilities(String tiles) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:tiles.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        return backtrack(map);
    }
    public int backtrack(HashMap<Character,Integer>map){
        int count=0;
        for(char ch:map.keySet()){
            if(map.get (ch)>0){

            count++;
            map.put(ch,map.get(ch)-1);
            count+=backtrack(map);
            map.put(ch,map.get(ch)+1);
            }
        }
    
    return count;
}
}