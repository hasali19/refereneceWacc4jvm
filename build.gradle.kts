plugins {
  kotlin("jvm") version "1.3.61"
  `maven-publish`
}

group = "org.cottand"
version = "1.0"

repositories {
  jcenter()
}

val fuelVer = "2.2.1"
dependencies {
  implementation(kotlin("stdlib-jdk8"))

  // Simple HTTP client, Fuel
  implementation("com.github.kittinunf.fuel:fuel:$fuelVer")
  implementation("com.github.kittinunf.fuel:fuel-gson:$fuelVer")

  // JSON serialisation library, Gson
  implementation("com.google.code.gson:gson:2.8.5")
}

publishing {
  publications {
    create<MavenPublication>("referenceWacc4jvm") {
      from(components["kotlin"])
    }
  }
}
