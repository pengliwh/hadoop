package com.chinacscs.usercenter.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;

import org.springframework.beans.factory.annotation.Autowired;

import com.chinacscs.usercenter.dto.User;
import com.chinacscs.usercenter.service.UserService;

/**
 * @author:MG01867
 * @date:2018年11月5日
 * @email:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Target({ ElementType.FIELD,ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CurrentUserValidation.Checker.class)
@Documented
public @interface CurrentUserValidation {

	String message() default "The current user is illegal";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String value() default "";

	boolean inclusive() default true;

	public class Checker implements ConstraintValidator<CurrentUserValidation, Long> {

		@Autowired
		private UserService userService;

		@Override
		public boolean isValid(Long value, ConstraintValidatorContext context) {
			if(null==value) {
				return false;
			}
			User user = userService.get(value);
			if (null == user) {
				return false;
			}
			return true;
		}
	}
}