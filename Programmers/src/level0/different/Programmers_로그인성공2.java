package level0.different;

public class Programmers_로그인성공2 {
	public static void main(String[] args) {
//		String[] id_pw = {"programmer01", "15789"};
//		String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
		
		String[] id_pw = {"meosseugi", "1234"};
		String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
		System.out.println(solution(id_pw,db));
	}
	
    public static String solution(String[] id_pw, String[][] db) {
        String answer = "";

        for(int i = 0; i < db.length; i++){
            if(db[i][0].equals(id_pw[0])){
                if(db[i][1].equals(id_pw[1])){
                    return "login";
                }
                return "wrong pw";
            }
        }
        return "fail";
    }
}
