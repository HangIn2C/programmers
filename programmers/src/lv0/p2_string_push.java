package lv0;

//문제 설명
//문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
//이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때,
//A를 밀어서 B가 될 수 있다면 몇 번 밀어야 하는지 횟수를 return하고
//밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

class Solution2 {
    public int solution(String A, String B) {
        int answer = -1; // 밀어도 나오지 않는 경우 기본 -1
        
        for(int i = 0; i < A.length(); i++) {
	        if(A.equals(B)) return answer = 0; // 만약 밀지 않아도 맞는 경우 0 return
	      	StringBuffer sb = new StringBuffer();
	        sb.append(A.substring(A.length() - 1) );
	        sb.append(A.substring(0, A.length()-1));
	        System.out.println(sb);
	        A = sb.toString();
	        if (sb.toString().equals(B) ) return answer = i+1; // i + 1번 밀어서 맞는 경우
        }
        
        return answer;
    } // solution
} // class

public class p2_string_push {

	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		solution.solution("hello", "ohell");
		solution.solution("apple", "elppa");
		
	} // main

} // class
