package lv0;

import java.util.Arrays;

//문자열 before와 after가 매개변수로 주어질 때,
//before의 순서를 바꾸어 after를 만들 수 있으면 1을,
//만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

class Solution22 {
    public int solution(String before, String after) {
        int answer = 0;
        char[] barray = before.toCharArray();
        char[] aarray = after.toCharArray();
        
        Arrays.sort(barray);
        Arrays.sort(aarray);
        System.out.println(barray);
        System.out.println(aarray);
        for(int i = 0; i < barray.length; i++) {
        	if(barray[i] == aarray[i]) {
        		answer = 1;
        	} else {
        		answer = 0;
        		break;
			}
        }
        System.out.println(answer);
        return answer;
	} // solution
} // class

public class p22_make_b_from_a {

	public static void main(String[] args) {
		Solution22 solution = new Solution22();
		solution.solution("olleh", "hello");
		solution.solution("allpe", "apple");
		
	} // main

} // class