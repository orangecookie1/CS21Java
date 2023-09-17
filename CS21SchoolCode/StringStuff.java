public class StringStuff
{
	public StringStuff()
	{
	String st="The Five Boxing Wizards Jump Quickly";
	System.out.println(st);
	System.out.println("Length: "+st.length());
	System.out.println("Character at position: "+st.charAt(7));
/*
	for(int x=0; x<st.length() ; x++)
	{
		if(st.charAt(x)=='a' || st.charAt(x)=='e' || st.charAt(x)=='i' || st.charAt(x)=='o' || st.charAt(x)=='u')
		{
			System.out.println(st.charAt(x)+" is a vowel.");
		}
		else System.out.println(st.charAt(x)+" is not a vowel.");
	}
*/
/*
for(int x=0; x<256 ; x++)
{
	System.out.println(x+" : "+(char)x);
}
*/
//below is uppercase method
String temp="";
for(int x=0 ; x<st.length() ; x++)
{
	if(st.charAt(x)>=97 && st.charAt(x)<=122)
		temp+=(char)(st.charAt(x)-32);
	else temp+=st.charAt(x);
}
System.out.println(temp);
System.out.println(temp.indexOf(" "));
String temp2="";
for(int x=0 ; x<temp.length() ; x++)
{
	if(temp.charAt(x)!=' ')
		temp2+=temp.charAt(x);

}
System.out.println(temp2);

while(temp.indexOf(" ")>=0)
{
	temp=temp.substring(0,temp.indexOf(" "))+temp.substring(temp.indexOf(" ")+1,temp.length());
}
}
public static void main(String[] args)
{
	StringStuff app=new StringStuff();
	}
	}