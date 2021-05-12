package vti.com;

import java.util.List;

import vti.com.entity.QuestionLevel;
import vti.com.entity.User;
import vti.com.repository.QuestionLevelRepository;
import vti.com.repository.UserRepository;

public class QuestionLevelProgram {
	public static void main(String[] args) {
		QuestionLevelRepository repository = new QuestionLevelRepository();

		System.out.println("***********GET ALL QuestionLevelS***********");

		List<QuestionLevel> QuestionLevels = repository.getAllQuestionLevels();

		for (QuestionLevel QuestionLevel : QuestionLevels) {
			System.out.println(QuestionLevel);
		}
//
//		System.out.println("\n\n***********GET QuestionLevel BY ID***********");
//
//		QuestionLevel QuestionLevelById = repository.getQuestionLevelByID((short) 2);
//		System.out.println(QuestionLevelById);
//
//		System.out.println("\n\n***********GET QuestionLevel BY NAME***********");
//
//		QuestionLevel QuestionLevelByName = repository.getQuestionLevelByName("Marketting");
//		System.out.println(QuestionLevelByName);
//
//		System.out.println("\n\n***********CREATE QuestionLevel***********");
//
//		QuestionLevel QuestionLevelCreate = new QuestionLevel();
//		QuestionLevelCreate.setName("waiting");
//		repository.createQuestionLevel(QuestionLevelCreate);
//
//		System.out.println("\n\n***********UPDATE QuestionLevel 1***********");
//
//		repository.updateQuestionLevel((short) 3, "Security");
//
//		System.out.println("\n\n***********UPDATE QuestionLevel 2***********");
//
//		QuestionLevel QuestionLevelUpdate = new QuestionLevel();
//		QuestionLevelUpdate.setId((short) 2);
//		QuestionLevelUpdate.setName("Security2");
//		repository.updateQuestionLevel(QuestionLevelUpdate);
//
//		System.out.println("\n\n***********DELETE QuestionLevelS***********");
//		repository.deleteQuestionLevel((short) 2);
//
//		System.out.println("***********CHECK QuestionLevel EXISTS BY ID***********");
//		System.out.println(repository.isQuestionLevelExistsByID((short) 1));
//
//		System.out.println("***********CHECK QuestionLevel EXISTS BY NAME***********");
//		System.out.println(repository.isQuestionLevelExistsByName("Security"));


	
	}
}
