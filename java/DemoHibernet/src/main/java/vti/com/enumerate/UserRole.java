package vti.com.enumerate;

public enum UserRole {
	ADMIN("Admin"), EMPLOYEE("Employee"), MANAGER("Manager");

	private String value;

	private UserRole(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	
	public static UserRole of(String value) {
		if(value == null) {
			return null;
		}
		for (UserRole name : UserRole.values()) {
			if(name.getValue().equals(value)) {
				return name;
			}
			
		}
		return null;
		
	}
}
