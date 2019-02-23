package leetcode.easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class P929 {

//	 public int numUniqueEmails(String[] emails) {
//	    Set<String> set = new HashSet<>();
//		for (String email : emails) {
//			set.add(formatEmail(email));
//			
//		}
//		return set.size();
//		 
//	 }
//	 
//	 
//	 public String formatEmail(String email){
//		 String[] str = email.split("@");
//		 StringBuilder sb = new StringBuilder();
//		 char[] c = str[0].toCharArray();
//		 for (int i = 0; i < c.length; i++) {
//			char cc = c[i];
//			if(cc == '+') break;
//			if(cc != '.'){
//				
//				sb.append(String.valueOf(cc));
//			}
//		 }
//		 
//		 return sb.toString() + "@"+String.valueOf(str[1]);
//	 }
	 
	public int numUniqueEmails(String[] emails) {
		Set<String> seen = new HashSet();
		for (String email : emails) {
			int i = email.indexOf("@");
			String local = email.substring(0, i);
			String rest = email.substring(i);
			if(local.contains("+")){
				local = local.substring(local.indexOf("+"));
			}
			local = local.replaceAll(".", "");
			seen.add(local+rest);
		}
		return seen.size();
	}
	
	@Test
	public void testFormat(){
		//String email = formatEmail("test.email+alex@leetcode.com");
		//System.out.println(email);
	}
}
