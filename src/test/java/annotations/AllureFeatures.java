package annotations;

import io.qameta.allure.Feature;

import java.lang.annotation.*;

public @interface AllureFeatures {
    @Documented
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD, ElementType.TYPE})
    @Feature("Issue")
    @ManualMember("user1")
    @AutoMember("OIzibekova")
    @Component("API")
    @interface Issue {

    }

    @Documented
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD, ElementType.TYPE})
    @Feature("PullRequests")
    @ManualMember("c05-Oizibekova")
    @AutoMember("OIzibekova")
    @Component("API")
    @interface PullRequests {

    }
}