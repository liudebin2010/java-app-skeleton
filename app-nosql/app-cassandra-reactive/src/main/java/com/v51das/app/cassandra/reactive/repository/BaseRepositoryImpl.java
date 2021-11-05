package com.v51das.app.cassandra.reactive.repository;

import com.datastax.oss.driver.api.core.cql.PagingState;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.query.CassandraPageRequest;
import org.springframework.data.cassandra.core.query.Query;
import org.springframework.data.domain.Slice;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @description：基础 仓储实现层
 * @author：twislyn
 * @date：Created in 2020/05/21
 * @modified By：
 * @version: 1.0
 */
public class BaseRepositoryImpl<T> implements BaseRepository<T> {
    @Resource
    CassandraTemplate cassandraTemplate;

    protected Class<T> entityClass = currentModelClass();

    /**
     * 获取泛型类型
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    protected Class<T> currentModelClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public T getById(Serializable id) {
        return cassandraTemplate.selectOneById(id, entityClass);
    }

    @Override
    public T getObj(Query query) {
        return cassandraTemplate.selectOne(query, entityClass);
    }

    @Override
    public List<T> listObjs(Query query) {
        return cassandraTemplate.select(query, entityClass);
    }

//    @Override
//    public Slice<T> pageObjs(Pagination pagination, Query query) {
//        if (pagination.getPageSize() > 1) {
//            CassandraPageRequest pageRequest = pagination.getPageRequest();
//            Slice<T> slice = cassandraTemplate.slice(query.pageRequest(pageRequest), entityClass);
//            for (int i = 1, len = pagination.getPageSize(); i < len; i++) {
//                PagingState pagingState = ((CassandraPageRequest) slice.getPageable()).getPagingState();
//                if (pagingState == null) {
//                    return slice;
//                }
//                pageRequest = CassandraPageRequest.of(slice.getPageable(), pagingState);
//                slice = cassandraTemplate.slice(query.pageRequest(pageRequest), entityClass);
//            }
//            return slice;
//        }
//        return cassandraTemplate.slice(query.pageRequest(pagination.getPageRequest()), entityClass);
//
//    }
}