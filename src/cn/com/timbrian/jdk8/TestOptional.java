package cn.com.timbrian.jdk8;

import java.util.Optional;

import cn.com.timbrian.jdk8.vo.StudentVo;

public class TestOptional {

	
	public static void main(String[] args) {
		Optional<StudentVo> optional = Optional.empty();
		System.out.println(optional);
		
		StudentVo stuVo = new StudentVo("zhangsan");
		Optional<StudentVo> optional2 = Optional.of(stuVo );
		System.out.println(optional2);
		System.out.println(optional2.get());
		System.out.println(optional2.get().getName());
		
		//判断对象是否存在
		System.out.println(optional2.isPresent());
		System.out.println(optional.isPresent());
		
		optional2.ifPresent(System.out :: println);
		
		//如果Optional为空返回默认值
		System.out.println("如果Optional为空返回默认值:" + optional2.orElse(stuVo));
		
	}
}
