
//Write a java Program to create an ArrayList, add all the months of a year and Print the same
package wipro.Assignments.List;
import java.util.ArrayList;

public class Assignment1 {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList();
	al.add("jan");
	al.add("Feb");
	al.add("Mar");
	al.add("Apr");
	al.add("May");
	al.add("Jun");
	al.add("jul");
	al.add("Aug");
	al.add("Sept");
	al.add("Oct");
	al.add("Nov");
	al.add("Dec");
	for(int i=0;i<al.size();i++)
  System.out.println(al.get(i));
}
}
