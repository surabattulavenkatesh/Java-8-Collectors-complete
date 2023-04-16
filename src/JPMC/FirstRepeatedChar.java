package JPMC;

class FirstRepeatedChar{

// Function which repeats
// first Nonrepeating character
public static void FirstNonRepeat(String s)
{

	for (int i = 0; i < s.length(); i++) {

		char ch = s.charAt(i);
		int val = s.indexOf(ch, s.indexOf(ch)+1);
		if ( val == -1) 
		{
			System.out.println("First non-repeating character is "+ s.charAt(i));
			break;
		}
	}
}
public static void main (String[] args) {
	String s = "vennvkatxesh";
	FirstNonRepeat(s);
}
}

