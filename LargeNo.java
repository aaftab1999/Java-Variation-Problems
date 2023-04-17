package Variation;

public class LargeNo {
	

Darkmode LightMode
Welcome Aftab Shaikh Eshaque MandalGoBackToTestMenulogoutDarkThemeForTextBoxLightThemeForTextBox
HideQuestions
SN	DBId	QName	DL	Action
1	600	SUm of Product	2(836)	Load
2	370	number is perfect square or not	3(2466)	Load
3	1278	Perrin numbers	4(504)	Load
4	1315	Digit in product	5(1025)	Load
5	1255	Nth item through sum	6(588)	Load
6	1130	ExtractPortionOfArrayList	7(2641)	Load
7	304	sort array elements by frequency	8(605)	Load
8	665	Concatenate n times	4(3268)	Load
9	1016	SetViewOfTheMappingsContainedInaMap	5(6203)	Load
10	553	Closet Number	6(707)	Load
11	1084	RetainElementsWhichAreSameOnBothSets	2(1811)	Load
12	558	Max Distance	3(0)	Load
13	522	Swap two nibbles	4(1190)	Load
14	1293	Jumping Caterpillars	5(143)	Load
15	921	Large no	6(918)	Load
16	305	merge two array in third	7(1835)	Load
17	288	count the number of words in String	8(2916)	Load
18	68	Binary Search	4(18414)	Load
19	124	SecondMostFrequentChar	5(6621)	Load
20	526	Count Numbers	6(3037)	Load
ProblemStatement
Given a number, the task is that we divide number by 3. The input number may be large and it may not be possible to store even if we use long long int.
Examples: 
 

Input  : n = 769452
Output : Yes

Input  : n = 123456758933312
Output : No

Input  : n = 3635883959606670431112222
Output : Yes
 

yourCode
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String str = "1332";
		myCode(str);
	}
	//EndOfMainMethod
	private static void myCode(String s)
	{
		int store=0;
		for(int i=0; i<s.length(); i++)
		{
			int num=Integer.parseInt(s.charAt(i)+"");
			store+=num;
		}
		if(store%3==0)
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}

AllignYourCode (ctrl+a)UpdateOnServer (ctrl + s)RunServer1RunServer2S1S2S3S4 Done
OutPut
Your code output and expected output are not matching
Input Given:
public static void main(String[] args) 
	{   	
		String str = "1332";
		 myCode(str);
	}

Expected Output:
Yes

YourOutPut:



ReportThisQuestion
If you find anything wrong in this question, please report it, Write your message here and click "Report"

Report




}
