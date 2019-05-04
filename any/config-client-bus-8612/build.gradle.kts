plugins {
    kotlin("jvm")
}
dependencies {
    "implementation" (Config.Libs.starter_config)
    "implementation" (Config.Libs.starter_web)
    "implementation" (Config.Libs.eureka_client)
    "implementation" (Config.Libs.starter_bus_amqp)
    "implementation" (Config.Libs.starter_test)
    "implementation" (Config.Libs.starter_actuator)
    "implementation" (Config.Libs.gson)
}
