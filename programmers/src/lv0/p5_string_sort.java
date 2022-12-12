package lv0;

import java.util.Arrays;

//머쓱이는 행운의 숫자 7을 가장 좋아합니다.
//정수 배열 array가 매개변수로 주어질 때,
//7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.

class Solution5 {
    public String solution(String my_string) {
        String answer = "";
        String temp = my_string.toLowerCase(); // 소문자 변환
        char[] c = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i++) {
        	c[i] = temp.charAt(i); // 1개씩 분리
        } // for i
        
        Arrays.sort(c); // 오름차순 정렬
    	
        System.out.println(c);
        
        return answer = String.valueOf(c);
	} // solution
} // class

public class p5_string_sort {

	public static void main(String[] args) {
		Solution5 solution = new Solution5();
		solution.solution("Bcad");
		solution.solution("heLLo");
		solution.solution("Python");
	} // main

} // class


// 다른 풀이 법
//import java.util.*;
//
//class Solution {
//    public String solution(String my_string) {
//        String answer = "";
//        String[] word = my_string.toLowerCase().split("");
//
//        Arrays.sort(word);
//        for(int i = 0 ; i <word.length ; i++){
//            answer += word[i];
//        }
//
//        return answer;
//    }
//}
