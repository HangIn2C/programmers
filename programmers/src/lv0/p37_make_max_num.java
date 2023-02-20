package lv0;

import java.util.*;

//정수 배열 numbers가 매개변수로 주어집니다.
//numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

class Solution37 {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = -100000000;
        
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = 0; j < numbers.length; j++) {
        		if (j == i) continue;
        		if (numbers[i] * numbers[j] > max) {
        			max = numbers[i] * numbers[j];
				} // if
        	} // for j
        } // for i
        
        System.out.println(max);
        
        return answer = max;
	} // solution
} // class

public class p37_make_max_num {

	public static void main(String[] args) {
		Solution37 solution = new Solution37();
		solution.solution(new int[]{1, 2, -3, 4, -5});
		solution.solution(new int[]{0, -31, 24, 10, 1, 9});
		solution.solution(new int[]{1, -31});
		
	} // main

} // class