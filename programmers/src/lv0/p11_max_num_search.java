package lv0;

import java.util.Arrays;

//정수 num과 k가 매개변수로 주어질 때,
//num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고
//없으면 -1을 return 하도록 solution 함수를 완성해보세요.

class Solution11 {
    public int[] solution(int[] array) {
        int[] answer = new int[2]; // answer[0] : 가장 큰 숫자 / answer[1] : 숫자 위치
        
        int max = 0;
        for(int i = 0; i < array.length; i++) {
        	if (array[i] > max) { // 가장 큰 숫자로 변환
        		max = array[i];
        		answer[1] = i;
        	}
        	answer[0] = max;
        } // for
        System.out.println(Arrays.toString(answer) );
        return answer;
	} // solution
} // class

public class p11_max_num_search {

	public static void main(String[] args) {
		Solution11 solution = new Solution11();
		solution.solution(new int[] {1, 8, 3});
		solution.solution(new int[] {9, 10, 11, 8});

	} // main

} // class
