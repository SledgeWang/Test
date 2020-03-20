package cn.com.timbrian.jdk8.interfaces;

@FunctionalInterface
public interface Converter<F,T> {
	T convert(F from);
}


