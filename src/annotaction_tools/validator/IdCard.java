package annotaction_tools.validator;

public class IdCard {

	@MyValidator(min = 16, max = 20)
	private String idNo;

	private boolean isMarried;
	
	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	
}
