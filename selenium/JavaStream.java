package selenium;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class JavaStream {

	@Test
	public void ragular(){
		
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("Hamza");
		nameList.add("Ali");
		nameList.add("Ahmet");
		nameList.add("Mehmet");
		nameList.add("Sinan");
		nameList.add("Tarik");
		nameList.add("Ayse");
		nameList.add("Kemal");
		nameList.add("Mahmut");
		
		int count= 0;
		
		for (String string : nameList) {
			
			if (string.startsWith("A")) {
				count++;
			}
			
		}
		System.out.println(count);
		
		
	}
	
	
	@Test
	public void streamFilter(){
		
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("Hamza");
		nameList.add("Ali");
		nameList.add("Ahmet");
		nameList.add("Mehmet");
		nameList.add("Sinan");
		nameList.add("Tarik");
		nameList.add("Ayse");
		nameList.add("Kemal");
		nameList.add("Mahmut");
		
		Long count = nameList.stream().filter(s->s.startsWith("A")).count();
		System.out.println(count);
	}
		
}
