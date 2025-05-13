import java.util.LinkedList;

public class JavaLinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Reese");
		list.add("Sean");
		list.add("Iliana");
		list.add("Clem");
		
		System.out.println(list);
		
		System.out.println(list.getFirst());
		list.remove();
		list.remove("Sean");
		System.out.println(list);

	}

}
