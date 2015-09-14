package org.ifollowyou.tutorial

// 单引号、双引号、三引号
def age = 35
println 'My age is $age'
println "My age is $age"
println "My age is ${age}"
println """My age is $age"""
println 'My age is \$age'

def greeting = "hello, world!"
println greeting[4]
println greeting[-1]
println greeting[1..-1]
println greeting[1..3]
println greeting[1..<3]
println greeting[4..2]
println greeting[4,1,7]
println greeting.size()
println greeting.length()
println greeting.substring(1)

println "ken" == "ken"
println "ken" > "Ken"

def first = [11, 12, 13, 14, 15]
def last = [18, 19]
println first
println first << 16
println first.leftShift(17)
println first + last
println first.dropRight(1)
println first.dropRight(2)
println first.dropRight(3)
println first.add(15)
println first
println first.pop()
println first
println first.remove(0)
println first

def map1 = [:]
map1.put("1", "first")
map1.put("2", "second")
map1.put("3", "third")
println map1
println map1.keySet()
println map1.values()

def _21century = 1900..1999
println _21century.size()
println _21century
