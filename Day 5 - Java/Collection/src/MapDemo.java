import java.util.HashMap;

public class MapDemo {
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("First Name", "Jestin");
		map.put("Last Name", "Sabu");
		map.put("Age", "21");
		
		
		System.out.println("First Name : " + map.get("First Name"));
		System.out.println("Last Name : " + map.get("Last Name"));
		System.out.println("Age  : " + map.get("Age"));
		
		System.out.println();
		
//		for (HashMap.Entry<String, String> entry : map.entrySet()) {
//			String key = entry.getKey();
//			String val = entry.getValue();
//			
//			System.out.println(key + " : " + val);
//			
//		}
		
		for(String key: map.keySet())
			System.out.println(key + " : " + map.get(key));
	}

}
