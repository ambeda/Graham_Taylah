import java.util.Scanner;
public class Lab_07ReplaceAts
{
	static String sentence;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println ("Please Enter A Sentence:");
		sentence = kb.nextLine();
		replace();
		System.out.println (sentence);
	}
	public static void replace()
	{
		while(sentence.indexOf("a") >= 0)
		{
			sentence = sentence.substring(0, sentence.indexOf("@")) + sentence.substring(sentence.indexOf("a") -1);
		}
		
	
	}
}