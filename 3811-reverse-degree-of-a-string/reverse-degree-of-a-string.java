class Solution {
    public int reverseDegree(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int num = 27;
        for(char i = 'a';i<='z';i++){
            num = num-1;
            map.put(i,num);
        }
        //System.out.println(map);
        int degree = 0;

        for(int i=0;i<s.length();i++){
            degree += map.get(s.charAt(i))*(i+1);
        }
        return degree;
    }
}