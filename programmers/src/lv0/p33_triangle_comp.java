package lv0;

//선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
//
//가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
//삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
//나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.

class Solution33 {
    public int solution(int[] sides) {
        int answer = 0;

        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        // 주어진 변에서 가장 큰 값이 있는 경우
        for(int i = max - min + 1; i <= max; i++) {
        	answer++;
        }
        
        // 나머지 변이 가장 큰 경우
        for(int i = max + 1; i < max + min; i++) {
        	answer++;
        }
        return answer;
	} // solution
} // class

public class p33_triangle_comp {

	public static void main(String[] args) {
		Solution33 solution = new Solution33();
		solution.solution(new int[]{1,2});
	} // main

} // class