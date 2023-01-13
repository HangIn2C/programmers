package lv0;

import java.util.Arrays;

//정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
//이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
//정수가 담긴 배열 numlist와 정수 n이 주어질 때
//numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.

class Solution27 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        for(int i = 0; i < lottos.length; i++) {
        	if (lottos[i] == 0) lottos[i] = 50;
        }
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        int match = 0;
        int zero = 0;
        for(int i = 0; i < lottos.length; i++) {
        	if (lottos[i] == win_nums[i]) {
        		match++;
        	}
        	else if (lottos[i] == 50) {
        		zero++;
        	}
        }
        
        
        System.out.println(Arrays.toString(answer));
        
        System.out.println(Arrays.toString(lottos));;
        System.out.println(Arrays.toString(win_nums));;        
        return answer;
	} // solution
} // class

public class p27_sort {

	public static void main(String[] args) {
		Solution27 solution = new Solution27();
		solution.solution(new int[] {44,1,0,0,31,25}, new int[] {31,10,45,1,6,19});
		solution.solution(new int[] {0,0,0,0,0,0}, new int[] {38,19,20,40,15,25});
		solution.solution(new int[] {45,4,35,20,3,9}, new int[] {20,9,3,45,4,35});
	} // main

} // class