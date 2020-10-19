import java.util.Arrays;
import java.util.HashSet;

//https://leetcode-cn.com/problems/reverse-vowels-of-a-string/description/
class Solution1 {
    private final static HashSet<Character> vowels=new HashSet< >(
            Arrays.asList('a','e','i','o','u','A','E','I','O','U')
    );
    public String reverseVowels(String s) {
        if(s==null){
            return null;
        }
        char[] results= new char[s.length()];
        int i=0,j=s.length()-1;
        while(i<=j){
            char ci=s.charAt(i);
            char cj=s.charAt(j);
            if(!vowels.contains(ci)){
                results[i++]=ci;
            } else if (!vowels.contains(cj)) {
                results[j--]=cj;
            }else{
                results[j--]=ci;
                results[i++]=cj;
            }
        }
        return new String(results);

    }
}