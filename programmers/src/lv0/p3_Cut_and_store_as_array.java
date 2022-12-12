package lv0;

//문자열 my_str과 n이 매개변수로 주어질 때,
//my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.

class Solution3 {
	public String[] solution(String my_str, double n) {
		double d = my_str.length() / n;
		int n2 = (int)n;
		int len = (int)Math.ceil(d);
		String[] answer = new String[len];
		
		for (int i = 0; i < len; i++) {
			try { // n2의 개수 만큼 분할
				answer[i] = my_str.substring(i * n2, (i * n2) + n2);
			} catch (Exception e) { // 마지막 n으로 나누어 떨어지지 않는 경우
				answer[i] = my_str.substring(i * n2, my_str.length());
			}
		}
		
		return answer;
	} // solution
} // class

public class p3_Cut_and_store_as_array {

	public static void main(String[] args) {
		Solution3 solution = new Solution3();
		solution.solution("abc1Addfggg4556b", 6);
		solution.solution("abcdef123", 3);
	} // main

} // class
