package section13;

interface buttonCLickListener {
	public void click();
}
public class AnonymousExample {
	public class Button {
		private buttonCLickListener listener;
		public void setButtonListener(buttonCLickListener listener) {
			this.listener = listener;
		}
		
		public void click() {
			if (listener != null) {
				this.listener.click();
			} 
		}
		
	}
	public static void main(String[] args) {
		AnonymousExample exam = new AnonymousExample();
		AnonymousExample.Button button = exam.new Button();
		
		button.setButtonListener(new buttonClickListener () {
			@Override
			public void click() {
				System.out.println("버튼을 누름");
			}
		});
		
		button.click();
	}
}


