package com.cj.multidatasourcedemo.dao.other;

import com.cj.multidatasourcedemo.pojo.other.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

//    @Query("select u from User u left join Dict d on u.active = d.dictCode and d.dictType = 'ACTIVE_TYPE'")
    @Query(nativeQuery = true, value = "select d.dict_name from yangguang_9.t_user u left join basics.t_dict d on u.active = d.dict_code and d.dict_type = 'ACTIVE_TYPE'")
    List<String> findByXX();
}
