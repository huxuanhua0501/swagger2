//package swagger2;
//
///**
// * Created by win7 on 2017/5/9.
// */
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//@ComponentScan("swagger2")
//public class SwaggerConfig {
//
//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("swagger2"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        ApiInfo apiInfo = new ApiInfoBuilder().title("订单系统")
//                .description("主要支撑订单系统")
//                .license("陈浪")
//                .licenseUrl("http://opensource.org/licenses/MIT")
//                .contact(new Contact("GuangLin", "OuYang", "93775988@qq.com"))
//                .version("1.0")
//                .build();
//
//        return apiInfo;
//    }
//}