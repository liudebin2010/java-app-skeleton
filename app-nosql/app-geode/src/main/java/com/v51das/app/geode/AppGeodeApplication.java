package com.v51das.app.geode;

import com.v51das.app.geode.domain.Author;
import com.v51das.app.geode.repository.AuthorRepository;
import org.apache.geode.cache.client.ClientRegionShortcut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.*;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

@EnableIndexing
@EnablePdx(persistent=true)
@EnableEntityDefinedRegions(basePackageClasses = Author.class,clientRegionShortcut= ClientRegionShortcut.CACHING_PROXY)
@EnableGemfireRepositories(basePackageClasses = AuthorRepository.class)
//@EnableClusterConfiguration(useHttp = true,requireHttps = false)
@ClientCacheApplication
@SpringBootApplication
public class AppGeodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppGeodeApplication.class, args);
    }

}
