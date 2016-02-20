interface A{
	public void method1();
	public void method2();
}
class B implements A{
	public void method1(){
		System.out.println("method1");
	}
	public void method2(){
		System.out.println("method2");
	}
	public void method3(){
		System.out.println("method3");
	}
}
class C{
	public <T extends A> void f(A a){
		a.method1();
		a.method2();
	}
}
public class Test20 {
	public static void main(String args[]){
		A a=new B();
		new C().f(a);
	}
}
