package annotaction_tools.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
@Inherited
public @interface MyValidator {

	public int min() default 1;
	
	public int max() default 10;
	
	public boolean isNull() default true;
	
}
