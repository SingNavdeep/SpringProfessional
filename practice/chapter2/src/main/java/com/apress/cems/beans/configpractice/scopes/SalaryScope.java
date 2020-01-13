package com.apress.cems.beans.configpractice.scopes;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.annotation.AliasFor;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Scope//(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public @interface SalaryScope
{
	@AliasFor(annotation = Scope.class, attribute = "proxyMode")
	ScopedProxyMode proxyMode() default ScopedProxyMode.INTERFACES;
	
	@AliasFor(annotation = Scope.class, attribute = "scopeName")
	String scopeName() default ConfigurableBeanFactory.SCOPE_PROTOTYPE;
}
