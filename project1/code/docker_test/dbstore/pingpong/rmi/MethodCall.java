/*
    A helper class implemented Serializable
    By Wenjia Ouyang
*/
package rmi;

import java.lang.reflect.Method;
import java.io.Serializable;

public class MethodCall implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 8399043647241046421L;
	protected Class<?>[] types;
    protected Object[] args;
    protected String methodName;

    public MethodCall(Method method, Object[] args) {
        methodName = method.getName();
        this.args = args;
        types = method.getParameterTypes();
    }

}