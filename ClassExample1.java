class ClassExample1 {
	public static void main(String args[]) {
		GoodsStock obj;
		obj = new GoodsStock();
		obj.goodsCode = "52135";
		obj.stockNum = 200;
		System.out.println("��ǰ�ڵ�: " + obj.goodsCode);
		System.out.println("�������: " + obj.stockNum);
		obj.addStock(1000);
		System.out.println("��ǰ�ڵ�: " + obj.goodsCode);
		System.out.println("�������: " + obj.stockNum);
	}
}