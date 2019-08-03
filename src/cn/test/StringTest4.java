package cn.test;
/*
*   需求：把数组中的数据按照指定格式拼接成一个字符串
*       int[] arr = {1,2,3}
*       [1, 2, 3]---拼成的字符串
*
*   分析：
*       1、定义一个字符串对象，只不过内容为空
*       2、先把字符串拼接一个"["
*       3、遍历int数组，得到每一个元素
*       4、判断该元素是否是最后一个
*           是：拼接元素和"]"
*           不是：拼接元素和逗号空格
*       5、输出记过
* */
public class StringTest4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String s = "";

        s += "[";

        for(int x=0;x<arr.length;x++){
            if(x==arr.length-1){
                s += arr[x];
                s += "]";
            }else{
                s += arr[x];
                s += ", ";
            }
        }
        System.out.println(s);
    }
}
