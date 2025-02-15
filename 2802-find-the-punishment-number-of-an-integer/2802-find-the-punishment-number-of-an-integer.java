class Solution {
    public int punishmentNumber(int n) {
        int sum=0;
        for(int i=0;i<=n;i++){
            String squarestr=String.valueOf(i*i);
            if(isvalidpartion(squarestr,i,0,0)){
                sum+=i*i;
            }
        }
        return sum;
    }
    private boolean isvalidpartion(String squarestr,int target,int index,int current){
        if(current>target){
            return false;
        }
        if(index==squarestr.length()){
            return current==target;
        }
        for(int i=index;i<squarestr.length();i++){
            int num=Integer.parseInt(squarestr.substring(index,i+1));
            if (isvalidpartion(squarestr,target,i+1,current+num)){
                return true;
            }
        }
        return false;
    }
}