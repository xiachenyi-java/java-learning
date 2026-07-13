package com.a1Use;//包， 必须是源文件的第一行（除注释外）

import com.a2liaoyuqi.attribute;//一般引入需要的包就行，最好不要全部*

public class test {
    public static void main(String[] args) {
        attribute attributeL = new attribute();
        System.out.println(attributeL);//com.a2liaoyuqi.attribute@b4c966a

        com.a3xiachenyi.attribute attributeX = new com.a3xiachenyi.attribute();
        System.out.println(attributeX);//com.a3xiachenyi.attribute@4e50df2e
    }
}
// test 测试
/*
什么是包？
包是 Java 中用于组织类的命名空间机制，类似于文件夹的概念。它解决了以下问题：
命名冲突：不同包中可以有同名的类
访问控制：配合访问修饰符实现封装
代码组织：按功能模块分类管理
形式	示例	说明
单类导入	import java.util.List;	导入指定类（推荐）
静态导入	import static java.lang.Math.PI;	导入静态成员
通配符导入	import java.util.*;	导入包下所有类
要点	说明
包的作用	组织类、避免命名冲突、控制访问权限
package 语句	必须是文件第一行，一个文件只能有一个
import 位置	package 之后，类定义之前
静态导入	import static 用于导入类的静态成员
通配符 *	只导入当前包下的类，不导入子包
 */