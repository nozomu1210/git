package dto;

public class Account2 {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String phonenumber;
	private String mail;
	private String salt;
	private String password;
	private String hashedPassword;
	
	public Account2(int id, String name,int age,String gender, String phonenumber,String mail, String salt, String password, String hashedPassword) {
		super();
		this.id = id;
		this.name = name;
		this.age=age;
		this.gender=gender;
		this.phonenumber=phonenumber;
		this.mail = mail;
		this.salt = salt;
		this.password = password;
		this.hashedPassword = hashedPassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setDenwa(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}
}

	