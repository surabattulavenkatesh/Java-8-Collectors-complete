package Test;

import java.util.function.Predicate;

public class impPredicates {

	public static void main(String[] args) {

		Predicate<Integer> isEven = i -> i%2 == 0;
		Predicate<Integer> isOdd = i -> i%2 == 1;

		//Or use negate() to reverse the condition
		Predicate<Integer> isOdd1 = isEven.negate();  
		/*
		 * Predicate<Employee> isAdult = e -> e.getAge() > 18; Predicate<Account>
		 * isActive = a -> a.getStatus() == AccountStatus.ACTIVE;
		 * 
		 * Predicate<Employee> isAdultAndActive = isAdult.and(isActive);
		 * Predicate<Employee> isAdultOrActive = isAdult.or(isActive);
		 * Predicate<Employee> isAdultAndInactive = isAdult.and(isActive.negate());
		 */
	}

}
