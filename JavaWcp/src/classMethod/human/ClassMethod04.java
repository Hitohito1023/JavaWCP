package classMethod.human;

public class ClassMethod04 {
	public static void main(String[] args) {
        Human04 yamada = new Human04("山田");

        Human04.staticMethodPrint();

        // staticなクラス定数もインスタンスを生成せずに参照できる
        System.out.println(Human04.GREETING);

        
        yamada.instanceMethodPrint();
    }
	

}
