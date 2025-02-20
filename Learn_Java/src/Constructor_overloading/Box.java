package Constructor_overloading;

public class Box {

	
	int height,width,depth;
	
	public Box() {
		height=0;
		width=0;
		
		depth=0;
	}
	public Box(int height,int width) {
		this.height=height;
		this.width=width;
	}
	public Box(int height,int width,int depth) {
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	
	int volume() {
		return height+width+depth;
	}
	
}
