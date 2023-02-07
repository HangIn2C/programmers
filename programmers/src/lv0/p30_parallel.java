package lv0;

//점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
//
//[[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
//주어진 네 개의 점을 두 개씩 이었을 때,
//두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.

class Solution30 {
    public int solution(int[][] dots) {
        int answer = 0;
        double[][] ddots = new double[4][2];
        
        for(int i = 0; i < 4; i++) {
        	for(int j = 0; j < 2; j++) {
        		ddots[i][j] = (double)dots[i][j];
        	}
        }
        
    	// [x1,y1] [x2,y2] [x3,y3] [x4,y4]
        // 나누기 형변환 double
        // 기울기 = x / y, 기울기 같으면 평행
        
        // 1번
        // x1 - x2 / y1 - y2 == x3 - x4 / y3 - y4
        if (((ddots[0][0] - ddots[1][0]) / (ddots[0][1] - ddots[1][1]))
        		== ((ddots[2][0] - ddots[3][0]) / (ddots[2][1] - ddots[3][1])) ) {
        	return 1;
        }
        // 2번
        // x1 - x3 / y1 - y3 == x2 - x4 / y2 - y4
        if (((ddots[0][0] - ddots[2][0]) / (ddots[0][1] - ddots[2][1]))
        		== ((ddots[1][0] - ddots[3][0]) / (ddots[1][1] - ddots[3][1])) ) {
        	return 1;
        }
        // 3번
        // x1 - x4 / y1 - y4 == x3 - x2 / y3 - y2
        if (((ddots[0][0] - ddots[3][0]) / (ddots[0][1] - ddots[3][1]))
        		== ((ddots[2][0] - ddots[1][0]) / (ddots[2][1] - ddots[1][1])) ) {
        	return 1;
        }
        
        return answer;
	} // solution
} // class

public class p30_parallel {

	public static void main(String[] args) {
		Solution30 solution = new Solution30();
		solution.solution(new int[][]{{1,4},{9,2},{3,8},{11,6}});
	} // main

} // class