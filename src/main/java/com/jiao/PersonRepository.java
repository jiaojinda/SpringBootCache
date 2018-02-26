package com.jiao;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018/2/26.
 */
public interface PersonRepository extends JpaRepository<Person,Long> {
}
