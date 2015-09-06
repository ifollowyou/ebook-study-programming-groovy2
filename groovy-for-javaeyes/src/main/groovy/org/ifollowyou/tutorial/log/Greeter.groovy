package org.ifollowyou.tutorial.log;

import groovy.util.logging.Slf4j;


@Slf4j
class Greeter {
    void greet() {
        log.debug 'Called greeter';
        println 'Hello, world!';
    }
}
