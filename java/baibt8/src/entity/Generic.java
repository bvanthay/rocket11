package entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import entity2.Employee;
import entity2.MyMap;
import entity2.Phone;
import entity2.Staff;

public class Generic {
	public void Ques1() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "quang");

		Map<Float, String> map2 = new HashMap<Float, String>();
		map2.put(1.0f, "Dat");

		Map<Double, String> map3 = new HashMap<Double, String>();
		map3.put((double) 1, "duc");

		System.out.println("Student" + map);
		System.out.println("Student" + map2);
		System.out.println("Student" + map3);
		
	}

	public void Ques4() {
		Integer[] integers = { 1, 2, 3, 4, 5 };
		Float[] floats = { 1f, 2f, 3f, 4f, 5f };
		Long[] longs = { (long) 1, (long) 2, (long) 3, (long) 4, (long) 5 };
		Double[] doubles = { (double) 1, (double) 2, (double) 3, (double) 4, (double) 5 };

		System.out.println(integers);
		System.out.println(floats);
		System.out.println(longs);
		System.out.println(doubles);
		
	}

	public void Ques5() {
		
		Integer[] integers = { 60000, 70000, 80000 };
		Employee<Integer> employee = new Employee<>(1, "Cuong", integers);
		System.out.println(employee + "Luong thang cuoi cung:" + integers[integers.length - 1]);

		
		Float[] floats = { 5000f, 6000f, 70000f };
		Employee<Float> employee2 = new Employee<>(2, "Dat", floats);

		System.out.println(employee2 + "Luong thang cuoi cung:" + floats[floats.length - 1]);

		
		Double[] doubles = { (double) 6000, (double) 7000, (double) 7800 };
		Employee<Double> employee3 = new Employee<>(3, "Dung", doubles);
		System.out.println(employee3 + "Luong thang cuoi cung:" + doubles[doubles.length - 1]);
		System.out.println("==================================================================");
	}
	public void Ques6() {
		MyMap<String, String> map = new MyMap<String, String>("SV01", "trung");
		System.out.println("Ma sinh vien:"+map.getKey()+"\n Tên sinh viên:"+map.getValues());
		System.out.println("==================================================================");
	}

	public void Ques7() {
		System.out.println("Key là Email");
		Phone<String, String>phone = new Phone<String, String>("buidinhdat14@gmail.com", "0914680888");
		System.out.println("Email:"+phone.getKey()+"\nSDT:"+phone.getValues());
		
		
		System.out.println("Key là STT");
		Phone<Integer, String > phone2 = new Phone<Integer, String>(1, "0914752888");
		System.out.println("STT:"+phone2.getKey()+"\nSDT:"+phone2.getValues());
		
		System.out.println("Key la ten nguoi dung");
		Phone<String, String> phone3 = new Phone<String, String>("bui dinh dat", "0914680888");
		System.out.println("Tên người dùng:"+phone3.getKey()+"\nSDT:"+phone3.getValues());
		
		
	}
	
	public void Ques8() {
		Staff<Integer, String> staff = new Staff<Integer, String>(1, "dat");
		System.out.println("ID:"+staff.getKey()+"\n Name:"+staff.getValues());
		
		
		Staff<Long, String> staff2 = new Staff<Long, String>((long) 1, "dat");
		System.out.println("ID:"+staff2.getKey()+"\nName:"+staff2.getValues());
	}
}
