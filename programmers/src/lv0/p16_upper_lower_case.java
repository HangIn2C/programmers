package lv0;

import java.util.Arrays;

//문자열 my_string이 매개변수로 주어질 때,
//대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.

class Solution16 {
    public String solution(String my_string) {
        String answer = "";
        char[] sarr = new char[my_string.length()];
        sarr = my_string.toCharArray();
        System.out.println(Arrays.toString(sarr));
        
        for(int i = 0; i < sarr.length; i++) {
        	if('a' <= sarr[i] && sarr[i] <= 'z') {
        		sarr[i] = Character.toString(sarr[i]).toUpperCase().charAt(0);
        		continue;
        	} else if('A' <= sarr[i] && sarr[i] <= 'Z') {
        		sarr[i] = Character.toString(sarr[i]).toLowerCase().charAt(0);
        	}
        }
        
        System.out.println(Arrays.toString(sarr));
        
        return answer = String.valueOf(sarr);
	} // solution
} // class

public class p16_upper_lower_case {

	public static void main(String[] args) {
		Solution16 solution = new Solution16();
		solution.solution("cccCCC");
		solution.solution("abCdEfghIJ");
	} // main

} // class
