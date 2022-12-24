package lv0;

import java.util.*;
import java.util.stream.Collectors;

//정수 배열 array와 정수 n이 매개변수로 주어질 때,
//array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.

class Solution19 {
    public int solution(int[] array, int n) {
        int answer = 0;
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        list.add(n);
        list.sort(null);
        int index = list.indexOf(n);
        if (index == 0) {
            answer = list.get(index+1);
            return answer;
        }
        if (index == list.size() - 1) {
            answer = list.get(index-1);
            return answer;
        }
        if (Math.abs(list.get(index-1) - n) > list.get(index+1) - n) {
            answer = list.get(index+1);
        } else {
            answer = list.get(index-1);
        }
        return answer;

	} // solution
} // class

public class p19_near_num {

	public static void main(String[] args) {
		Solution19 solution = new Solution19();
		solution.solution(new int[] {3, 10, 28}, 20);
		solution.solution(new int[] {10, 11, 12}, 13);
	} // main

} // class