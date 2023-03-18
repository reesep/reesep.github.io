
public class SlotMachine {
	
	private int winnings;
	
	private int[] top_row;
	private int[] middle_row;
	private int[] bottom_row;
	
	public SlotMachine() {
		this.winnings = 0;
		this.top_row = new int[3];
		this.middle_row = new int[3];
		this.bottom_row = new int[3];
	}
	
	//other methods omitted
	
	public int playRound() {
		
		for(int i = 0; i < 3; i ++) {
			
			int num1 = getRandomVal();
			int num2 = getRandomVal();
			int num3 = getRandomVal();
			
			this.top_row[i] = num1;
			this.middle_row[i] = num2;
			this.bottom_row[i] = num3;
			
		}
		
		print_slot_machine(this);

		//remaining code ommitted
		