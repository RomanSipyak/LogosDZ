package core.less18dz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import ClassFor18dz.Reflection;

public class Main {

	public static void main(String[] args) throws ReflectiveOperationException {
		Class<?> reflectionClass = Class.forName("ClassFor18dz.Reflection");
		Field[] fields = reflectionClass.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName() + " " + field.getType());
		}
		Object reflection = new Reflection("Dzeshka", 2, false);
		Field nameField = reflectionClass.getDeclaredField("name");
		Field countField = reflectionClass.getDeclaredField("count");
		Field zamahaloField = reflectionClass.getDeclaredField("zamahalo");
		nameField.setAccessible(true);
		countField.setAccessible(true);
		zamahaloField.setAccessible(true);
		Object name = nameField.get(reflection);
		Object count = countField.get(reflection);
		Object zamahalo = zamahaloField.get(reflection);
		System.out.println(name + " " + count + " " + zamahalo);
		// //////////////////////////////////////////////////////////////////////
		Object reflection2 = reflectionClass.newInstance();
		nameField.set(reflection2, name);
		countField.set(reflection2, count);
		zamahaloField.set(reflection2, zamahalo);
		System.out.println(reflection2);
		// ///////////////////////////////////////////////////////////////////////
		Method getName = reflectionClass.getMethod("getName");
		Method getCount = reflectionClass.getMethod("getCount");
		Method isZamahalo = reflectionClass.getMethod("isZamahalo");
		Method setName = reflectionClass.getMethod("setName",String.class);
		Method setCount = reflectionClass.getMethod("setCount",int.class);
		Method setZamahalo = reflectionClass.getMethod("setZamahalo",boolean.class);
		
		Object name2 = getName.invoke(reflection2);
		Object count2 = getCount.invoke(reflection2);
		Object zamahalo2 = isZamahalo.invoke(reflection2);
		System.out.println(name2+" "+count2+" "+zamahalo2);
		Object reflection3 = reflectionClass.newInstance();
		
		setCount.invoke(reflection3,count2);
		setName.invoke(reflection3, name2);
		setZamahalo.invoke(reflection3,zamahalo2);
		System.out.println(reflection3);
	}
}