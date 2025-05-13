
public class DynamicArray {

	private String[] data;
	
	public DynamicArray() {
		this.data = new String[0];
	}
	
	public void add(String newElement) {
		
		String[] newArray = new String[data.length + 1];
		
		for(int i =0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		
		newArray[data.length] = newElement;
		this.data = newArray;
		
		
		
	}
	
	public void print() {
		
		String s = "[ ";
		for(int i = 0; i < data.length; i++) {
			s += data[i] + " ";
		}
		System.out.println(s + " ]");
		
	}

	public String get(int i) {
		return data[i];
		
	}
	
	
	
}
