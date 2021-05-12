package vti.com;

import java.util.List;

import vti.com.entity.User;
import vti.com.entity.User;
import vti.com.repository.UserRepository;
import vti.com.repository.UserRepository;

public class UserProgram {
	public static void main(String[] args) {
		UserRepository repository = new UserRepository();

		System.out.println("***********GET ALL UserS***********");

		List<User> Users = repository.getAllUsers();

		for (User User : Users) {
			System.out.println(User);
		}
//
//		System.out.println("\n\n***********GET User BY ID***********");
//
//		User UserById = repository.getUserByID((short) 2);
//		System.out.println(UserById);
//
//		System.out.println("\n\n***********GET User BY NAME***********");
//
//		User UserByName = repository.getUserByName("Marketting");
//		System.out.println(UserByName);
//
//		System.out.println("\n\n***********CREATE User***********");
//
//		User UserCreate = new User();
//		UserCreate.setName("waiting");
//		repository.createUser(UserCreate);
//
//		System.out.println("\n\n***********UPDATE User 1***********");
//
//		repository.updateUser((short) 3, "Security");
//
//		System.out.println("\n\n***********UPDATE User 2***********");
//
//		User UserUpdate = new User();
//		UserUpdate.setId((short) 2);
//		UserUpdate.setName("Security2");
//		repository.updateUser(UserUpdate);
//
//		System.out.println("\n\n***********DELETE UserS***********");
//		repository.deleteUser((short) 2);
//
//		System.out.println("***********CHECK User EXISTS BY ID***********");
//		System.out.println(repository.isUserExistsByID((short) 1));
//
//		System.out.println("***********CHECK User EXISTS BY NAME***********");
//		System.out.println(repository.isUserExistsByName("Security"));


	
	}
}
