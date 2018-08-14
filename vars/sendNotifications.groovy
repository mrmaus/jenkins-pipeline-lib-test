#!/usr/bin/env groovy
import org.foo.Bar

/**
 * Send notifications based on build status string
 */
def call(Map config) {
    node {
        println "SendNotification! ${config.buildStatus}"

        def bar = new Bar()
        println ":> ${bar.sayHello()}"

        println "Additional message ${config.message}"
    }
}