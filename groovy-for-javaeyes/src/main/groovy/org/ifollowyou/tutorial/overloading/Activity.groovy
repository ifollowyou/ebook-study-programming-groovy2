package org.ifollowyou.tutorial.overloading

/**
 * 枚举类型方法重载
 */
enum WeekendActivity {

    SATURDAY{
        String activity() { 'Play' }
    },

    SUNDAY;

    String activity() { 'Relax' }
}

for (day in WeekendActivity.values()) {
    println "$day - ${day.activity()}"
}
