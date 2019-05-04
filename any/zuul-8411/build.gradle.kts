plugins {
    kotlin("jvm")
}
dependencies {
    "implementation" (Config.Libs.eureka_client)
    "implementation" (Config.Libs.starter_netflix_zuul)
    "implementation" (Config.Libs.starter_actuator)
    "implementation" (Config.Libs.starter_web)
    "implementation" (Config.Libs.gson)
}
