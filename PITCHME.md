@title[Introduction]
# Platform acceleration labs

- <span style="font-size:0.6em>Experience best practices for re-platforming and modernizing apps in a hands-on setting.</span>
- <span style="font-size:0.6em>Best practices on building and deploying software according to todays cloud standards.</span>
  - <span style="font-size:0.6em>Understanding the relevant concepts in the cloud world.</span>

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

@fa[arrow-down]
+++

# Gradle
- Programable / Extensible

@fa[arrow-down]
+++

# Gradle
- Fast
![Image-Absolute](images/mvn-vs-gradle.png)

@fa[arrow-down]

+++

# Kotlin

- New language developed by JetBrains
- Source files compile to Java
- Perfect integration with Java project

@fa[arrow-down]
+++?code=src/java/Order.java&lang=java&title=Order class
@fa[arrow-down]
+++?code=src/kotlin/Order.kt&lang=kotlin&title=Order class
