package cn.keepingthepiggy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
