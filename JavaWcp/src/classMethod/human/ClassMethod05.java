package classMethod.human;

public class ClassMethod05 {
	public static void main(String[] args) {
    
		Human04 yamada = new Human04("山田");

   
		Human04.staticMethodPrint();

    
		System.out.println(Human04.GREETING);	

    
    	yamada.instanceMethodPrint();
	}
}
