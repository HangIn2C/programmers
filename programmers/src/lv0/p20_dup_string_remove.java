package lv0;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//문자열 my_string이 매개변수로 주어집니다.
//my_string에서 중복된 문자를 제거하고
//하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.

class Solution20 {
	public String solution(String my_string) {
		String answer = "";
		// 문자로 분리
		char[] carr = my_string.toCharArray();
		// 중복을 허용하지 않는 set 사용
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i = 0; i<carr.length; i++) {
			set.add(carr[i]);
		}
		
		Iterator<Character> it = set.iterator();
		while(it.hasNext() ) {
			answer += it.next();
		}
		System.out.println(answer);
		return answer;
	} // solution
} // class

public class p20_dup_string_remove {

	public static void main(String[] args) {
		Solution20 solution = new Solution20();
		solution.solution("people");
		solution.solution("We are the world");
	} // main

} // class