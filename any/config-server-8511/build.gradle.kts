plugins {
    kotlin("jvm")
}
dependencies {
    "implementation" (Config.Libs.config_server)
    "implementation" (Config.Libs.starter_web)
    "implementation" (Config.Libs.gson)
//    "implementation" (Config.Libs.starter_bus_amqp)
//    "implementation" (Config.Libs.starter_stream_rabbit)
//    "implementation" (Config.Libs.starter_test)
//    "implementation" (Config.Libs.starter_actuator)
//    "implementation" (Config.Libs.spring_cloud_bus)
}
