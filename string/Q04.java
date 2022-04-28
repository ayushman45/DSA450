package string;

public class Q04 {

	// why strings are immutable in java ?
	/*
	 * The String pool cannot be possible if String is not immutable in Java. A lot
	 * of heap space is saved by JRE. The same string variable can be referred to by
	 * more than one string variable in the pool. String interning can also not be
	 * possible if the String would not be immutable. The String is safe for
	 * multithreading because of its immutableness. Different threads can access a
	 * single “String instance”. Almost every method, applied to a String object in
	 * order to modify it, creates a new String object. So, where do these String
	 * objects go? Well, these exist in memory, and one of the key goals of any
	 * programming language is to make efficient use of memory.
	 * 
	 * As applications grow, it’s very common for String literals to occupy a large
	 * area of memory, which can even cause redundancy. So, in order to make Java
	 * more efficient, the JVM sets aside a special area of memory called the
	 * “String constant pool”. String Class is also made final so that no one
	 * overrides the behaviour of its methods.
	 */
}
