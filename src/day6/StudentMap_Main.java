package day6;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StudentMap_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Student> studentMap = new TreeMap<Integer, Student>();
		studentMap.put(21, new Student(21,"Aaddya"));
		studentMap.put(45, new Student(45,"Soni"));
		studentMap.put(98, new Student(98,"Nisha"));
		studentMap.put(63, new Student(63,"Shreya"));
		studentMap.put(18, new Student(18,"Shruti"));
		
		Map<Integer, Student> output = studentMap.entrySet().stream()
				.filter(entry -> entry.getValue().getName().startsWith("S"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		for(Map.Entry<Integer, Student> entry : output.entrySet())
			System.out.println("Key = " + entry.getKey() + "---Value = " + entry.getValue());
	}

}
