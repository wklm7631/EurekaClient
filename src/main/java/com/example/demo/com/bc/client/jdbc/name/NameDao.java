package com.example.demo.com.bc.client.jdbc.name;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
public interface NameDao extends JpaRepository<Name, String>, JpaSpecificationExecutor<Name> {

}
