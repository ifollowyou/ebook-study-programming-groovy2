package org.ifollowyou.tutorial.parameter

class Robot {
    def type, height, width

    // 加入Map类型可以避免参数传递时误解
    def access(Map location, weight, fragile) {
        println "Received fragile? $fragile, weight: $weight, loc: $location"
    }
}

robot = new Robot(type: 'arm', width: 10, height: 40)
println "$robot.type, $robot.height, $robot.width"

robot.access(x: 30, y: 20, z: 10, 50, true)
// Map参数的位置是可任意的
robot.access(50, x: 30, y: 20, z: 10, true)