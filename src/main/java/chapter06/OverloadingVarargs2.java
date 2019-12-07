package chapter06;

/**
 * Project Name:on_java8_example <br/>
 * Package Name:chapter06 <br/>
 * Date:2019/12/7 16:53 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class OverloadingVarargs2 {

    static void f(float i, Character... args) {
        System.out.println("first");
    }
    static void f(Character... args) {
        System.out.print("second");
    }
    public static void main(String[] args) {
        f(1, 'a');
        f('a', 'b');
    }

}
