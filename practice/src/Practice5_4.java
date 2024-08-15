public class Practice5_4 {
	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積は、" + triangleArea + "平方cm");
		
		double CircleArea = calcCircleArea(5.0);
		System.out.println("円の面積は、" + CircleArea + "平方cm");
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		double triangleArea = (bottom * height) / 2;
		return triangleArea;
	}
	
	public static double calcCircleArea(double radius) {
		double CircleArea = radius * radius * 3.14;
		return CircleArea;
	}
}
