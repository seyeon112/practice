package practice;

public class EX12_04 {
	public static void main(String[] args) {
//		Receipt r = new Receipt();
		
		PastaReceipt pr = new PastaReceipt("최연석");
		pr.info();
		pr.makeSource();
		System.out.println();
		
		StakeReceipt sr = new StakeReceipt("이현복");
		sr.info();
		sr.grillStake();
	}

}
