plugins {
    id("java")
}

group = "com.github.dmitributorchin.algorithms"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.11.1")
}

tasks.test {
    useJUnitPlatform()
}