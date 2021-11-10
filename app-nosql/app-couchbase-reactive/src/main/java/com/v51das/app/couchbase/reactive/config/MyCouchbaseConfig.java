package com.v51das.app.couchbase.reactive.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.core.convert.MappingCouchbaseConverter;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

//@Configuration
//@EnableCouchbaseRepositories(basePackages={"com.v51das.app.couchbase.reactive.repository"}, considerNestedRepositories = true)
public class MyCouchbaseConfig extends AbstractCouchbaseConfiguration {

    @Value("${spring.couchbase.connection-string}")
    private String host;

    @Value("${spring.couchbase.username}")
    private String userName;

    @Value("${spring.couchbase.password}")
    private String password;

    @Value("${spring.data.couchbase.bucket-name}")
    private String bucketName;

    @Override
    public String getConnectionString() {
        return host;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getBucketName() {
        return bucketName;
    }

    @Override
    public String typeKey() {
        return MappingCouchbaseConverter.TYPEKEY_DEFAULT;
    }
}