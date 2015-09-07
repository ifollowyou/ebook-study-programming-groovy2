package org.ifollowyou.tutorial.bean

class Car2 {
    // 初始化赋值，禁止修改
    final year

    //私有变量使用private修饰无效，必须通过setter方法阻止修改
    private miles = 0

    Car2(theYear) { year = theYear }

    def getMiles() {
        println "getMiles called"
        miles
    }

    def void setMiles(miles) {
        throw new IllegalAccessException("you're not allowed to change miles")
    }

    def drive(dist) { if (dist > 0) miles += dist }
}

def car = new Car2(2012)

println "Year: $car.year"
println "Miles: $car.miles"
println 'Driving'
car.drive(10)
println "Miles: $car.miles"

try {
    print 'Can I set the year? '
    car.year = 1900
} catch (groovy.lang.ReadOnlyPropertyException ex) {
    println ex.message
}

try {
    print 'Can I set the miles? '
    car.miles = 12
} catch (IllegalAccessException ex) {
    println ex.message
}
