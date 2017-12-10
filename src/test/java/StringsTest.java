import java.util.function.Consumer;
import java.util.function.Function;

import org.junit.Assert;
import org.junit.Test;

public class StringsTest {

	final static Function<String,Consumer<String>> stringAssertionEffect = e -> a -> Assert.assertEquals(e,a);

	@Test
	public void upper_happy_chars(){
		stringAssertionEffect.apply("ABC").accept(Strings.upper.apply("abc"));
	}

	@Test
	public void trim_happy_chars(){
		stringAssertionEffect.apply("ABC").accept(Strings.trim.apply("   ABC "));
	}

	@Test
	public void bracketed_happy_chars(){
		stringAssertionEffect.apply("(ABC)").accept(Strings.bracketed.apply("ABC"));
	}

	@Test
	public void trim_upper_happy_chars(){
		stringAssertionEffect.apply("ABC").accept(Strings.trim.andThen(Strings.upper).apply(" abc "));
	}

}
