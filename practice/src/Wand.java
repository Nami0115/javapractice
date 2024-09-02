public class Wand {
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException ("名前が短すぎるため、処理を中断。");
		}
		
		this.name = name;
	}
	
	private double power;
	
	public double getPower() {
		return this.power;
	}
	
	public void setPower(double power) {
		this.power = power;
	}

}
