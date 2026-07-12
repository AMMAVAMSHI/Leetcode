class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0){
            return new int[0];
        }
        if(arr.length == 1){
            return new int[]{1};
        }
        int copy[] = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr);
        int rank[] = new int[arr.length];
        int rnk = 1;
        rank[0] = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] == arr[i]){
                rank[i] = rnk;
            }
            else{
                rnk++;
                rank[i] = rnk; 
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(rank[i]+" ");
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],rank[i]);
        }
        for(int i=0;i<arr.length;i++){
            rank[i] = map.get(copy[i]);
        }
        return rank;
    }
}