package lv0;

import java.util.*;

//문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
//my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

class Solution35 {
    public int solution(String my_string) {
        int answer = 0;
        
        // 분할
        String[] str = my_string.trim().split("[a-zA-Z]");
        
    	for(String s : str) {
    		if (!s.isEmpty()) { // 공백 제외
    			System.out.println(s);
    			answer += Integer.parseInt(s);
			}
    	} // for-each
    	
    	System.out.println(answer);
        
        return answer;
	} // solution
} // class

public class p35_hide_number {

	public static void main(String[] args) {
		Solution35 solution = new Solution35();
		solution.solution("aAb1B2cC34oOp");
		solution.solution("1a2b3c4d123Z");
		solution.solution("asdfasdvbZKJHDKFS");
		
	} // main

} // class