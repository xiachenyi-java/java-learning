package com.a8Instanceof;
//instanceof 是 JavaScript 中用于检测对象的原型链的运算符，它判断一个对象是否是某个构造函数的实例
public class InstanceofTest {
    public static void main(String[] args) {
        InstanceofTest instanceofTest = new Instanceof();
        System.out.println(instanceofTest instanceof Instanceof);
    }
}
/*
基本语法
JavaScript
object instanceof Constructor
如果 object 的原型链中存在 Constructor.prototype，返回 true
否则返回 false
 */
/*
//问题 1：InstanceofTest 是类，不是实例
// ❌ 错误：直接用类名
InstanceofTest instanceof Instanceof
instanceof 的左边必须是对象实例，右边必须是构造函数/类。
你写的是类名本身，而不是类的实例。
问题 2：Instanceof 未定义
JavaScript
复制
// ❌ Instanceof 是什么？
InstanceofTest instanceof Instanceof
JavaScript 中没有名为 Instanceof 的内置构造函数。你想检测的可能是：
Object（所有对象都继承自它）
Function（类本身是函数）
或者其他具体的类
 */
/*
class Animal {}
class Dog extends Animal {}

const dog = new Dog();

console.log(dog instanceof Dog);      // true  ← dog 是 Dog 的实例
console.log(dog instanceof Animal);   // true  ← dog 也是 Animal 的实例（继承链）
console.log(dog instanceof Object);  // true  ← 所有对象最终都继承自 Object

console.log(dog instanceof Array);   // false ← dog 不是数组
 */
/*
1. 原始类型返回 false
JavaScript
"hello" instanceof String;  // false（字符串是原始类型）
new String("hi") instanceof String;  // true（包装对象）
 */