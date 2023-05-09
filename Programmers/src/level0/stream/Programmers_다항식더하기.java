package level0.stream;

public class Programmers_다항식더하기 {

	public static void main(String[] args) {
		String polynomial = "10x + x + 20x + 10 + 3x";
		System.out.println(solution(polynomial));
	}

	public static String solution(String polynomial) {
		int xCount = 0;
		int num = 0;

		for (String s : polynomial.split(" ")) {
			if (s.contains("x")) {
				xCount += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
			} else if (!s.equals("+")) {
				num += Integer.parseInt(s);
			}
		}
		return (xCount != 0 ? xCount > 1 ? xCount + "x" : "x" : "")
				+ (num != 0 ? (xCount != 0 ? " + " : "") + num : xCount == 0 ? "0" : "");
	}

}
