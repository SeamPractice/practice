import java.util.*;

public class Administrator extends User{

	private List<String> permissions = new ArrayList<String>();
	private List<String> role = new ArrayList<String>();

	public List<String> getPermissions(){

		return this.permissions;
	
	}

	public void setPermissions(List<String> permissions){

		this.permissions = permissions;

	}


	public List<String> getRole(){

		return this.role;
	
	}

	public void setRole(List<String> role){

		this.role = role;

	}

	public void addRole(String role){

		this.role.add(role);

	}

	public boolean removeRole(String rol){

		return this.role.remove(role);

	}

	public void addPermission(String permission){

		this.permissions.add(permission);

	}

	public boolean removePermission(String permission){

		return this.permissions.remove(permission);

	}

}

	