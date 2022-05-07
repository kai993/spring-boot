# Spring boot tutorial


## Spring initializr

https://start.spring.io/

## タスク一覧

```bash
❯ gradle tasks

> Task :tasks

------------------------------------------------------------
Tasks runnable from root project 'spring-boot-tutorial'
------------------------------------------------------------

Application tasks
-----------------
bootRun - Runs this project as a Spring Boot application.

Build tasks
-----------
assemble - Assembles the outputs of this project.
bootBuildImage - Builds an OCI image of the application using the output of the bootJar task
bootJar - Assembles an executable jar archive containing the main classes and their dependencies.
bootJarMainClassName - Resolves the name of the application's main class for the bootJar task.
bootRunMainClassName - Resolves the name of the application's main class for the bootRun task.
build - Assembles and tests this project.
buildDependents - Assembles and tests this project and all projects that depend on it.
buildNeeded - Assembles and tests this project and all projects it depends on.
classes - Assembles main classes.
clean - Deletes the build directory.
jar - Assembles a jar archive containing the main classes.
testClasses - Assembles test classes.

Build Setup tasks
-----------------
init - Initializes a new Gradle build.
wrapper - Generates Gradle wrapper files.

Documentation tasks
-------------------
javadoc - Generates Javadoc API documentation for the main source code.

Help tasks
----------
buildEnvironment - Displays all buildscript dependencies declared in root project 'spring-boot-tutorial'.
dependencies - Displays all dependencies declared in root project 'spring-boot-tutorial'.
dependencyInsight - Displays the insight into a specific dependency in root project 'spring-boot-tutorial'.
dependencyManagement - Displays the dependency management declared in root project 'spring-boot-tutorial'.
help - Displays a help message.
javaToolchains - Displays the detected java toolchains.
outgoingVariants - Displays the outgoing variants of root project 'spring-boot-tutorial'.
projects - Displays the sub-projects of root project 'spring-boot-tutorial'.
properties - Displays the properties of root project 'spring-boot-tutorial'.
tasks - Displays the tasks runnable from root project 'spring-boot-tutorial'.

Verification tasks
------------------
check - Runs all checks.
test - Runs the test suite.

Rules
-----
Pattern: clean<TaskName>: Cleans the output files of a task.
Pattern: build<ConfigurationName>: Assembles the artifacts of a configuration.

To see all tasks and more detail, run gradle tasks --all

To see more detail about a task, run gradle help --task <task>

BUILD SUCCESSFUL in 811ms
1 actionable task: 1 executed
```

## サーバー起動

gradle

```bash
❯ gradle bootRun
```

jarファイルをビルドして実行する場合

```bash
❯ gradle build

❯ java -jar build/libs/spring-boot-tutorial-0.0.1-SNAPSHOT.jar
```
