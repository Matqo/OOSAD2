package Week3;

public class Rating extends Qualification {

	protected int rating;
	private Boolean isRated;

	public Boolean isRated() {
		return isRated;
	}

	public void rate(int i) {
		rating = i;
	}

}