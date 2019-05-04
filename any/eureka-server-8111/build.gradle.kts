plugins {
    kotlin("jvm")
}
dependencies {
    "implementation" (Config.Libs.cloud_eureka_server)
    "implementation" (Config.Libs.gson)
    /**
     * 如果使用jdk11运行
     *jdk11中已经没有javax.xml.bind这个包了，所以我们需要手动添加以下依赖
            Java 7 version: Included and Working
            Java 8 version: Included and Working
            Java 9 version: Deprecated
            Java 10 version: Deprecated
            Java 11 version: Removed
     */
//    "implementation" (Config.Libs.jaxb_core)
//    "implementation" (Config.Libs.jaxb_api)
//    "implementation" (Config.Libs.jaxb_impl)
}
