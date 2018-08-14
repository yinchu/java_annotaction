package annotaction_tools.validator;

public class MyValidatorDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, Exception {
		// TODO Auto-generated method stub
		IdCard card1 = new IdCard();
		card1.setIdNo("12345678900000");
		card1.setMarried(true);
		ValidatorChecker.check(card1);
		System.out.println("========= Split Line ==========");
		
		IdCard card2 = new IdCard();
		card2.setIdNo("12345678900000123456789");
		card2.setMarried(true);
		ValidatorChecker.check(card2);
		System.out.println("========= Split Line ==========");
		
		IdCard card3 = new IdCard();
		card3.setIdNo("12345678912345678");
		card3.setMarried(true);
		ValidatorChecker.check(card3);
		System.out.println("========= Split Line ==========");
	}

}
