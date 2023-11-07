package level1.level1_solution;

public class Programmers_성격유형검사하기 {
	public static void main(String[] args) {
		String[] survey = {"TR", "RT", "TR"};
		int[] choices = {7, 1, 3};
		System.out.println(solution(survey, choices));
	}

	public static String solution(String[] survey, int[] choices) {
		String answer = "";
		int survey_A = 0; int survey_N = 0; int survey_C = 0; int survey_F = 0; 
		int survey_M = 0; int survey_J = 0; int survey_R = 0; int survey_T = 0;

		for (int i = 0; i < survey.length; i++) {
			switch (survey[i]) {
			case "RT":
				if(choices[i] < 4) {
					survey_R += 4 - choices[i];
				} else if(choices[i] > 4) {
					survey_T += choices[i] - 4;
				}
				break;

			case "TR":
				if(choices[i] < 4) {
					survey_T += 4 - choices[i];
				} else if(choices[i] > 4) {
					survey_R += choices[i] - 4;
				}
				break;

			case "CF":
				if(choices[i] < 4) {
					survey_C += 4 - choices[i];
				} else if(choices[i] > 4) {
					survey_F += choices[i] - 4;
				}
				break;

			case "FC":
				if(choices[i] < 4) {
					survey_F += 4 - choices[i];
				} else if(choices[i] > 4) {
					survey_C += choices[i] - 4;
				}
				break;
				
			case "MJ":
				if(choices[i] < 4) {
					survey_M += 4 - choices[i];
				} else if(choices[i] > 4) {
					survey_J += choices[i] - 4;
				}
				break;

			case "JM":
				if(choices[i] < 4) {
					survey_J += 4 - choices[i];
				} else if(choices[i] > 4) {
					survey_M += choices[i] - 4;
				}
				break;
				
			case "AN":
				if(choices[i] < 4) {
					survey_A += 4 - choices[i];
				} else if(choices[i] > 4) {
					survey_N += choices[i] - 4;
				}
				break;

			case "NA":
				if(choices[i] < 4) {
					survey_N += 4 - choices[i];
				} else if(choices[i] > 4) {
					survey_A += choices[i] - 4;
				}
				break;
			}
		} // for end
		
		if(survey_R > survey_T) {
			answer += "R";
		} else if(survey_R < survey_T) {
			answer += "T";
		} else {
			answer += "R";
		}
		 
		if(survey_C > survey_F) {
			answer += "C";
		} else if(survey_C < survey_F) {
			answer += "F";
		} else {
			answer += "C";
		}
		
		if(survey_J > survey_M) {
			answer += "J";
		} else if(survey_J < survey_M) {
			answer += "M";
		} else {
			answer += "J";
		}
		
		if(survey_A > survey_N) {
			answer += "A";
		} else if(survey_N < survey_A) {
			answer += "N";
		} else {
			answer += "A";
		}
		
		return answer;
	}

}
