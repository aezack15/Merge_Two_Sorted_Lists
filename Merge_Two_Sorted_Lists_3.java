//Grind 75 probelm #3
//Merges two sorted linked lists and re-sorts them
import java.util.*;

class Merge_Two_Sorted_Lists_3{
	public static void main(String[] args){
		Merge_Two_Sorted_Lists_3 mtsl = new Merge_Two_Sorted_Lists_3();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter lists in the following format: list1 = [x,y,z], list2 = [x,y,z]");
		String s = in.nextLine();
		LinkedList<Integer> ll = mtsl.makeLL(s);
		System.out.println(ll);
	}
	
	private LinkedList<Integer> makeLL(String s){
		LinkedList<Integer> ll = new LinkedList<Integer>();
		String listA = s.substring(s.indexOf('['), s.indexOf(']'));
		String listB = s.substring(s.lastIndexOf('['), s.lastIndexOf(']'));
		char[] listA1 = listA.toCharArray();
		char[] listB1 = listB.toCharArray();
		
		for(int i=0; i<listA1.length; i++){
			if(listA1[i] != '[' && listA1[i] != ','){
				ll.push(Character.getNumericValue(listA1[i]));
			}
		}
		System.out.println();
		for(int i=0; i<listB1.length; i++){
			if(listB1[i] != '[' && listB1[i] != ','){
				ll.push(Character.getNumericValue(listB1[i]));
			}
		}
		Collections.sort(ll);
		return ll;
	}
}
