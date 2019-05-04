plugins {
    kotlin("jvm")
}
dependencies {
    "implementation" (Config.Libs.eureka_client)
    "implementation" (Config.Libs.starter_ribbon)
    "implementation" (Config.Libs.starter_actuator)
    "implementation" (Config.Libs.starter_web)
    "implementation" (Config.Libs.gson)
    "implementation" (Config.Libs.starter_test)
}
