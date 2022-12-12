package lv0;

import java.util.ArrayList;

//정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
//numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.

class Solution8 {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i = 0; i < numlist.length; i++) {
        	if (numlist[i] % n == 0 ) {
        		answer.add(numlist[i]);
        	}
        }
        
        int[] answer2 = new int[answer.size()];
        
        for(int i = 0; i < answer.size(); i++) {
        	answer2[i] = answer.get(i);
        	System.out.println(answer2[i]);
        }
        
        return answer2;
	} // solution
} // class

public class p8_pick_a_multiple_of_n {

	public static void main(String[] args) {
		Solution8 arr = new Solution8();
		arr.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});
		arr.solution(5, new int[]{1, 9, 3, 10, 13, 5});
		arr.solution(12, new int[]{2, 100, 120, 600, 12, 12});
		
		
	} // main

} // class
