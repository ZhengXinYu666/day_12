package cn.test;
/*
*   需求:统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数（不考虑其他字符）
*       距离："Hello123World"
*   结果：
*       大写字符：2个
*       小写字符：8个
*       数字字符：3个
*
*   分析：
*       A、定义三个统计变量
*           bigCount = 0
*           smallCount = 0
*           numberCount = 0
*       B、遍历字符串得到每一个字符
*           length（)和charAt()结合
*       C、判断该字符到底是属于哪一种类型的
*           大：bigCount++
*           小：smallCount++
*           数字：numberCount++
*
*           这道题目的难点就是如何判断某个字符是大的，还是小的，还是数字的
*           ASCLL码表
*               0   48
*               A   65
*               a   97
*           虽然我们按照数字的这种比较是可以的，但是有比这个更简单的
*               因为：
*                      char ch = s.charAt(x);
*                     if (ch>='0' && ch<='9')   numberCount++
*                     if (ch>='a' && ch<='z')   smallCount++
*                     if (ch>='A' && ch<='Z')   bigCount++
*       D、输出结果
* */
public class StringTest3 {
    public static void main(String[] args) {
        String s = "Hello123World";

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for(int x=0;x< s.length();x++){
            char ch = s.charAt(x);

            //判断字符到底属于哪种类型
            if(ch>='0' && ch<='9'){
                numberCount++;
            }else if(ch>='a' && ch<='z'){
                smallCount++;
            }else if(ch>='A' && ch<='Z'){
                bigCount++;
            }
        }
        System.out.println("大写字母"+bigCount+"个");
        System.out.println("小写字母"+smallCount+"个");
        System.out.println("数字"+numberCount+"个");
    }
}
