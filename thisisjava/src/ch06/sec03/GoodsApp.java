package ch06.sec03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("nikon");
		camera.setPrice(400000);
		
		System.out.println("상품이름: " + camera.getName());
		System.out.println("상품가격: " + camera.getPrice());

	}

}
