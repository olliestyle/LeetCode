package ru.baib;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 we will use sliding window technique to check the largest substring without repeating character. but here we will make our window size dynamic.
 1.take set to store the elemetn present in the window. at any point set.size will tell us how many elements are there in a window and by keeping max variable we will keep finding the largest window.
 2.now question is how to manage window in such a way whenever duplicate item found remove the elements.
 3.for that we will use two variables i and j. i will point to start of window and j will till end of window. initially i and j both are 0.
 4.so loop till j reaches s.length. now check if char at j is present in set. if not just add that char to set and increment j. and update max to (max,set.size())
 5.if not it means the set contains our current character present at j index of string s already. now our aim is to remove that character. so we will start removing character one by one from beginning i.e. from i index till our duplicate character is removed. now just check again step 4.

 to understand above algo just take example ->
 s=abcbde
 so our loop will keep on adding element to set till we reach b character again. at that point set has [a,b,c] (order does not matter as it is set). and i=0 and j=3.
 now delete 'a' and increment i. updated set = [b,c]
 now delete 'b' and increment i. updated set = [c]
 now condition set.contains(s.charAt(j)) becomes false. and b will be added to set again.
 updated set= [c,b] and i=2 and j=3.
 main idea is stop incrementing j till the character is eligible to be added into set again by removing elements from starting.
 Once loop finishes answer is max.
 */



public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongest(String s) {
        Set<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;
        int max = 0;
        while (end < s.length()) {
            if (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start++));
            } else {
                set.add(s.charAt(end++));
                max = Math.max(max, set.size());
            }
        }
        return max;
    }
}
