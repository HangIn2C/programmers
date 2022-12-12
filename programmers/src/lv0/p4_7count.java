package lv0;

//머쓱이는 행운의 숫자 7을 가장 좋아합니다.
//정수 배열 array가 매개변수로 주어질 때,
//7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.

class Solution4 {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) {
        	String temp = String.valueOf(array[i]); // String 변환
        	System.out.println(temp);
        	
        	for(int j = 0; j < temp.length(); j++ ) {
        		String temp2 = temp.substring(j, j+1); // 1개씩 추출
        		System.out.println(temp2);
        		if(temp2.equals("7")) answer++; // 7 매칭 후 answer + 1
        	} // for j
        } // for i
        
        System.out.println("answer = " + answer);
        return answer;
	} // solution
} // class

public class p4_7count {

	public static void main(String[] args) {
		Solution4 arr = new Solution4();
		arr.solution(new int[] {7, 77, 17});
		arr.solution(new int[] {10, 29});
		
		
		
	} // main

} // class
