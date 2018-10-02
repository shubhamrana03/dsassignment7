import java.util.*;
class Student
{
	private int id;
	
	Student(int id)
	{
		this.id = id;
	}
	
	void setId(int id)
	{
		this.id = id;
	}
	
	int getId()
	{
		return id;
	}
	
	public boolean equals(Object o)
	{
		Student s = (Student)o;
		if(s.getId() == this.id)
			return true;
		else
			return false;
	}
	
	public int hashCode()
	{
		return (id*10)+10;
	}
}
public class collection2_2
{
	private static void display(Map <Student,String> hm)
	{
		System.out.println("\nHashMap :-");
		Set s = hm.entrySet();
		Iterator it = s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry m = (Map.Entry)it.next();
			
			System.out.print("ID : " + ((Student)m.getKey()).getId() + "\t");
			System.out.println("Name : " + m.getValue());
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args)
	{
		Map <Student,String> hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int n,i,id;
		String name;
		
		System.out.print("Enter the number of elements : ");
		n = sc.nextInt();
		System.out.println("Start entering the ID followed by names :-");
		for(i=0;i<n;i++)
		{
			id = sc.nextInt();
			name = sc.nextLine();
			hm.put(new Student(id),name);
		}
		display(hm);
		
		System.out.println("Now, we'll replace the value for a particular value of key...");
		System.out.print("Enter the ID : ");
		id = sc.nextInt();
		System.out.print("Enter the name : ");
		sc.nextLine();
		name = sc.nextLine();
		hm.put(new Student(id),name);
		System.out.println("Update successful");
		display(hm);
		
		sc.close();
	}
}