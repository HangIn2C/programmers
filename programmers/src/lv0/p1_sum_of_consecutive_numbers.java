package lv0;

import java.util.Arrays;

// 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다.
// 두 정수 num과 total이 주어집니다.
// 연속된 수 num개를 더한 값이 total이 될 때,
// 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.

class Solution1 { // 연속된 수의 합
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        answer[0] = total;
        
        for(int i = 1; i < num; i++) {
        	answer[0] += i; 
        }
        
        System.out.println(answer[0] / num); // 최초 n 값
        
        for(int i = num - 1 ; i >= 0; i--) {
        	answer[i] = (answer[0] / num) - i; // 최초 n값에서 num 번, 역산
        	System.out.println(answer[i]);
        }
        Arrays.sort(answer); // 오름차순 정렬
        
        return answer;
    } // solution
} // class

public class p1_sum_of_consecutive_numbers {

	public static void main(String[] args) {
		Solution1 solution = new Solution1();
		solution.solution(3, 12);
		// 12 = n  + (n - 1) + (n - 2)
		// 12 = answer[0] + answer[1] + answer[2]
		// 12 = answer[0] + (answer[0] +1) + (answer[0] + 2)
		// 12 + 3 = 3n
		// 5 = n
		solution.solution(5, 15);
		// 15 = n + (n - 1) + (n - 2) + (n - 3) + (n - 4)
		// 15 = 5n - 10
		// 15 + 10 = 5n
		// 5 = n
		solution.solution(4, 14);
		// 14 = n + (n - 1) + (n - 2) + (n - 3)
		// 14 = 4n -6
		// 14 + 6  = 4n
		// 5 = n
		solution.solution(5, 5);
		// 5 = n + (n - 1) + (n - 2) + (n - 3) + (n - 4)
		// 5 = 5n - 10
		// 5 + 10 = 5n
		// 3 = n
	} // main

} // class
