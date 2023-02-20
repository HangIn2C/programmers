package lv0;

import java.util.*;

//한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
//다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
//덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때,
//동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
//같은 식이라면 가장 짧은 수식을 return 합니다.

class Solution36 {
    public String solution(String polynomial) {
        String answer = "";
        
        String[] str = polynomial.split(" \\+ ");
        
        int x = 0;
        int xNot = 0;
        
        for(String s : str) {
        	if (s.contains("x") ) {
        		if ("x".equals(s)) {
					s = "1" + s;
				}
        		
        		x += Integer.parseInt(s.substring(0, s.indexOf("x")));
        		
			} else {
				xNot += Integer.parseInt(s);
			}
        }
        
        System.out.println(x);
        System.out.println(xNot);
        if (x != 0) {
        	if (x == 1) {
        		answer += "x";
			} else {
				answer += String.valueOf(x) + "x"; }
			}
        if (x != 0 && xNot != 0) { answer += " + "; }
        if (xNot != 0) { answer += String.valueOf(xNot); }
        
        System.out.println(answer);
        
        return answer;
	} // solution
} // class

public class p36_polynomial_sum {

	public static void main(String[] args) {
		Solution36 solution = new Solution36();
		solution.solution("3x + 7 + x");
		solution.solution("x + x + x");
		solution.solution("1");
		solution.solution("x");
		
	} // main

} // class