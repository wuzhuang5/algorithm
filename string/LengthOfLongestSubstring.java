import java.util.HashSet;
import java.util.Set;

/**
 * leetcode 3
 * 示例：
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3
 * 无重复字符的最长子串
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() < 1) {
            return -1;
        }
        char[] arr = s.toCharArray();
        int result = 0;
        Set<Character> set = new HashSet<>();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                result = Math.max(result, set.size());
                set.clear();
            }
            set.add(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abcabcdbb";
        int longLength = new LengthOfLongestSubstring().lengthOfLongestSubstring(s);
        System.out.println(longLength);
    }
}