package ch06.sec03;

public class GoodsApp2 {

	public static void main(String[] args) {
		Goods goods = new Goods();
		
		goods.setName("LG그램");
		goods.setPrice(900000);
		
		System.out.println("-상품이름: " + goods.getName() + ", 가격: " + goods.getPrice());
		
		goods.setName("머그컵");
		goods.setPrice(2000);
		
		System.out.println("-상품이름: " + goods.getName() + ", 가격: " + goods.getPrice());
	}
	
}
