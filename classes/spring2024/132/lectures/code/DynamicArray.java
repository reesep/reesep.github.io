import java.util.Arrays;

public class DynamicArray{

	
	private String[] array;
	
	public DynamicArray() {
		this.array = new String[0];
	}
	
	public void add(String newName) {
		
		String[] newArray = new String[array.length +1];
		
		//copy everything over from old to new
		for(int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		//insert new name
		newArray[array.length] = newName;
		
		//update my pointer
		array = newArray;
		
	}
	
	// [ Reese Susan Spencer ] 
	public void print() {
		
		String ans = "[ ";
		for(String s: array) {
			ans += s + " ";
		}
		
		System.out.println(ans + "]");
	}
	
	public String get(int index) {
		try {
			return array[index];
		}
		catch(Exception e) {

			return "Illegal index. Try again";
		}
	}
	
	public int find(String name) {
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i].equals(name)) {
				return i;
			}
			
		}
		return -1;
		
	}
	
	public void remove(String name) {
		
		if(find(name) == -1) {
			return;
		}
		
		String[] newArray = new String[array.length-1];
		int insertIndex = 0;
		for(int i = 0; i < array.length; i++) {
			
			if(!array[i].equals(name)) {
				newArray[insertIndex] = array[i];
				insertIndex++;
			}
			
		}
		array = newArray;
		
		
	}
	
	
}
