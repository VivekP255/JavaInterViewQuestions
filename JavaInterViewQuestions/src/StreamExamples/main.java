package StreamExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import javaPrep.string;

public class main {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 2, 2, 22, 1, 40, 57, 45, 684, 245, 6654,
				3654, 68163);

		/*Predicate<Integer> pr = (i) -> (i) % 2 == 0;

		// get even number from List
		// this is direct way of passing impl of predicate in filer()
		List<Integer> collect = list.stream().filter((i) -> i % 2 == 0).collect(Collectors.toList());
		collect.stream().forEach(i -> System.out.println("even-->" + i));
		System.out.println(list);

		// passing predicate obj in filer()
		List<Integer> collect2 = list.stream().filter(pr).collect(Collectors.toList());
		System.out.println("even-->" + collect2);

		// remove duplicate number
		List<Integer> collect3 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect3);

		// sort the list ascending order
		List<Integer> collect4 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(collect4);

		// sort the list descending order
		Collections.reverse(collect4);
		System.out.println(collect4);

		List<Integer> collect5 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect5);

		List<Integer> collect6 = list.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(collect6); */

		// print duplicates element of list
//		List<Integer> listOfDuplicates = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 7, 7, 8, 5, 9, 10, 11, 12, 14, 15, 16, 14);
//		Set<Integer> set = new HashSet<Integer>();
//		// Set.add() returns false if the element was already in the set.
//		listOfDuplicates.stream().filter(i -> !set.add(i)).collect(Collectors.toSet()).forEach(System.out::println);
//
//		// print duplicates element of list other that hashSet
//		Set<Integer> collect7 = listOfDuplicates.stream().filter(i -> Collections.frequency(listOfDuplicates, i) > 1)
//				.collect(Collectors.toSet());
//		System.out.println(collect7);
//
//		// program to count each charecter of string
//		String s = "ilovejavaprogramming";
//		// convert the string to array of string
//		Map<String, Long> collect8 = Arrays.stream(s.split(""))
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(collect8);
//
//		// find duplicates from string
//		List<String> collect9 = Arrays.stream(s.split(""))
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
//				.filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
//
//		System.out.println(collect9);
//		
//		Set<Entry<String, Long>> entrySet = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//				.entrySet();
//		List<Entry<String, Long>> collect = entrySet.stream().filter(i->i.getValue()>1).collect(Collectors.toList());
//		List<Long> collect1 = entrySet.stream().filter(i->i.getValue()>1).map(Map.Entry::getValue).collect(Collectors.toList());
//		System.out.println(entrySet);
//		System.out.println(collect);
//		System.out.println(collect1);
//		
//		//sort hashmap by stream OR Find nth highest salary 
//		Map<String, Integer> map= new HashMap<String, Integer>();
//		map.put("Vivek", 21000);
//		map.put("Vishal", 15000);
//		map.put("Vicky", 34000);
//		map.put("Yogesh", 15000);
//		
//		Entry<String, Integer> collect2 = map.entrySet().stream().
//				sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).
//				collect(Collectors.toList())
//				.get(0); //you can add n to method in order to make it generic
//		System.out.println(collect2);
//
////		Find nth lowest salary 
//		List<Entry<String, Integer>> collect3 = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
//		Entry<String, Integer> collect4 = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()).get(0);
//		System.out.println(collect3);
//		System.out.println(collect4);
//		
//		//grouping by operation on map
//		
//		Map<Integer, List<String>> collect5 = map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue, 
//				Collectors.mapping(Map.Entry::getKey,Collectors.toList())));
//		System.out.println(collect5);
//		
//		//Given Enployee list sort it as per their salary
//		List<Employee> employeeList = new ArrayList<Employee>();
//		employeeList.add(new Employee(1,2000));
//		employeeList.add(new Employee(2,4000));
//		employeeList.add(new Employee(3,1000));
//		employeeList.add(new Employee(4,3500));
//		employeeList.add(new Employee(5,5000));
//		
//		//descending order
//		List<Employee> collect6 = employeeList.stream().sorted((e1,e2) -> e2.salary-e1.salary).collect(Collectors.toList());
//		System.out.println(collect6);
//
//		//ascending order
//		List<Employee> collect16 = employeeList.stream().sorted((e1,e2) -> e1.salary-e2.salary).collect(Collectors.toList());
//		System.out.println(collect16);
//
//		
//		//fetch top 3 salary
//		List<Employee> collect10 = employeeList.stream().sorted((e1,e2) -> e2.salary-e1.salary).limit(3).collect(Collectors.toList());
//		System.out.println(collect10);
//		
//		//fetch employee having salary less than 3rd highest salary
//		List<Employee> collect11 = employeeList.stream().sorted((e1,e2) -> e2.salary-e1.salary).skip(3).collect(Collectors.toList());
//		System.out.println(collect11);
//
//		//find sum of all elements in an array
//		
//		int[] array = {2,3,5,2};
//		int sum = Arrays.stream(array).sum();
//		
//		System.out.println(sum);
//		
//		//smallest number in an array
//		Integer integer = Arrays.asList(5,3,4,1,6,7).stream().min((x,y) ->x.compareTo(y)).get();
//		System.out.println("Smallest element in an array--->"+integer);
//		
//		//largest element in array
//		Integer large = Arrays.asList(5,3,4,1,6,7).stream().min((x,y) ->y.compareTo(x)).get();
//		System.out.println("largest element in an array--->"+large);
		
		
		//reverse a int array which is in the form/type of string
		
//		String[] a = {"3","30","34","5","9"};
//		String s ="";
//		List<String> collect = Arrays.stream(a).map(i->Integer.valueOf(i)).sorted().map(i->String.valueOf(i)).collect(Collectors.toList());
//		
//		for(String i:collect) {
//			s = s+i;
//		}
//		
//		System.out.println(s);
		
		//IntStream - specialized strewam to manipulates the integers value
		
		IntStream.rangeClosed(1, 100).forEach(System.out::println);
		
		Long reduce = LongStream.rangeClosed(1, 100).reduce(1,(a,b)->a+b);
		System.out.println(reduce);
		
		
		//descending by comparator
		List<Integer> collect = list.stream().sorted((o1,o2)->o2-o1).collect(Collectors.toList());
		System.out.println(collect);
		
		//ascending by comparator
		List<Integer> collect1 = list.stream().sorted((o1,o2)->o1-o2).collect(Collectors.toList());
		System.out.println(collect1);
		
		//top 3 salaries
		
		List<Integer> collect3 = list.stream().sorted((o1,o2)->o2-o1).limit(3).collect(Collectors.toList());
		System.out.println(collect3);
		
		//4th salary/number
		Integer collect4 = list.stream().sorted((o1,o2)->o2-o1).skip(3).findFirst().get();
		System.out.println(collect4);
		
		
		
	}
	

	

}
