package problems.leetcode.problemNo344;

/*
EASY
Write a function that reverses a string. The input string is given as an array of characters char[].

        Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

        You may assume all the characters consist of printable ascii characters.



        Example 1:

        Input: ["h","e","l","l","o"]
        Output: ["o","l","l","e","h"]
        Example 2:

        Input: ["H","a","n","n","a","h"]
        Output: ["h","a","n","n","a","H"]

 */
public class Solution {
    public void reverseString(char[] s) {
        int size = s.length;
        int p1 = 0;
        int p2 = size-1;
        char temp;
        if(size%2==0){
            while(p1<p2){
                temp = s[p1];
                s[p1] = s[p2];
                s[p2] = temp;
                p1++;
                p2--;
            }
        }
        else {
            for(int i=0; i<=size/2; i++){
                temp = s[p1];
                s[p1] = s[p2];
                s[p2] = temp;
                p1++;
                p2--;
            }
        }
    }
}
