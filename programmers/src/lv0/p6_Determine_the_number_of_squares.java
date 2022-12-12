package lv0;

//어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
//정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.

class Solution6 { // 제곱수 판별하기
    public int solution(int n) {
        int answer = 2;
        	for(int i = 1; i <= 1000000; i++) {
        		if (i * i == n) return answer = 1;
        	}
        System.out.println(answer);
        return answer;
    } // solution
} // class

public class p6_Determine_the_number_of_squares {

	public static void main(String[] args) {
		Solution6 solution = new Solution6();
		solution.solution(144);
		solution.solution(976);
	} // main

} // class

// 다른 풀이
//class Solution {
//    public int solution(int n) {
//        if (n % Math.sqrt(n) == 0) {
//            return 1;
//        } else {
//            return 2;
//        }
//    }
//}