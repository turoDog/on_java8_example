package chapter06;

/**
 * Project Name:on_java8_example <br/>
 * Package Name:chapter06 <br/>
 * Date:2019/12/7 15:53 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */

class A {}

public class VarArgs {

    static void printArray(Object[] args) {
        for(Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        printArray(new Object[]{
                47, (float) 3.14, 11.11});
        printArray(new Object[]{"one", "two", "three" });
        printArray(new Object[]{new A(), new A(), new A()});
    }

}
