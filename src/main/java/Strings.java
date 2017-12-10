import java.util.function.Consumer;
import java.util.function.Function;
import java.util.logging.Logger;

public class Strings {
	private Strings(){}
	static final  Function<String,String> upper = value -> value.toUpperCase();
	static final  Function<String,String> trim = value -> value.trim();
	static final  Consumer<String> out = v -> Logger.getGlobal().info(v);
	static final  StringFunction bracketed = value -> "(".concat(value).concat(")");
}

interface StringFunction {
	String apply(String value);
}

