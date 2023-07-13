package level1.level1_solution;

public class Programmers_키패드누르기 {
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		System.out.println(solution(numbers, hand));
	}
	
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        boolean hand_check = false; // 왼손을 false
        if(hand.equals("right")) {
        	hand_check = true; // 오른손을 true
        }
        String [][] phone = {{"1","2","3"}, {"4","5","6"},{"7","8","9"},{"*","0","#"}};
        
        System.out.println();
        
        return answer;
    }
}
