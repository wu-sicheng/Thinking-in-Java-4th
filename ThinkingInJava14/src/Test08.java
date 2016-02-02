import java.lang.reflect.Field;

class A08{}
class A081 extends A08{}
class A082 extends A081{}
public class Test08 {
	public static void method(Object obj){
		Class c=obj.getClass();
		while(!c.equals(Object.class)){
			System.out.println(c.getSimpleName());
			c=c.getSuperclass();
		}
	}
	public static void method2(Object obj){
		Class c=obj.getClass();
		try {
			Field f=c.getDeclaredField(null);
			System.out.println(f);
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String args[]){
		A082 a=new A082();
		method(a);
		method2(new A082());
	}
}