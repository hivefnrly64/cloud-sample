plugins {
    kotlin("jvm")
}
dependencies {
    "implementation" (Config.Libs.eureka_client)
    "implementation" (Config.Libs.starter_netflix_hystrix)
    "implementation" (Config.Libs.starter_openfeign)
    "implementation" (Config.Libs.starter_actuator)
    "implementation" (Config.Libs.starter_web)
    "implementation" (Config.Libs.gson)
    "implementation" (Config.Libs.starter_test)
}
