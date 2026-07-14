package com.A3Generics3;

import java.util.List;

/**
 * 夏辰义
 * 2026/7/1416:23
 */
//问题：T 可以是任意类型，怎么确保 T 有某些方法？
//解决：给 T 加边界，限制它必须是某类的子类
public class T1 {
    public static double sum(List<? extends Number> list){//上界通配符 ? extends T（协变，只读）
        double total = 0;
        for (Number num : list){ //// 取出来的至少是 Number
            total += num.doubleValue();
        }
        return total;
    }
    //? extends T 的限制——只能读，不能写：
    // 可以传入 Integer 或其父类（Number, Object）
    public static void addIntegers(List<? super Integer> list) {
        // ✅ 可以写 Integer（及其子类）
        list.add(100);
        list.add(200);

        // ❌ 不能写 Double，不是 Integer 的子类
        // list.add(3.14);  // 报错！
    }
    //? super T 的限制——只能写，读出来是 Object：
}
/*
                    Object
                      │
                    Number  ←─── ? super Integer（下界）
                   /  |  \
                Integer Double Float
                  ↑
            ? extends Number（上界）
            场景	写法	能传	能读	能写
上界	List<? extends Number>	List<Integer><Double>	Number	null only
下界	List<? super Integer>	List<Integer><Number><Object>	Object	Integer
无界	List<?>	任意 List	Object	null only
类型参数	<T extends Number>	调用时确定	T	T
 */