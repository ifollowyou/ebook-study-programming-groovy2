package org.ifollowyou.tutorial

import console.*;

println "hello, world!"

def a = 10
def b = 15
printf("The sum of %d and %d is %d!\n", [a, b, a+b])

def x = 3.14
def y = 2
printf("%f + %d = %f\n", [x, y, x+y])

def num = 9
printf("[%s]\n", [num])
printf("[%5.5s]\n", [num])
printf("[%-5s]\n", [num])

int five = 5
printf("[%05d]\n", [five])

float n = 5.9
printf("[%05.2f]\n", [n])

def readString() {
    return System.in.readLines();
}

println "please input your name:"
def name = readString();
println name

Console.readLine()