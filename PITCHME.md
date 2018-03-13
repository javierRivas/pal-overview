@title[Introduction]
# Platform acceleration labs

<span style="font-size:0.6em">Experience best practices for re-platforming and modernizing apps in a hands-on setting.</span>
<span style="font-size:0.6em">Best practices on building and deploying software according to todays cloud standards.</span>
<span style="font-size:0.6em">Understanding the relevant concepts in the cloud world.</span>

---
@title[tools]
### Recommended tools to build software in the Java ecosystem

- Version Control: git
- Build system: Gradle
- Language flavour: Kotlin

@fa[arrow-down]
+++

# Gradle

Gradle is a build and dependency management system.

- Easy to understand
+++?code=src/build.gradle&lang=groovy$title=build.gradle
@[1,1] (Build Java)
@[3-9] (Build jar)
@[11-13] (Repository central)
@[15-17] (Dependencies)

+++

# Gradle
- Programable / Extensible

@fa[arrow-down]
+++

# Gradle
- Fast
![mvn-gradle](images/mvn-vs-gradle.png)

@fa[arrow-down]

+++

# Kotlin

- "New" language developed by JetBrains.
- Source files compile to Java.
- Perfect integration with Java project.

@fa[arrow-down]
+++?code=src/java/Order.java&lang=java&title=Order class
@fa[arrow-down]
+++?code=src/kotlin/Order.kt&lang=kotlin&title=Order class

---

# Development

[12 Factor application](https://www.12factor.net): Set of suggestions for a piece of software intended to work as Saas.
</br>
Well documented, based on experience.

@fa[arrow-down]

+++
# Development

The Java Framework of choice is Spring Boot.
 - Autoconfiguration
+++?code=src/java/SampleApplication.java&lang=java&title=Application Class
@[3] Spring Application annotation

+++?code=src/java/controller/SampleController.java
@[3,12,17] (Controller annotations)

+++
# Development

Database "migrations" using [Flyway](https://www.flyway.com)

+++?code=src/database/V1__create_table_sample.sql&lang=sql&title=Migrations file.

Run the migrations file
```
flyway -url="jdbc:mysql://localhost:3306/my_database" -locations=filesystem:databases/migrations clean migrate
```
---
# Architecture

[Appcontinuum](http://www.appcontinuum.io) Explains how to address the separation in multiple components in an iterative way.

+++![Image-Absolute](images/packages-current.png)

- Hard to read
- Hard to mantain
- Hard to scale
- Unclear domain
- Potential Circular dependencies


+++![Image-Absolute](images/packages-refactored.png)</span>
- Clear naming
- Clear domain
- Easy to scale
- Easy to introduce new people
