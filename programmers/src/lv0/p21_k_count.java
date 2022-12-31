package lv0;

//1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
//정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.

class Solution21 {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int index = i; index <= j; index++) {
        	String stri = String.valueOf(i);
        	String strj = String.valueOf(j);
        	String strk = String.valueOf(k);
//        	System.out.printf("Start = %d, End = %d \n", i, j);
        	String[] sarr = String.valueOf(index).split("");
        	for(int index2 = 0; index2 < sarr.length; index2++) {
        		if(strk.equals(sarr[index2])) {
//        			System.out.println(sarr[index2]);
//        			System.out.printf("index = %d, strk = %s, sarr = %s \n",index, strk, sarr[index2]);
        			answer++;
        		}
        	}
        }
//        System.out.println(answer);
        return answer;
	} // solution
} // class

public class p21_k_count {

	public static void main(String[] args) {
		Solution21 solution = new Solution21();
		solution.solution(1, 13, 1);
		solution.solution(10, 50, 5);
		solution.solution(3, 10, 2);
	} // main

} // class