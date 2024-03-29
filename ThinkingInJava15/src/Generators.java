import java.util.*;
import java.util.Collection;

public class Generators {
	public static <T> List<T> fill(List<T> coll,Generator<T> gen,int n){
		for(int i=0;i<n;i++){
			coll.add(gen.next());
		}
		return coll;
	}
	public static void main(String args[]){
		Collection<Coffee> coffee=fill(new LinkedList<Coffee>(),new CoffeeGenerator(),4);
		for(Coffee c:coffee){
			System.out.println(c);
		}
		Collection<Integer> fnumbers=fill(new LinkedList<Integer>(),new Fibonacci(),12);
		for(int i:fnumbers){
			System.out.print(i+" ");
		}
	}
}
