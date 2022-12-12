package lv0;

//덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
//수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.

class Solution7 { // OX퀴즈
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
        	
        String X = quiz[i].substring(0, quiz[i].indexOf(" ")+1); // X
        String find_oper = quiz[i].replaceFirst(X, "");
        System.out.println("X = " + X);
        System.out.println(find_oper);
        
        String oper = find_oper.substring(0, find_oper.indexOf(" ")+1); // + / -
        String find_Y = find_oper.replace(oper, "");
        System.out.println("oper = " + oper);
        System.out.println(find_Y);
        
        String Y = find_Y.substring(0, find_Y.indexOf(" ")+1); // Y
        String find_equal = find_Y.replaceFirst(Y, "");
        System.out.println("Y = " + Y);
        System.out.println(find_equal);

        String equal = find_equal.substring(0, find_equal.indexOf(" ")+1); // =
        String find_Z = find_equal.replace(equal, "");
        System.out.println("equal = " + equal);
        System.out.println(find_Z);
        
        String Z = find_Z.substring(0, find_Z.length()); // Z
        System.out.println("Z = " + Z);
        
        int F_X = Integer.parseInt(X.trim()); // trim() 공백 제거
    	int F_Y = Integer.parseInt(Y.trim());
    	int F_Z = Integer.parseInt(Z.trim());
    	
	        if(oper.trim().equals("+") ) {
	        	if(F_X + F_Y == F_Z) answer[i] = "O";
	        	else answer[i] = "X";
	        } else {
	        	if(F_X - F_Y == F_Z) answer[i] = "O";
	        	else answer[i] = "X";
	        } // if
	        System.out.println("answer"+ i + "=" + answer[i]);
        } // for i
        return answer;
    } // solution
} // class

public class p7_OX_Quiz {

	public static void main(String[] args) {
		Solution7 solution = new Solution7();
		solution.solution(new String[]  {"3 - 4 = -3", "5 + 6 = 11"});
		solution.solution(new String[] {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"});
	} // main

} // class
