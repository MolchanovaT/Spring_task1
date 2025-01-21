import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHelloworld =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCat1 =
                applicationContext.getBean(Cat.class);
        Cat beanCat2 =
                applicationContext.getBean(Cat.class);

        System.out.println("Helloworld beans are the same " + (bean == beanHelloworld));
        System.out.println("Cat's beans are the same " + (beanCat1 == beanCat2));
    }
}