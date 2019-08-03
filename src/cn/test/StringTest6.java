package cn.test;

/*
*   统计大串中小串出现的次数
*
*   举例：
*       "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"
*   结果："java"出现了5次
*
*   思路：
*       A、定义一个统计变量，初始化为0
*       B、先获取一次“java”在这个大串中第一次出现的索引————indexOf
*           如果索引值返回-1，说明不存在，返回统计变量
*           如果索引值不是-1.说明存在，统计变量++
*       C、把刚才的索引+小串的长度的长度作为起始位置截取原始大串，得到一个新的字符串，并把该字符串重新赋值给大串
*       D、回到B即可
* */

public class StringTest6 {
    public static void main(String[] args) {
        //定义大串
        String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        //定义小串
        String minString = "java";
        //功能实现
        int count = getCount(maxString,minString);
        System.out.println("java出现了"+count+"次");
    }

    public static int getCount(String maxString,String minString){
        //定义一个统计变量，初始化为0
        int count = 0;

//        //先在大串中查找一次小串第一次出现的位置
//        int index = maxString.indexOf(minString);
//
//        //索引不是-1,说明存在，count++
//        while(index != -1){
//            count++;
//            //把刚才的索引+小串的长度作为开始位置截取上一次的大串，返回一个新的字符串，并把该字符串的值重新赋值给大串
////            int startIndex = index + minString.length();
////            maxString = maxString.substring(startIndex);
//            maxString = maxString.substring(index+minString.length());
//            //继续查
//            index = maxString.indexOf(minString);
//        }
        int index;
        while((index = maxString.indexOf(minString)) != -1){
            count ++;
            maxString = maxString.substring(index+minString.length());
        }
        return count;
    }

}
