package lv0;

//문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
//my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를
//바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.

class Solution14 {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        
        sb.insert(num1, my_string.charAt(num2));
        sb.insert(num2+1, my_string.charAt(num1));
        sb.deleteCharAt(num1 + 1).deleteCharAt(num2 + 1);
        System.out.println(sb.toString());
        return answer = sb.toString();
	} // solution
} // class

public class p14_index_change {

	public static void main(String[] args) {
		Solution14 solution = new Solution14();
		solution.solution("hello", 1, 2);
		solution.solution("I love you", 3, 6);
	} // main

} // class
