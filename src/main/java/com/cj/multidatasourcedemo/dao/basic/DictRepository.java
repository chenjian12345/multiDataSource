package com.cj.multidatasourcedemo.dao.basic;

import com.cj.multidatasourcedemo.pojo.basic.Dict;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DictRepository extends JpaRepository<Dict, String> {
}
