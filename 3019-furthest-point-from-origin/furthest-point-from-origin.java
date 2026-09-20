class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0;
        int right = 0;
        int blank = 0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i) == 'L'){
                left++;
            }
            else if(moves.charAt(i) == 'R'){
                right++;
            }
            else
                blank++;
        }
        int pos1 = right - (left + blank);
        int pos2 = (right+blank) - left;
        return Math.max(Math.abs(pos1),Math.abs(pos2));
    }
}