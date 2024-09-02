//本の解答を確認しましたが、修正せずにそのままで提出しています
public class Computer extends TangibleAsset {
	String makerName;
	
	public Computer (String name, int price, String color, String makerName) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.makerName = makerName;
	}
	
	public String getMakerName() {
		return this.makerName;
	}
}
