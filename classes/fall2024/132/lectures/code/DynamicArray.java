
public class DynamicArray {

	private String[] data; // = new String[0];
	
	public DynamicArray() {
		this.data = new String[0];
	}
	
	public void add(String newValue) {
		
		String[] newArray = new String[this.data.length + 1];
		for(int i = 0; i < this.data.length ; i++) {
			newArray[i] = this.data[i];
		}
		newArray[this.data.length] = newValue;
		this.data = newArray;
	}
	
	public void printArray() {
		// [ First Second Third ]
		String s = "";
		s += "[";
		for(int i = 0; i < data.length; i++) {
			s += data[i] + " ";
		}
		s += "]";
		System.out.println(s);
	}
	
	public int find(String searchName) {
		
		for(int i = 0; i < data.length; i++) {
			if(data[i].equals(searchName)) {
				return i;
			}
		}
		return -1;
		
	}
	
	public String get(int index) {
		if(index >= 0 && index < data.length) {
			return data[index];
		}
		return "Index not valid";
	}
	
	public void remove(String search) {
		
		String[] newArray = new String[this.data.length - 1];
		int insertSpot = 0;
		for(int i = 0; i < data.length ; i++) {
		
			if(!data[i].equals(search)) {
				newArray[insertSpot] = data[i];
				insertSpot++;
			}
		}
		this.data = newArray;
		
	}
	
	
	
	
	
	
	
	
	
}
