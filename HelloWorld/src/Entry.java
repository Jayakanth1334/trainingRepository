
public class Entry {
	public static void main(String[] args) {
		Person pRef;		// reference variable(const pointer)
		int value;			// primitive variable //
		
		value = 90;
		
		pRef = new Person();
		
		Person pRef2 = pRef;
		
		System.out.println(pRef == pRef2);
		
		pRef2 = new Person();
		
		System.out.println(pRef == pRef2);
		
		
		char a = 1;      // 1
	    char b = '\61';    // 2
	    char c = '\061';   // 3
	    char d = 0x0031;   // 4
	    char e = '\u0031'; // 5
	    System.out.print(""+a+b+c+d+e);



		
		
	}
}
