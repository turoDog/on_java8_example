package chapter06;

/**
 * Project Name:on_java8_example <br/>
 * Package Name:chapter06 <br/>
 * Date:2019/12/7 16:00 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class VarargType {

    static void f(Character... args) {
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }
    static void g(int... args) {
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }
    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " +
                new int[0].getClass());
    }

}
