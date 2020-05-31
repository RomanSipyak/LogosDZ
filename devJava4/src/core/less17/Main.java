package core.less17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;

import core.less14.Person;

public class Main {
	static Person p = new Person("ivan", 18);

	public static void main(String[] args) {
		// print(new Filter() {//анонімна реалізація інтерфейса
		// @Override
		// public boolean test(int i) {
		// return true;
		// }
		// });
		print((int i) -> true);
		// print(new Filter() {//анонімна реалізація інтерфейса
		//
		// @Override
		// public boolean test(int i) {
		// return i%2==0;
		// }
		// });
		print((i) -> i % 2 == 0);
		print(Main::test);
		pritSomeFromPerson(Person::getName);
		pritSomeFromPerson(Person::getAge);
		List<Person> list = new ArrayList<>();
		// list.stream()
		// .map(Person::getPets)
		// .filter(l->l!=0)
		// .filter(l->l.size()>=3)
		// .flatMap(List::stream)
		// .map(Person.Pet::getName)
		// .unordered()
		// .distinct()
		// .filter(s->s.length()>=10)
		// .flatMapToInt(String::chars)
		// .reduce(0,(acc,elem)->acc+elem);
	}

	static <R> void pritSomeFromPerson(Function<Person, R> function) {
		System.out.println(function.apply(p));
	}

	static boolean test(int i) {
		return i % 3 == 0;
	}

	// print(new Filter() {//анонімна реалізація інтерфейса
	//
	// @Override
	// public boolean test(int i) {
	// return i%3==0;
	// }
	// });
	// }

	static void print(/* Filter */IntPredicate filter) {
		for (int i = 1; i <= 10; i++) {
			if (filter.test(i))
				System.out.println(i);
		}
		System.out.println();
	}

	// static void print1() {
	// for (int i = 1; i <= 10; i++) {
	// if (i % 2 == 0)
	// System.out.println(i);
	// }
	// System.out.println();
	// }
	//
	// static void print2() {
	// for (int i = 1; i <= 10; i++) {
	// if (i % 3 == 0)
	// System.out.println(i);
	// }
	// System.out.println();
	// }
	class AA implements IntPredicate {

		@Override
		public boolean test(int value) {

			return Main.test(value);
		}

	}
}
