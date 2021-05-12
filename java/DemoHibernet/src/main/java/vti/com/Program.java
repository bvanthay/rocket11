package vti.com;

import java.util.List;

import vti.com.entity.Testingcategory;
import vti.com.entity.User;
import vti.com.repository.TestingcategoryRepository;
import vti.com.repository.UserRepository;

public class Program {
	public static void main(String[] args) {
		TestingcategoryRepository repository = new TestingcategoryRepository();

		System.out.println("***********GET ALL TestingcategoryS***********");

		List<Testingcategory> Testingcategorys = repository.getAllTestingcategorys();

		for (Testingcategory Testingcategory : Testingcategorys) {
			System.out.println(Testingcategory);
		}
//
//		System.out.println("\n\n***********GET Testingcategory BY ID***********");
//
//		Testingcategory TestingcategoryById = repository.getTestingcategoryByID((short) 2);
//		System.out.println(TestingcategoryById);
//
//		System.out.println("\n\n***********GET Testingcategory BY NAME***********");
//
//		Testingcategory TestingcategoryByName = repository.getTestingcategoryByName("Marketting");
//		System.out.println(TestingcategoryByName);
//
//		System.out.println("\n\n***********CREATE Testingcategory***********");
//
//		Testingcategory TestingcategoryCreate = new Testingcategory();
//		TestingcategoryCreate.setName("waiting");
//		repository.createTestingcategory(TestingcategoryCreate);
//
//		System.out.println("\n\n***********UPDATE Testingcategory 1***********");
//
//		repository.updateTestingcategory((short) 3, "Security");
//
//		System.out.println("\n\n***********UPDATE Testingcategory 2***********");
//
//		Testingcategory TestingcategoryUpdate = new Testingcategory();
//		TestingcategoryUpdate.setId((short) 2);
//		TestingcategoryUpdate.setName("Security2");
//		repository.updateTestingcategory(TestingcategoryUpdate);
//
//		System.out.println("\n\n***********DELETE TestingcategoryS***********");
//		repository.deleteTestingcategory((short) 2);
//
//		System.out.println("***********CHECK Testingcategory EXISTS BY ID***********");
//		System.out.println(repository.isTestingcategoryExistsByID((short) 1));
//
//		System.out.println("***********CHECK Testingcategory EXISTS BY NAME***********");
//		System.out.println(repository.isTestingcategoryExistsByName("Security"));


	
	}
}
