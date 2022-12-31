package lv0;

//이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때,
//두 이진수의 합을 return하도록 solution 함수를 완성해주세요.

class Solution23 {
    public String solution(String bin1, String bin2) {
        String answer = "";
        answer = String.valueOf(Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2) ) ) ;
        System.out.println(answer);
        return answer;
	} // solution
} // class

public class p23_binary_sum {

	public static void main(String[] args) {
		Solution23 solution = new Solution23();
		solution.solution("10", "11");
		solution.solution("1001", "1111");
		
	} // main

} // class