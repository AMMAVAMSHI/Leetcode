class Solution {
    public String[] findWords(String[] words) {
    
        String row1 = "QWERTYUIOPqwertyuiop";
        String row2 = "ASDFGHJKLasdfghjkl";
        String row3 = "ZXCVBNMzxcvbnm";
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s = words[i];
            if(s.isEmpty()) continue;
            char first = s.charAt(0);
            String targetRow;
            if(row1.indexOf(first) != -1){
                targetRow = row1;
            }
            else if(row2.indexOf(first) != -1){
                targetRow = row2;
            }
            else{
                targetRow = row3;
            }

            boolean valid = true;
            for(int j=0;j<s.length();j++){
                char ch = s.charAt(j);
                
                if(targetRow.indexOf(ch) == -1){
                    valid = false;
                    break;
                }

            }
            if(valid){
                arr.add(s);
            }
        }
        String res[] = new String[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i] = arr.get(i);
        }
        return res;
    }
}