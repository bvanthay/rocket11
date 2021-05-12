package vti.com.enumerate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter 
public class UserRoleConvert implements AttributeConverter<UserRole, String> {

	public String convertToDatabaseColumn(UserRole name) {
		if(name == null) {
			return null;
		}
		return name.getValue();
	}

	public UserRole convertToEntityAttribute(String value) {
		
		return UserRole.of(value);
	}
	
}
