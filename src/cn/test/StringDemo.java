package cn.test;
/*
*   需要求：把一个字符串的首字母转成大写，其余转为小写（只考虑吧英文大小写字母字符）
*   例子：helloWORLD       Helloworld
*   分析：
*       A、先获取第一个字符
*       B、获取除了第一个字符以外的字符
*       C、把A转成大写
*       D、把B转成大写
*       E：C拼接D
* */
public class StringDemo {
    public static void main(String[] args) {
        String s = "helloWORLD";

//        //获取第一个字符
//        String s1 = s.substring(0,1);
//        //获取其他
//        String s2 = s.substring(1);
//
//        //转换大小写
//        String s3 = s1.toUpperCase();
//        String s4 = s2.toLowerCase();
//
//        //拼接
//        String s5 = s3.concat(s4);
//        System.out.println(s5);
        //优化后
        String result = s.substring(0,1).toUpperCase()
                .concat(s.substring(1).toLowerCase());
        System.out.println(result);
    }
}
