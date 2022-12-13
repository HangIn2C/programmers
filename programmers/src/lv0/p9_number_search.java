package lv0;

//정수 num과 k가 매개변수로 주어질 때,
//num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고
//없으면 -1을 return 하도록 solution 함수를 완성해보세요.

class Solution9 {
    public int solution(int num, int k) {
        int answer = -1;
        
        String ss = String.valueOf(num);
        
        if (ss.indexOf(String.valueOf(k) ) > 0) { // indexOf 0에서부터 검색
			answer = ss.indexOf(String.valueOf(k)) + 1;
		} // if
        System.out.println(answer);
        return answer;
	} // solution
} // class

public class p9_number_search {

	public static void main(String[] args) {
		Solution9 solution = new Solution9();
		solution.solution(29183, 1);
		solution.solution(232443, 4);
		solution.solution(123456, 7);
		solution.solution(3248, 8);
		solution.solution(951147, 2);
		
	} // main

} // class
