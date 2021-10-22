package poker;

public class Player {
	private String firstname;
	private String midName;
	private String lastName;
	private int age;
	private String gender;
	private String address1;
	private String address2;
	private String city;
	private String country;
	private int playLevel;
	private int competency;
	private boolean proPlayer;

	public Player(String firstname, String midName, String lastName, int age, String gender, String address1,
			String address2, String city, String country, int playLevel, int competency, boolean proPlayer) {
		this.firstname = firstname;
		this.midName = midName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.country = country;
		this.playLevel = playLevel;
		this.competency = competency;
		this.proPlayer = proPlayer;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPlayLevel() {
		return playLevel;
	}

	public void setPlayLevel(int playLevel) {
		this.playLevel = playLevel;
	}

	public int getCompetency() {
		return competency;
	}

	public void setCompetency(int competency) {
		this.competency = competency;
	}

	public boolean isProPlayer() {
		return proPlayer;
	}

	public void setProPlayer(boolean proPlayer) {
		this.proPlayer = proPlayer;
	}
}