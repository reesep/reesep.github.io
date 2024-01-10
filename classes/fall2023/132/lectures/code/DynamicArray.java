
public class DynamicArray {

	private String[] data;
	
	public DynamicArray() {
		this.data = new String[0];
	}
	

	public void add(String newElement) {

		String[] newArray = new String[data.length+1];
		for(int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		newArray[data.length] = newElement;
		this.data = newArray;
	}
	
	// [ Reese Susan Spencer ]
	public void print() {
		String s = "";
		s += "[ ";
		for(String x: this.data) {
			s+= x + " ";
		}
		s += "]";
		System.out.println(s);
	}
	
	public String get(int index) {
		try{
			return data[index];
		}catch(Exception e) {
			return "N/A";
		}
	}
	
	public int find(String search) {
		
		for(int i = 0; i < data.length; i++) {
			if(data[i].equals(search)) {
				return i;
			}
		}
		return -1;
		
	}
	
	public void remove(String search) {
		boolean has_found = false;
		for(int i = 0; i < data.length; i++) {
			if(data[i].equals(search)) {
				data[i] = null;
				has_found = true;
			}
		}
		
		if(has_found == true) {
			String[] newArray = new String[data.length-1];
			int counter = 0;
			for(int i = 0; i < data.length;i++) {
				if(data[i] != null) {
					newArray[counter] = data[i];
					counter++;
				}
			}
			data = newArray;
		}
	}
	
}
