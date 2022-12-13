package lv0;

//정수 num과 k가 매개변수로 주어질 때,
//num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고
//없으면 -1을 return 하도록 solution 함수를 완성해보세요.

class Solution10 {
	public int solution(String my_string) {
		int answer = 0;
		String[] arr;

		arr = my_string.split(" ");
		answer = Integer.parseInt(arr[0]);
		for (int i = 2; i < arr.length; i += 2) {
			if ("+".equals(arr[i-1].trim())) {
				answer += Integer.parseInt(arr[i]);
			} else {
				answer -= Integer.parseInt(arr[i]);
			}
		}
		System.out.println(answer);
		return answer;
	} // solution
} // class

public class p10_string_cal {

	public static void main(String[] args) {
		Solution10 solution = new Solution10();
		solution.solution("3 + 4");
		solution.solution("21 + 35");
		solution.solution("1000 + 5458");
		solution.solution("1000 - 5458");
		solution.solution("1000 - 5458 + 100");
		solution.solution("1000 - 5458 - 12");
		solution.solution("1000 - 5458 + 500");

	} // main

} // class
