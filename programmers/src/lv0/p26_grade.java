package lv0;

import java.util.Arrays;

//영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
//영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때,
//영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.

class Solution26 {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] sumArr = new int[score.length]; 
        int[] tempArr = new int[score.length];
        for(int i = 0; i < score.length; i++) {
        	sumArr[i] = tempArr[i] = score[i][0] + score[i][1];
        }
        
        Arrays.sort(sumArr);
        
        for(int i = 0; i < score.length; i++ ) {
        	for (int j = 0; j < score.length; j++) {
        		if(tempArr[i] == sumArr[j]) {
        			answer[i] = sumArr.length - j;
        		}
        	}
        }
        
        System.out.println("temp j = " + Arrays.toString(tempArr));
        System.out.println("temp i = " + Arrays.toString(sumArr));
        System.out.println(Arrays.toString(answer));
        
        return answer;
	} // solution
} // class

public class p26_grade {

	public static void main(String[] args) {
		Solution26 solution = new Solution26();
		int[][] score = {{80, 70}, {90,50}, {40, 70}, {50, 80}};
		solution.solution(score);
	} // main

} // class