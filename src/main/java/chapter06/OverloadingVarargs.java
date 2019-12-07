package chapter06;

/**
 * Project Name:on_java8_example <br/>
 * Package Name:chapter06 <br/>
 * Date:2019/12/7 16:52 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class OverloadingVarargs {

    static void f(Character... args) {
        System.out.print("first");
        for(Character c : args)
            System.out.print(" " + c);
        System.out.println();
    }
    static void f(Integer... args) {
        System.out.print("second");
        for(Integer i : args)
            System.out.print(" " + i);
        System.out.println();
    }
    static void f(Long... args) {
        System.out.println("third");
    }
    public static void main(String[] args) {
        f('a', 'b', 'c');
        f(1);
        f(2, 1);
        f(0);
        f(0L);
        //- f(); // Won't compile -- ambiguous
    }

}
