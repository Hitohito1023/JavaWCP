package chapter9;

public class Human01 {
	public String name;  //メンバー変数
	public int age;
	
	//	引数なしのコンストラクタ（インスタンス作成時に自動で作成される）
	public Human01() {
		name = "山田";
		age = 20;
	}
	
	//	引数ありのコンストラクタ
	public Human01(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
