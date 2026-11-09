class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> arr = new ArrayList<>();
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        int n = digits.length();
        if (n == 0) {
            return arr;
        }
        if (n == 1) {
            
            String str = map.get(digits.charAt(0));
            for (int i = 0; i < str.length(); i++) {
                arr.add("" + str.charAt(i));
            }
            return arr;
        }
        if (n == 2) {
            char ch1 = digits.charAt(0);
            char ch2 = digits.charAt(1);
            String str1 = map.get(ch1);
            String str2 = map.get(ch2);

            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {

                    char c1 = str1.charAt(i);
                    char c2 = str2.charAt(j);
                    String comb = "" + c1 + c2;
                    arr.add(comb);
                }
            }
            return arr;
        }
        if (n == 3) {
            char ch1 = digits.charAt(0);
            char ch2 = digits.charAt(1);
            char ch3 = digits.charAt(2);

            String str1 = map.get(ch1);
            String str2 = map.get(ch2);
            String str3 = map.get(ch3);

            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    for (int k = 0; k < str3.length(); k++) {

                        char c1 = str1.charAt(i);
                        char c2 = str2.charAt(j);
                        char c3 = str3.charAt(k);

                        String comb = "" + c1 + c2 + c3;
                        arr.add(comb);
                    }
                }
            }
            return arr;
        }
        if (n == 4) {
            char ch1 = digits.charAt(0);
            char ch2 = digits.charAt(1);
            char ch3 = digits.charAt(2);
            char ch4 = digits.charAt(3);

            String str1 = map.get(ch1);
            String str2 = map.get(ch2);
            String str3 = map.get(ch3);
            String str4 = map.get(ch4);

            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    for (int k = 0; k < str3.length(); k++) {
                        for (int l = 0; l < str4.length(); l++) {

                            char c1 = str1.charAt(i);
                            char c2 = str2.charAt(j);
                            char c3 = str3.charAt(k);
                            char c4 = str4.charAt(l);

                            String comb = "" + c1 + c2 + c3 + c4;
                            arr.add(comb);
                        }
                    }
                }
            }
            return arr;
        }
        return arr;
    }
}