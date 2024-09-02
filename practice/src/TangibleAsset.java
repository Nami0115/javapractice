//本の解答を確認しましたが、修正せずにそのままで提出しています
public abstract class TangibleAsset extends Asset implements Thing {
	String color;
	double weight;
	
	public String getColor() {
		return this.color;
	}
	
	public double getWeight() {
		return this.weight;
	}
	public double setWeight() {
		return this.weight;
	}
}