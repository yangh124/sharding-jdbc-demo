package com.yh.shardingjdbcdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yh.entity.Course;
import com.yh.entity.Udict;
import com.yh.entity.User;
import com.yh.mapper.CourseMapper;
import com.yh.mapper.UdictMapper;
import com.yh.mapper.UserMapper;
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
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UdictMapper udictMapper;

    @Test
    public void insert() {
        for (int i = 0; i < 10; i++) {
            Course course = new Course();
            course.setCname("JAVA高级课程：" + i);
            course.setUserId((long) i);
            course.setCstatus("开课中");
            courseMapper.insert(course);
        }
    }

    @Test
    public void query() {
        QueryWrapper<Course> wrapper = new QueryWrapper<>();
        wrapper.eq("cid", 1358740081100824578L);
        Course course = courseMapper.selectOne(wrapper);
        System.out.println(course);
    }

    /**
     * 垂直分库
     */
    @Test
    public void insertUser() {
        User user = new User();
        user.setUsername("yh");
        user.setUstatus("好帅");
        userMapper.insert(user);
    }

    @Test
    public void broadcastInsert() {
        Udict udict = new Udict();
        udict.setUstatus("a");
        udict.setUvalue("hhhhhh");
        udictMapper.insert(udict);
    }
}
