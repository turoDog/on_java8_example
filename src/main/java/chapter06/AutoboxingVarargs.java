package chapter06;

/**
 * Project Name:on_java8_example <br/>
 * Package Name:chapter06 <br/>
 * Date:2019/12/7 16:51 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class AutoboxingVarargs {

    public static void f(Integer... args) {
        for(Integer i : args)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        f(1, 2);
        f(4, 5, 6, 7, 8, 9);
        f(10, 11, 12);
    }

}
