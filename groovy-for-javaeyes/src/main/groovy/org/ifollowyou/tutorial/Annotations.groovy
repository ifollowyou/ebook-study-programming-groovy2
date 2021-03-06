package org.ifollowyou.tutorial

println "//" + "START:CANONICAL_OUTPUT"

import groovy.transform.Canonical
import groovy.transform.Immutable

// @EqualsAndHashCode, @ToString and @TupleConstructor
@Canonical(excludes = "lastName, age")
class Person {
    String firstName
    String lastName
    int age
}

def sara = new Person(firstName: "Sara", lastName: "Walker", age: 49)
println sara
println "//" + "END:CANONICAL_OUTPUT"

println "//" + "START:DELEGATE_OUTPUT"

class Worker {
    def work() { println 'get work done' }

    def analyze() { println 'analyze...' }

    def writeReport() { println 'get report written' }
}

class Expert {
    def analyze() { println "expert analysis..." }
}

class Manager {
    @Delegate
    Worker worker = new Worker()

    @Delegate
    Expert expert = new Expert()
}

def bernie = new Manager()
bernie.analyze()
bernie.work()
bernie.writeReport()
println "//" + "END:DELEGATE_OUTPUT"

println "//" + "START:IMMUTABLE_OUTPUT"

@Immutable
class CreditCard {
    String cardNumber
    int creditLimit
}

println new CreditCard("4000-1111-2222-3333", 1000)
println "//" + "END:IMMUTABLE_OUTPUT"

println "//" + "START:LAZY_OUTPUT"

class Heavy {
    def size = 10

    Heavy() { println "Creating Heavy with $size" }
}

class AsNeeded {
    def value

    @Lazy
    Heavy heavy1 = new Heavy()
    @Lazy
    Heavy heavy2 = { new Heavy(size: value) }()

    AsNeeded() { println "Created AsNeeded" }
}

def asNeeded = new AsNeeded(value: 1000)
println asNeeded.heavy1.size
println asNeeded.heavy1.size
println asNeeded.heavy2.size
println "//" + "END:LAZY_OUTPUT"

println "//" + "START:NEWIFY_OUTPUT"

@Newify([Person, CreditCard])
def fluentCreate() {
    println Person.new(firstName: "John", lastName: "Doe", age: 20)
    println Person(firstName: "John", lastName: "Doe", age: 20)
    println CreditCard("1234-5678-1234-5678", 2000)
}

fluentCreate()
println "//" + "END:NEWIFY_OUTPUT"

println "//" + "START:SINGLETON_OUTPUT"

@Singleton(lazy = true)
class TheUnique {
//  private TheUnique() { println 'Instance created' }

    def hello() { println 'hello' }
}

println "Accessing TheUnique"
TheUnique.instance.hello()
TheUnique.instance.hello()
println "//" + "END:SINGLETON_OUTPUT"
