import java.util.HashMap;
import java.util.Map;

public class TypeCounter extends HashMap<Class<?>,Integer>{
	private Class<?> baseType;
	public TypeCounter(Class<?> baseTypes){
		this.baseType=baseType;
	}
	public void count(Object obj){
		Class<?> type=obj.getClass();
		if(!baseType.isAssignableFrom(type)){
			throw new RuntimeException(obj+" incorrect type: "+type+",should be type or subtype of "+baseType);
			countClass(type);
		}
	}
	private void countClass(Class<?> type){
		Integer quantity=get(type);
		put(type,quantity==null?1:quantity+1);
		Class<?> superClass=type.getSuperclass();
		if(superClass!=null&&baseType.isAssignableFrom(superClass))
			countClass(superClass);
	}
	public String toString{
		StringBuilder result=new StringBuilder();
		for(Map<K, V>.Entry<Class, V>)
	}
}