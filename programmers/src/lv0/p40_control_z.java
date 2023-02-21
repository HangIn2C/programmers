package lv0;

import java.util.*;

//문제 설명
//숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다.
//문자열에 있는 숫자를 차례대로 더하려고 합니다.
//이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
//숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.

class Solution40 {
    public int solution(String s) {
        int answer = 0;
        int prev = 0;
        String[] str = s.split(" ");
        System.out.println(Arrays.toString(str));
        
        for(int i = 0; i < str.length; i++) {
    		if("Z".equals(str[i])) {
    			answer -= prev;
    			continue;
    		}
    		answer += Integer.parseInt(str[i]);
    		prev = Integer.parseInt(str[i]);
        }
        
        System.out.println(answer);
        
        return answer;
	} // solution
} // class

public class p40_control_z {

	public static void main(String[] args) {
		Solution40 solution = new Solution40();
		solution.solution("1 2 Z 3");
		solution.solution("10 20 30 40");
		solution.solution("10 Z 20 Z 1");
		solution.solution("10 Z 20 Z");
		
	} // main

} // class