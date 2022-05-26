package pers.adlered.picuang;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class config implements WebMvcConfigurer {
    private String staticFileUrl = "E://imgupload/";
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("注解on");
        //浏览器访问路径中带有/document/时，将被映射到所设置的地址中
        registry.addResourceHandler("/uploadImages/**").addResourceLocations("file:"+staticFileUrl);
    }
}

