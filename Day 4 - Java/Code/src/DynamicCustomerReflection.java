import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DynamicCustomerReflection {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// Load Customer class
		Class cc = Class.forName("Customer");

		// Get constructor which does not take any arguments;
		Constructor dc = cc.getConstructor(null);
		System.out.println(dc);

		// Create an object using the constructor
		Object oc = dc.newInstance();
		System.out.println(oc);

		// Get the display method
		Method display = cc.getDeclaredMethod("display", null);
		System.out.println(display);

		// Invoke the display method
		display.invoke(oc, null);

		// Get constructor which takes the following parameter
		Class[] params = { String.class, double.class };
		Constructor dcp = cc.getConstructor(params);
		System.out.println(dcp);

		// Create an object using the constructor and pass the parameter values
		Object[] paramValues = { new String("Jestin"), new Double(500) };
		Object ocp = dcp.newInstance(paramValues);
		System.out.println(ocp);

		// Get the display method
		Method displayp = cc.getDeclaredMethod("display", null);
		System.out.println(displayp);

		// Invoke the display method
		displayp.invoke(ocp, null);
	}

}
