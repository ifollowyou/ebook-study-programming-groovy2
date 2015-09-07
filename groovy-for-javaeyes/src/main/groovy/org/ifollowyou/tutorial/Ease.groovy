package org.ifollowyou.tutorial;

def foo(str) {

    // 问号操作相当于非空判断
    // 方法可以没有显式返回，两者等效
    str?.reverse()
    return str?.reverse()
}

println foo('evil')
println foo(null)
