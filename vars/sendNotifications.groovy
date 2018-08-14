#!/usr/bin/env groovy
import org.foo.Bar

/**
 * Send notifications based on build status string
 */
def call(String buildStatus = 'STARTED') {
    println "SendNotification! ${buildStatus}"

    def bar = new Bar()
    println ":> ${bar.sayHello()}"

}