package core.less14dz;

import core.less14dz.Collection.Iterator1;
import core.less14dz.Collection.Iterator2;

public class Main {

	public static void main(String[] args) {
		Object[] mas = { 1, 2, 2, 3, 5, 5, 6 };
		Collection col = new Collection(mas);
		Iterator1 iter1 = col.new Iterator1();
		Collection col2 = new Collection(mas);
		Iterator2 iter2 = col.new Iterator2();
		iter1.print();
		iter2.print();
	}

	public static Iterator1 print() {
		return new Collection.Iterator1();

	}
}
