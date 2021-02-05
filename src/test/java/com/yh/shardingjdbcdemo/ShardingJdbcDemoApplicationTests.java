package com.yh.shardingjdbcdemo;

import com.yh.entity.Course;
import com.yh.mapper.CourseMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ShardingJdbcDemoApplicationTests {

    @Autowired
    private CourseMapper courseMapper;

    @Test
    public void contextLoads() {
        Course course = new Course();
        course.setCname("JAVA高级课程");
        course.setUserId(1L);
        course.setCstatus("开课中");
        int insert = courseMapper.insert(course);
        System.out.println(insert > 0);
    }

}
