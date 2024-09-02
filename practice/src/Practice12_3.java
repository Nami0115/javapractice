//①Y
//②以下のコードを作成しました
public class Practice12_3 {
	public static void main(String[] args) {
		//Aクラス
		Y[] y1 = new Y[2];
		y1[0] = new A();
		y1[1] = new A();
		
		for (Y y1Result : y1) {
			y1Result.b();
		}
		
		//Bクラス
		Y[] y2 = new Y[2];
		y2[0] = new B();
		y2[1] = new B();
		
		for (Y y2Result : y2) {
			y2Result.b();
		}
	}
}
