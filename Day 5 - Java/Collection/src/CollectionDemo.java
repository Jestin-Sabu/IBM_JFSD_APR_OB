import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDemo {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Google");
		list.add("Oracle");
		list.add(2, "Microsoft");
		list.add("IBM");
		
		System.out.println("Traversing over ArrayList using for loop");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		
		System.out.println("Traversing over ArrayList using Iterator");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Traversing over ArrayList using for...each");
		for (String s : list)
			System.out.println(s);
		
		LinkedList<String> link = new LinkedList<>();
		link.add("Tesla");
		link.addFirst("Apache");
		link.add("Apple");
		link.add("Meta");
		
		list.addAll(link); // Merge linked list into ArrayList
		System.out.println("Traversing over updated Arraylist using for...each");
		for (String s : list)
			System.out.println(s);
		
		//Convert ArrayList into HashSet
		HashSet<String> set = new HashSet<>(list);
		System.out.println("Traversing over HashSet using for..each");
		for (String s : set)
			System.out.println(s);
		
		TreeSet<String> tree = new TreeSet<>(list);
		System.out.println("Traversing over Treeset using for...each");
		for (String s : tree)
			System.out.println(s);
	}	

}
