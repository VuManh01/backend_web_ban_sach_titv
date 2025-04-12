package org.example.backend_webbansach_titv.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.Type;
import org.example.backend_webbansach_titv.entity.NguoiDung;
import org.example.backend_webbansach_titv.entity.TheLoai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

//cau hinh cho phep hoac chan cac method
@Configuration
public class MethodRestConfig implements RepositoryRestConfigurer {
    private String url = "http://localhost:8080";
    @Autowired
    private EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        //cho phep chan hoac cho phep truy cap method
        HttpMethod[] chanCacPhuongThuc = {
                HttpMethod.POST,
                HttpMethod.PUT,
                HttpMethod.PATCH,
                HttpMethod.DELETE
        };

        //cho phep lay them id khi tra ve json
        config.exposeIdsFor(
                entityManager.getMetamodel().getEntities().stream()
                        .map(Type::getJavaType)
                        .toArray(Class[]::new)
        );


        chanHttpMethod(TheLoai.class, config, chanCacPhuongThuc);

        HttpMethod[] phuongThucDelete = {HttpMethod.DELETE};
        chanHttpMethod (NguoiDung.class, config,phuongThucDelete );



        //cho phep lay moi TheLoai
//        config.exposeIdsFor(
//                TheLoai.class
//        );
    }

    public void chanHttpMethod(Class c, RepositoryRestConfiguration config, HttpMethod[] methods) {
        config.getExposureConfiguration()
                .forDomainType(c)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(methods))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(methods));
    }
}

