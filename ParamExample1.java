class ParamExample1 {
	public static void main(String args[]) {
		for (String str : args) // args배열의 항목 값을 순서대로 출력
			System.out.println(str); 
		System.out.println("args.length=" + args.length); //args 배열의 항목 수를 출력
	}
} 