
public class Veiling {
	
	private int bod = 0;
	
	public void doeBod (int bod) {
		if (this.bod < bod) {
			this.bod = bod;
		}	
	}
	
	public int getHoogsteBod() {
		return bod;
	}
}


