import org.gradle.kotlin.dsl.testImplementation

plugins {
	java
	id("org.springframework.boot") version "4.0.0"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.hoppin"
version = "0.0.1-SNAPSHOT"
description = "HoppIn is a full-featured vacation rental platform backend built with Spring Boot. " +
        "It supports REST and gRPC APIs, asynchronous HTTP calls with WebClient, reactive programming with Mono/Flux, " +
        "and scalable data management using relational and NoSQL databases. Secure booking and listing services are fully implemented."
java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	// Core Dependencies
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.springframework.boot:spring-boot-starter-webmvc")
	runtimeOnly("org.postgresql:postgresql")

	// Lombok Dependencies
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")

	//modelmapper
	implementation("org.modelmapper:modelmapper:3.2.2")

	// Spring Security
	implementation ("org.springframework.boot:spring-boot-starter-security")

	// JWT (JJWT)
	implementation ("io.jsonwebtoken:jjwt-api:0.12.6")
	runtimeOnly ("io.jsonwebtoken:jjwt-impl:0.12.6")
	runtimeOnly ("io.jsonwebtoken:jjwt-jackson:0.12.6")


	// Spring Boot Test
	testImplementation ("org.springframework.boot:spring-boot-starter-test")
	// Test Dependencies
	testImplementation("org.springframework.boot:spring-boot-starter-data-jpa-test")
	testImplementation("org.springframework.boot:spring-boot-starter-validation-test")
	testImplementation("org.springframework.boot:spring-boot-starter-webmvc-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
