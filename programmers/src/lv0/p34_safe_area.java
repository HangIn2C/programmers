package lv0;

import java.util.Arrays;

//지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
//지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.

class Solution34 {
    public int solution(int[][] board) {
        int answer = 0;
        
        for(int i = 0 ; i < board.length ; i ++) {
            for(int j = 0 ; j < board.length ; j ++) {
                if(board[i][j] == 1) {
                    // 맨 윗줄이 아닌 경우
                    if(i != 0 && board[i-1][j] != 1) {
                        board[i-1][j] = 2;
                    }
                    // 맨 아랫줄이 아닌 경우
                    if(i != board.length-1 && board[i+1][j] != 1) {
                        board[i+1][j] = 2;
                    }
                    // 맨 왼쪽이 아닌 경우
                    if(j != 0 && board[i][j-1] != 1) {
                        board[i][j-1] = 2;
                    }
                    // 맨 오른쪽이 아닌 경우
                    if(j != board[i].length-1 && board[i][j+1] != 1) {
                        board[i][j+1] = 2;
                    }
                    // 맨 대각선 윗 왼쪽이 아닌 경우
                    if(i != 0 && j != 0 && board[i-1][j-1] != 1) {
                        board[i-1][j-1] = 2;
                    }
                    // 맨 대각선 윗 오른쪽이 아닌 경우
                    if(i != 0 && j != board[i].length-1 && board[i-1][j+1] != 1) {
                        board[i-1][j+1] = 2;
                    }
                    // 맨 대각선 아랫 왼쪽이 아닌 경우
                    if(i != board.length-1 && j != 0 && board[i+1][j-1] != 1) {
                        board[i+1][j-1] = 2;
                    }
                    // 맨 대각선 아랫 오른쪽이 아닌 경우
                    if(i != board.length-1 && j != board[i].length-1 && board[i+1][j+1] != 1) {
                        board[i+1][j+1] = 2;
                    }
                }
            }
        }
        
        for(int i = 0; i < board.length; i++) {
        	for(int j = 0; j < board.length; j++) {
        		if(board[i][j] == 0) {
        			answer++;
        		}
        	}
        }
        
        
        System.out.println(Arrays.deepToString(board));
        System.out.println(answer);
        
        return answer;
	} // solution
} // class

public class p34_safe_area {

	public static void main(String[] args) {
		Solution34 solution = new Solution34();
		solution.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}});
		solution.solution(new int[][]{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}});
	} // main

} // class