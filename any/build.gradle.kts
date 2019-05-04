import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
/**
 * 插件管理
 */
plugins {
    kotlin("jvm") version Config.Versions.kt_jvm_plugin
    id(Config.Plugins.dependency_management) version Config.Versions.dependency_management
}
/**
 * 全模块配置
 */
allprojects {
    apply(plugin = "java")
    apply(plugin=Config.Plugins.dependency_management)
    group = Config.Project.group
    version = Config.Project.version
    repositories {
//        maven ( Config.Project.repositories_url)
        mavenCentral()
    }
    /**
     * 子模块对springcloud的版本依赖
     */
    dependencyManagement{
        imports  {
            mavenBom(Config.Libs.cloud_dependencies)
        }
    }
    dependencies {
        "testImplementation"(Config.Libs.starter_test)
        "implementation"(kotlin(Config.Versions.kt_stdlib))
    }
    /**
     * jvm版本
     */
    configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_1_8
    }
    /**
     * kotlin编译目标
     */
    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = Config.Versions.kt_jvm_target
    }
}