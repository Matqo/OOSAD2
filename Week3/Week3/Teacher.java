package Week3;

public class Teacher extends Professional {

	protected String degree;
	private Boolean isInCollege;

	public Boolean hasDegree() {
		if(degree!=""){
		return true;
		}else{
		return false;
		}
	}

	Boolean isPresent() {
		return isInCollege;
	}

}