class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
        String str=details[i].substring(11,13);
        
        int n=Integer.parseInt(str);
    
        if(n>60){
            count++;
        }
        }
        return count;
    }
}