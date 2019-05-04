/**
 * 项目配置管理
 * @author : chata
 */
object Config{
    /**
     * 项目信息
     */
    object Project{
        const val group:String="com.geekgee"
        const val version:String="0.1-BETA"
        const val repositories_url:String="http://maven.aliyun.com/nexus/content/groups/public/"
    }
    /**
     * 插件
     */
    object Plugins{
        const val dependency_management:String="io.spring.dependency-management"
    }
    /**
     * 版本号
     */
    object Versions{
        const val springboot:String="2.1.4.RELEASE"
        const val springcloud:String="Greenwich.RELEASE"
        const val kt_jvm_plugin:String="1.3.30"
        const val kt_stdlib:String="stdlib-jdk8"
        const val kt_jvm_target:String="1.8"
        const val dependency_management:String="1.0.7.RELEASE"
        const val jaxb_core:String="2.3.0.1"
        const val jaxb_api:String="2.3.1"
        const val jaxb_impl:String="2.3.2"
        const val gson:String="2.8.2"
        const val ribbon_eureka:String="2.3.0"
    }
    /**
     * 命名空间
     */
    object NameSpace{
        const val springboot_prefix:String="org.springframework.boot"
        const val springcloud_prefix:String="org.springframework.cloud"
        const val com_netflix_ribbon_prefix:String="com.netflix.ribbon"
        const val ribbon_eureka:String="ribbon-eureka"
        const val starter_test:String="spring-boot-starter-test"
        const val starter_web:String="spring-boot-starter-web"
        const val starter_actuator:String="spring-boot-starter-actuator"
        const val cloud_dependencies:String="spring-cloud-dependencies"
        const val eureka_server:String="spring-cloud-starter-netflix-eureka-server"
        const val com_sun_xml_bind_prefix:String="com.sun.xml.bind"
        const val javax_xml_bind_prefix:String="javax.xml.bind"
        const val jaxb_core:String="jaxb-core"
        const val jaxb_api:String="jaxb-api"
        const val jaxb_impl:String="jaxb-impl"
        const val com_google_code_gson_prefix:String="com.google.code.gson"
        const val gson:String="gson"
        const val eureka_client:String="spring-cloud-starter-netflix-eureka-client"
        const val starter_ribbon:String="spring-cloud-starter-netflix-ribbon"
        const val starter_openfeign:String="spring-cloud-starter-openfeign"
        const val starter_netflix_hystrix:String="spring-cloud-starter-netflix-hystrix"
        const val starter_netflix_zuul:String="spring-cloud-starter-netflix-zuul"
        const val config_server:String="spring-cloud-config-server"
        const val starter_config:String="spring-cloud-starter-config"
        const val starter_bus_amqp:String="spring-cloud-starter-bus-amqp"
        const val starter_stream_rabbit:String="spring-cloud-starter-stream-rabbit"
        const val spring_cloud_bus:String="spring-cloud-bus"
    }
    /**
     * 依赖库
     */
    object Libs{
        const val starter_test:String="${NameSpace.springboot_prefix}:${NameSpace.starter_test}:${Versions.springboot}"
        const val starter_web:String="${NameSpace.springboot_prefix}:${NameSpace.starter_web}:${Versions.springboot}"
        const val starter_actuator:String="${NameSpace.springboot_prefix}:${NameSpace.starter_actuator}:${Versions.springboot}"
        const val cloud_dependencies:String="${NameSpace.springcloud_prefix}:${NameSpace.cloud_dependencies}:${Versions.springcloud}"
        const val cloud_eureka_server:String="${NameSpace.springcloud_prefix}:${NameSpace.eureka_server}"
        const val starter_ribbon:String="${NameSpace.springcloud_prefix}:${NameSpace.starter_ribbon}"
        const val starter_openfeign:String="${NameSpace.springcloud_prefix}:${NameSpace.starter_openfeign}"
        const val starter_netflix_hystrix:String="${NameSpace.springcloud_prefix}:${NameSpace.starter_netflix_hystrix}"
        const val eureka_client:String="${NameSpace.springcloud_prefix}:${NameSpace.eureka_client}"
        const val starter_netflix_zuul:String="${NameSpace.springcloud_prefix}:${NameSpace.starter_netflix_zuul}"
        const val config_server:String="${NameSpace.springcloud_prefix}:${NameSpace.config_server}"
        const val starter_config:String="${NameSpace.springcloud_prefix}:${NameSpace.starter_config}"
        const val starter_bus_amqp:String="${NameSpace.springcloud_prefix}:${NameSpace.starter_bus_amqp}"
        const val starter_stream_rabbit:String="${NameSpace.springcloud_prefix}:${NameSpace.starter_stream_rabbit}"
        const val spring_cloud_bus:String="${NameSpace.springcloud_prefix}:${NameSpace.spring_cloud_bus}"
        const val jaxb_core:String="${NameSpace.com_sun_xml_bind_prefix}:${NameSpace.jaxb_core}:${Versions.jaxb_core}"
        const val jaxb_api:String="${NameSpace.javax_xml_bind_prefix}:${NameSpace.jaxb_api}:${Versions.jaxb_api}"
        const val jaxb_impl:String="${NameSpace.com_sun_xml_bind_prefix}:${NameSpace.jaxb_impl}:${Versions.jaxb_impl}"
        const val gson:String="${NameSpace.com_google_code_gson_prefix}:${NameSpace.gson}:${Versions.gson}"
        const val ribbon_eureka:String="${NameSpace.com_netflix_ribbon_prefix}:${NameSpace.ribbon_eureka}:${Versions.ribbon_eureka}"
    }
}