package cn.keepingthepiggy;

import cn.keepingthepiggy.conf.TestConfig;
import cn.keepingthepiggy.letus.HelloWorld;
import cn.keepingthepiggy.letus.TheName;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wang
 */
@SpringBootApplication
public class PiggyApplication {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TestConfig.class);
////		System.gc();
//		TheName theName = ctx.getBean(TheName.class);
//		theName.getName();
//		System.out.println(theName.getName());

		SpringApplication.run(PiggyApplication.class, args);

//		HelloWorld hw = ctx.getBean(HelloWorld.class);
//		hw.helloWorld();
//		System.out.println(hw.helloWorld());

	}

}
