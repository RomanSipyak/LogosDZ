package core.less15dz;

//Домашня робота: Створити клас MyEntry<K,V>.
// Описати в ньому дженеріками –поля, гетери/сетери, toString. Створити клас MyMap<K,V>,
//в якому буде поле Set<MyEntry<K,V>>. Реалізвати в даному класі методи, які б:
//
//* додавали новий об’єкт в мапу
//
//* видаляли об’єкт мапи за ключем(тобто немає ні ключа ні значення)
//
//* видаляли об’єкт мапи за значенням(значенню об’єкта присвоюється нульова спилка, при цьому зберігається ключ)
//
//* виводили на екран Set ключів
//
//* Виводили на екран List значень
//
//* Виводили на екран цілу мапу
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyMap<K, V> {
	private Set<MyEntry<K, V>> set;

	public MyMap() {
		set = new HashSet<>();
	}

	public void put(K key, V value) {
		set.add(new MyEntry<K, V>(key, value));
	}

	public void remove(K key) {
		Iterator<MyEntry<K, V>> iterator = set.iterator();
		while (iterator.hasNext()) {
			MyEntry<K, V> myentry = iterator.next();
			if (myentry.getKey().equals(key)) {
				iterator.remove();
			}
		}
		set.forEach(System.out::println);
		// Set<MyEntry<K, V>> set1 =set;
		// for (MyEntry<K, V> y : set1) {
		// if (y.getKey().equals(key)) {
		// set.remove(y);
		// }
		// }

	}

	public void remuve2(V value) {
		Iterator<MyEntry<K, V>> iterator = set.iterator();
		while (iterator.hasNext()) {
			MyEntry<K, V> myentry = iterator.next();
			if (myentry.getValue().equals(value)) {
				myentry.setValue(null);
			}
		}
		set.forEach(System.out::println);
		// for (MyEntry<K, V> y : set) {
		// if (y.getKey().equals(value)) {
		// y.setValue(null);
		// }
		// }
	}

	public Set<K> printSetKey() {
		Set<K> a = new HashSet<>();
		for (MyEntry<K, V> y : set) {
			a.add(y.getKey());
		}
		System.out.println(a);
		return a;
	}

	public List<V> printListValue() {
		List<V> a = new ArrayList<>();
		for (MyEntry<K, V> y : set) {
			a.add(y.getValue());
		}
		System.out.println(a);
		return a;
	}

	public void print3() {
		for (MyEntry<K, V> y : set) {
			System.out.println(y);
		}
	}
}