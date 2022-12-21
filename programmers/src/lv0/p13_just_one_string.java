package lv0;

import java.util.Arrays;

//문자열 s가 매개변수로 주어집니다.
//s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
//한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.

class Solution13 {
	public String solution(String s) {
		String answer = "";
		String[] sarr = new String[s.length()];
		StringBuilder sb = new StringBuilder();
		sarr = s.split("");

		// 정렬 후 시작
		Arrays.sort(sarr);

		for (int i = 0; i < sarr.length; i++) {
			int num = 0; // 새로 시작 초기화
			for (int j = 0; j < sarr.length; j++) {
				if (sarr[i].equals(sarr[j])) {
					num++;
				} // if 문자 비교
			} // for_j
			if (num == 1)
				sb.append(sarr[i]);
		} // for_i

		System.out.println("answer = " + sb.toString());
		return answer = sb.toString();
	} // solution
} // class

public class p13_just_one_string {

	public static void main(String[] args) {
		Solution13 solution = new Solution13();
		solution.solution("abcabcadc");
		solution.solution("abdc");
		solution.solution("hello");
	} // main

} // class
