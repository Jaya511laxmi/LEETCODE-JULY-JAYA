class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        int result = 1;  // at least the original string itself
        int i = 0;

        while (i < n) {
            int j = i;
            while (j < n && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            int groupLen = j - i;
            if (groupLen > 1) {
                result += (groupLen - 1); 
            }
            i = j;
        }

        return result;
    }
}
