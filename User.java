public class User{

	private String name;
	private String email;
	private String userName;
	private String password;
	private String loginStatus;

	public User(){}

	public String getName(){

		return this.name;

	}

	public void setName(String name){

		this.name = name;

	}

	public String getEmail(){

		return this.email;

	}

	public void setEmail(String email){

		this.name = name;

	}

	public String getUserName(){

		return this.userName;

	}

	public void setUserName(String userName){

		this.userName = userName;

	}

	public String getPassword(){

		return this.password;

	}

	public void setPassword(String password){

		this.password = password;

	}

	public String getLoginStatus(){

		return this.loginStatus;

	}

	public void setLoginStatus(String loginStatus){

		this.loginStatus = loginStatus;

	}


	//Yoda condition, antiNullPointerException :P
	public boolean verifyLogin(){

		return "logged".equals(this.loginStatus);

	}

}


	
	

