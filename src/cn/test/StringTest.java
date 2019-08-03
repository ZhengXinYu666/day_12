package cn.test;

/*
* 需求：遍历获取字符串中的每一个字符
*
* 分析：
*       A：如何能够拿到每一个字符呢？
*           char charAt(int index)
*       B：我怎么知道字符串有多少个呢？
*           int length()
*
* */
public class StringTest{
    public static void main(String[] args) {
       String s = "helloworld";

       //只需要从0取到9
//        for(int x=0; x < 10; x++){
//            System.out.println(s.charAt(x));
//        }
        //如果长度特别长，不可能去数，用长度功能
        for (int x= 0; x <s.length();x++){
            //char ch = s.charAt(x);
            //System.out.println(ch);
            //直接输出
            System.out.println(s.charAt(x));
        }
    }
}