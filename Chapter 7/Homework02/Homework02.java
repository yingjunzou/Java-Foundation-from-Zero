public class Homework02 {
	public static void main (String[] args) {
		String[] strs = {"jack", "tom", "mary", "milan"};
		A02 a02 = new A02();
		Integer index = a02.find("mary", strs);
		if(index != null) {
			System.out.println("Index found = " + index);
		} else {
			System.out.println("The input of strings has error, strs cannot be null or {}.");
		}
	}
}

class A02 {
	public Integer find(String findStr, String[] strs) {

		if(strs != null && strs.length > 0) {
			for(int i = 0; i < strs.length; i++) {
			    if(findStr.equals(strs[i])) {
				   return i;
			    }
		    }
		    return -1;
		} else {
			return null;
		}
	}
}