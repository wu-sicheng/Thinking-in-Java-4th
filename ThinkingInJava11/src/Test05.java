import java.util.*;
public class Test05 {
	public static void main(String args[]){
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("1: "+list);
		Integer i=new Integer(6);
		list.add(i);
		System.out.println("2: "+list);
		System.out.println("3: "+list.contains(i));
		list.remove(i);
		Integer get=list.get(2);
		System.out.println("4: "+get+" "+list.indexOf(get));
		Integer i2=new Integer(7);
		System.out.println("5: "+list.indexOf(i2));
		System.out.println("6: "+list.remove(i2));
		System.out.println("7: "+list.remove(get));
		System.out.println("8: "+list);
		list.add(3,new Integer(1));
		System.out.println("9: "+list);
		List<Integer> sub=list.subList(1, 4);
		System.out.println("subList "+sub);
		System.out.println("10: "+list.containsAll(sub));
		Collections.sort(sub);
		System.out.println("sorted subList: "+sub);
		System.out.println("11: "+list.containsAll(sub));
		Collections.shuffle(sub);
		System.out.println("shuffle subList: "+sub);
		System.out.println("12: "+list.containsAll(sub));
		List<Integer> copy=new ArrayList<>(list);
		sub=Arrays.asList(list.get(1),list.get(4));
		System.out.println("sub: "+sub);
		copy.retainAll(sub);
		System.out.println("13: "+copy);
		copy=new ArrayList<>(list);
		copy.remove(2);
		System.out.println("14: "+copy);
		copy.retainAll(sub);
		System.out.println("15: "+copy);
		copy.set(1, new Integer(i2));
		System.out.println("16: "+copy);
		copy.addAll(2,sub);
		System.out.println("17: "+copy);
		System.out.println("18: "+list.isEmpty());
		list.clear();
		System.out.println("19: "+list);
		System.out.println("20: "+list.isEmpty());
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("21: "+list);
		Object[] o=list.toArray();
		System.out.println("22: "+o[3]);
	}
}
