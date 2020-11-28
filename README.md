# Java-experiment-5
# 北石化 实验五
### 计G202 2020322090 王瑞峰
## 1.实验目的
1. 掌握字符串String及其方法的使用
2. 掌握文件的读取/写入方法
3. 掌握异常处理结构

## 2.实验内容
### 业务要求：在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。
文件A包括两部分内容：
1. 一是学生的基本信息；
2. 二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作。

## 3.实验要求
 1. 每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
 2. 允许提供输入参数，统计古诗中某个字或词出现的次数
 3. 输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
 4. 考虑操作中可能出现的异常，在程序中设计异常处理程序
## 4. 实验设计
1. 
```
public static void main(String[] args) throws IOException {
        student str1 = new student("BVLGARI",25,2020322090);
        try (FileReader reader = new FileReader("noComma.txt");
             FileWriter writer = new FileWriter("gushi.txt");){
            StringBuffer sb = new StringBuffer();
            char[] cs = new char[14];
            StringBuffer str=new StringBuffer();
```

## 5. 实验运行结果
```
student{name='BVLGARI', age=25, id=2020322090}/n汉皇重色思倾国, 御宇多年求不得。 
杨家有女初长成, 养在深闺人未识。 
天生丽质难自弃, 一朝选在君王侧。 
回眸一笑百媚生, 六宫粉黛无颜色。 
春寒赐浴华清池, 温泉水滑洗凝脂。 
侍儿扶起娇无力, 始是新承恩泽时。 
云鬓花颜金步摇, 芙蓉帐暖度春宵。 
春宵苦短日高起, 从此君王不早朝。 
承欢侍宴无闲暇, 春从春游夜专夜。 
后宫佳丽三千人, 三千宠爱在一身。 
金屋妆成娇侍夜, 玉楼宴罢醉和春。 
```
## 6. 实验感想
1. 学会了Java异常处理
2. 经过了一个学期的试验，彻底学会了Github。
3. 老师辛苦了
