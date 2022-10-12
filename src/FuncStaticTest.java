
public class FuncStaticTest {

	public static void main(String[] args) {
		
		//FuncStatic.cv = 20;   //생성없이 사용가능
		//FuncStatic.staticMethod();  //생성없이 사용 가능
		
		FuncStatic fs = new FuncStatic();
		
		fs.instanceMethod();
		FuncStatic.staticMethod();
		
		//fs.iv = 10;
		//fs.cv = 20;
		
		
		//fs.instanceMethod();
		//fs.staticMethod();
		

	}

}
