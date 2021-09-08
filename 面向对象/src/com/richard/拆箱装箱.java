package com.richard;

/**
 * 装箱就是  自动将基本数据类型转换为包装器类型；拆箱就是  自动将包装器类型转换为基本数据类型。
 *
 * 当 "=="运算符的两个操作数都是 包装器类型的引用，则是比较指向的是否是同一个对象，而如果其中有一个操作数是表达式（即包含算术运算）则比较的是数值（即会触发自动拆箱的过程）。
 * 另外，对于包装器类型，equals方法并不会进行类型转换。
 */
public class 拆箱装箱 {

    public static void main(String[] args) {
        // 在javase5之前   Integer i= new Integer(10);   装箱

        // 装箱  自动调用valueOf
        Integer i = 10;
        // 拆箱 自动调用intvalue
        int n = i;
//
//        Integer i1 = 100;
//        Integer i2 = 100;
//        Integer i3 = 200;
//        Integer i4 = 200;
//
//        //true
//        //false
//        System.out.println(i1==i2);
//        System.out.println(i3==i4);
//

//        //    public static Double valueOf(double d) {
//        //        return new Double(d);
//        //    }
//        // 每次都是一个new
//        Double i1 = 100.0;
//        Double i2 = 100.0;
//        Double i3 = 200.0;
//        Double i4 = 200.0;
//
//        System.out.println(i1==i2);
//        System.out.println(i3==i4);

//
//        // public static final Boolean TRUE = new Boolean(true);
//        //
//        //    /**
//        //     * The <code>Boolean</code> object corresponding to the primitive
//        //     * value <code>false</code>.
//        //     */
//        //    public static final Boolean FALSE = new Boolean(false);
//        Boolean i1 = false;
//        Boolean i2 = false;
//        Boolean i3 = true;
//        Boolean i4 = true;
//
//        System.out.println(i1==i2);
//        System.out.println(i3==i4);
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Long h = 2L;

        System.out.println(c==d); // true
        System.out.println(e==f); // false
        System.out.println(c==(a+b)); // true 自动拆箱
        System.out.println(c.equals(a+b)); // true 先拆后装
        System.out.println(g==(a+b)); // true
        System.out.println(g.equals(a+b)); // false  不会进行类型转换
        System.out.println(g.equals(a+h)); // true

    }
    
}
