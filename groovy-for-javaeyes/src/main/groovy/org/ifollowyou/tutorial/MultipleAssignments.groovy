package org.ifollowyou.tutorial

println "====多次赋值：开始"

// 参数类型可不指定具体类型
def splitName(String fullName) { fullName.split(' ') }
// 将函数输出赋值给新的对象
def (firstName, lastName) = splitName('James Bond')

println "$lastName, $firstName $lastName"
println "====多次赋值：结束"

println splitName('James Bond').getClass()

println "====数据交换：开始"
def name1 = "Thomson"
def name2 = "Thompson"

println "$name1 and $name2"
(name1, name2) = [name2, name1]
println "$name1 and $name2"
println "====数据交换：结束"

println "====参数过剩：开始"
def (String cat, String mouse) = ['Tom', 'Jerry', 'Spike', 'Tyke']
println "$cat and $mouse"
println "====参数过剩：结束"

println "====参数不足：开始"
def (first, second, third) = ['Tom', 'Jerry']
println "$first, $second, and $third"
println "====参数不足：结束"

third = 'Tyke'
(first, second, third) = ['Tom', 'Jerry']
println "$first, $second, and $third"

try {
    // 原始类型转换错误
    def (int one, int two) = [1]
} catch (ex) {
    println ex.getClass()
}
