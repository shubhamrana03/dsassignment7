import java.util.*;
class Number
{
	private int value;
	
	Number()
	{
		value = -999;
	}
	Number(int value)
	{
		this.value = value;
	}
	void setValue(int value)
	{
		this.value = value;
	}
	int getValue()
	{
		return this.value;
	}
	public int hashCode()
	{
		return (10*value)+10;
	}
	public boolean equals(Object o)
	{
		Number n = (Number)o;
		if(n.getValue() == this.value)
			return true;
		else
			return false;
	}
}
public class collection2
{
	public static void main(String[] args)
	{
		int n1,n2,i;
		Set <Number> s1 = new HashSet<>();
		Set <Number> s2 = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("// FOR SET I:-");
		System.out.print("Enter the number of elements : ");
		n1 = sc.nextInt();
		System.out.println("Start entering the elements :-");
		for(i=0;i<n1;i++)
			s1.add(	new Number(sc.nextInt()) );
		System.out.print("\nSet I : ");
		for(Number num : s1)
			System.out.print( num.getValue() + " ");
		System.out.println("\n");
		
		System.out.println("// FOR SET II:-");
		System.out.print("Enter the number of elements : ");
		n2 = sc.nextInt();
		System.out.println("Start entering the elements :-");
		for(i=0;i<n2;i++)
			s2.add(	new Number(sc.nextInt()) );
		System.out.print("\nSet II : ");
		for(Number num : s2)
			System.out.print( num.getValue() + " ");
		System.out.println("\n");
		
		System.out.println("// Removing elements from s1 that are not in s2...");
		s1.retainAll(s2);
		System.out.println("// Removing elements from s2 that are not in s1...");
		s2.retainAll(s1);
		
		System.out.println("...Done.");
		
		System.out.print("\nSet I : ");
		for(Number num : s1)
			System.out.print( num.getValue() + " ");
		System.out.println("\n");
		
		System.out.print("\nSet II : ");
		for(Number num : s2)
			System.out.print( num.getValue() + " ");
		System.out.println("\n");
		
		sc.close();
	}
}