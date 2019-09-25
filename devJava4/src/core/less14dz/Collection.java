package core.less14dz;

public class Collection {
	private Object[] mas;

	public Collection(Object[] mas) {
		this.mas = mas;
	}

	public class Iterator1 implements Iterator {
		public int iter;

		public Iterator1() {
			iter = -1;
		}

		@Override
		public Object next() {
			iter++;
			return mas[iter];
		}

		@Override
		public boolean hasNext() {

			try {
				if (mas[iter + 1] != null && iter != mas.length - 1) {
					return true;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
			}
			return false;

		}

		public void print() {
			while (hasNext()) {
				Object a = next();
				if((int)mas[iter]%2!=0){
					a=0;
				}
				System.out.println(a);
			}
		}

	}
	public class Iterator2 implements Iterator {
		public int iter;

		public Iterator2() {
			iter = mas.length+1;
		}

		@Override
		public Object next() {
			
			iter=iter-2;
			return mas[iter];
		
			
		}

		@Override
		public boolean hasNext() {

			try {
				if (mas[iter - 2] != null && iter != 0) {
					return true;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
		
			}
			return false;

		}

		public void print() {
			while (hasNext()) {
				System.out.println(next());
			}
		}

	}
}
