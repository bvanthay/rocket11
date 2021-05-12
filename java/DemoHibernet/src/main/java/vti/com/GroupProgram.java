package vti.com;

import java.util.List;

import vti.com.entity.Group;
import vti.com.entity.User;
import vti.com.repository.GroupRepository;
import vti.com.repository.UserRepository;

public class GroupProgram {
	public static void main(String[] args) {
		GroupRepository repository = new GroupRepository();

		System.out.println("***********GET ALL GroupS***********");

		List<Group> Groups = repository.getAllGroups();

		for (Group Group : Groups) {
			System.out.println(Group);
		}
//
//		System.out.println("\n\n***********GET Group BY ID***********");
//
//		Group GroupById = repository.getGroupByID((short) 2);
//		System.out.println(GroupById);
//
//		System.out.println("\n\n***********GET Group BY NAME***********");
//
//		Group GroupByName = repository.getGroupByName("Marketting");
//		System.out.println(GroupByName);
//
//		System.out.println("\n\n***********CREATE Group***********");
//
//		Group GroupCreate = new Group();
//		GroupCreate.setName("waiting");
//		repository.createGroup(GroupCreate);
//
//		System.out.println("\n\n***********UPDATE Group 1***********");
//
//		repository.updateGroup((short) 3, "Security");
//
//		System.out.println("\n\n***********UPDATE Group 2***********");
//
//		Group GroupUpdate = new Group();
//		GroupUpdate.setId((short) 2);
//		GroupUpdate.setName("Security2");
//		repository.updateGroup(GroupUpdate);
//
//		System.out.println("\n\n***********DELETE GroupS***********");
//		repository.deleteGroup((short) 2);
//
//		System.out.println("***********CHECK Group EXISTS BY ID***********");
//		System.out.println(repository.isGroupExistsByID((short) 1));
//
//		System.out.println("***********CHECK Group EXISTS BY NAME***********");
//		System.out.println(repository.isGroupExistsByName("Security"));


	
	}
}
