package src;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestTwoExample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TestTwoExample example = new TestTwoExample();
		example.calculateInJava8();

	}
	
//	public void calculate() {
//		List<String> input = Arrays.asList("Suresh", "Ramesh", "Naresh");
//		
//		String tempName = "";
//		
//		for(String name: input) {
//			
//			if(name.equalsIgnoreCase("Suresh")) {
//				tempName = name+"Reddy";
//				break;
//			}
//			
//		}
//		
//		System.out.println(tempName);
//		
//		
//	}
	
	
	public void calculateInJava8() {
		List<String> input = Arrays.asList("Suresh", "Ramesh", "Naresh");
		
		
		List<String> resultList = input.stream().filter(name -> name.equalsIgnoreCase("Suresh")).map(name-> name+"Reddy")
		.collect(Collectors.toList());
		
	
		
		System.out.println(resultList.get(0));
		
		
	}

}
