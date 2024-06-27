package ch15.problem03;

public class Goods {

	private String name;
	private int cost;
	private int cnt;

	public Goods(String name, int cost, int cnt) {
		this.name = name;
		this.cost = cost;
		this.cnt = cnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public void print() {
		{
			System.out.printf("%s(가격 : %d원)이 %d 개 입고 되었습니다. \n", this.name, this.cost, this.cnt);
		}
		

	}

}