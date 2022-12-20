package lv0;

import java.util.ArrayList;

// 정수 n이 매개변수로 주어질 때,
// n의 약수를 오름차순으로 담은 배열을 return하도록
// solution 함수를 완성해주세요.

class Solution12 {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 1; i <= n; i++) {
        	if(n % i == 0) { // 
        		list.add(i);
        	}
        }
        System.out.println(list);
        return list;
	} // solution
} // class
 
public class p12_measure_search {

	public static void main(String[] args) {
		Solution12 solution = new Solution12();
		solution.solution(24);
		solution.solution(29);
	} // main

} // class
