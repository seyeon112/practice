package section13;

class PrintOut {
//	정적 클래스
	public static class Out {
		public void println(String str) {
			System.out.println(str);
		}
	}
}
public class StaticClassExam {
	public static void main(String[] args) {
		String str = "정적 내부 클래스";
		PrintOut.Out out = new PrintOut.Out();
		out.println(str);
	}

}
