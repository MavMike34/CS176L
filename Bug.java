package cs176;

public class Bug {
	
	public boolean facingRight = true;
	public int currentPosition;
	
	public Bug(int initialPosition) {
		currentPosition = initialPosition;
	}
	
	public void turn() {
		if(facingRight) {
			facingRight = false;
		}
		
		else if(!facingRight){
			facingRight = true;
		}
	}
	
	public void move() {
		if(facingRight) {
			currentPosition += 1;
		}
		
		else if(!facingRight){
			currentPosition -= 1;
		}
	}
	
	public int getPosition() {
		return currentPosition;
	}

}
