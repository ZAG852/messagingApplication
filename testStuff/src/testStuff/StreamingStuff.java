package testStuff;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamingStuff {
	public static void main(String[] args) {
	IntStream
	.range(1, 10)
	.skip(5)
	.forEach(x -> System.out.println(x));
	Stream.of("Ava", "Aneri", "Alberto","Bernard", "Baxton")
	.sorted()
	.findFirst()
	.ifPresent(x -> System.out.println(x));
	
	String[] name = {"Ava", "Aneri", "Alberto","Bernard", "Baxton"};
	Arrays.stream(name)
	.filter(x->x.startsWith("B"))
	.sorted()
	.forEach(x->System.out.println(x));
	
	String bb = "TheStringy";
	char[] arr = bb.toCharArray();

	//Arrays.stream(arr);
	}
}
