/*6. Design a Java program to accept a string. Count and display the number of
vowels, consonants and spaces in the string*/
import java.util.Scanner;
class count {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String");
String str = sc.next();
str = str.toLowerCase();
int vow = 0, con = 0, sp = 0;
for(int i = 0;i<str.length();i++){
char ch = str.charAt(i);
if(ch == 'a' || ch == 'e' || ch == 'i'
|| ch == 'o' || ch == 'u') {
++vow;
}
else if((ch >= 'a'&& ch <= 'z')) {
++con;
}
else if (ch ==' ')
{
++sp;
}
}
System.out.println("vowels:"+vow+"\tconsonants:"+con+"\tspaces:"+sp);
}
}