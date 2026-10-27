package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//車クラスのインスタンスを作成する。
		Car_Chapter15 car = new Car_Chapter15(1,10);
		
		//車クラスのchangeGearメソッドを実行する。
		try {
			car.changeGear(3);
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		//車クラスのrunメソッドを実行する。
		car.run();
	}

}
