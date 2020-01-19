import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("first", "1st");
		map.put("2nd", new Float(0.2f));
		map.put("third", "3rd");
		map.put("third", "111");
		Set set=map.keySet();
		Collection c=map.values();
		Set mapset=map.entrySet();
		System.out.println(set+"\n"+c+"\n"+mapset);
		
	}

}
