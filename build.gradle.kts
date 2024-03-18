plugins {
    id'java'
}

sourceCompatibility = 11
compileJava.options.encoding = "UTF-8"
compileTestJava.options.encoding = "UTF-8"

group 'ru.netology'
version '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.13.1")
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.6.1'
    testImplementation 'org.junit.jupiter:junit-jupiter:5.8.1'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.6.1'

    testImplementation 'junit:junit:4.13'
    testRuntimeOnly 'org.junit.vintage:junit-vintage-engine:5.6.2'
}

test {
    useJUnitPlatform()
}