plugins {
    id 'java'
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
    testImplementation("org.testng:testng:7.1.0")
    testImplementation("junit:junit:4.13.1")
    testImplementation 'junit:junit:4.13'
    testImplementation 'junit:junit:4.13.1'
}

test {
    useJUnit()
}