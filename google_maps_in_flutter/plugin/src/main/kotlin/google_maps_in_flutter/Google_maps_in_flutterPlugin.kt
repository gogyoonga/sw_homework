/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package google_maps_in_flutter

import org.gradle.api.Project
import org.gradle.api.Plugin

/**
 * A simple 'hello world' plugin.
 */
class Google_maps_in_flutterPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        // Register a task
        project.tasks.register("greeting") { task ->
            task.doLast {
                println("Hello from plugin 'google_maps_in_flutter.greeting'")
            }
        }
    }
}
