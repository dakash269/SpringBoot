package com.javasampleapproach.angularjs.dao;
import com.javasampleapproach.angularjs.model.Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 * Created by akash on 24/7/17.
 */
@Repository
public interface Datadao extends CrudRepository<Data,Long> {
}


