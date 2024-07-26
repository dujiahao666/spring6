package com.powernode.spring6.test;

import com.powernode.spring6.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/28 16:00
 * @description:
 */
public class SpringJdbcTest {
    @Test
    public void testJdbc() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println(jdbcTemplate);
    }

    @Test
    public void testInsert() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "insert into t_user values(null,?,?);";
        //注意：在JdbcTemplate当中，只要是insert delete update语句的，都是调用update方法。
        int update = jdbcTemplate.update(sql, "王五", 36);
        System.out.println("新增了：" + update);
    }

    @Test
    public void testUpdate() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "update t_user set real_name = ? , age=? where id=?;";
        int update = jdbcTemplate.update(sql, "王五3", 41, 3);
        System.out.println(update);
    }

    @Test
    public void testDelete() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "delete from t_user where id=?";
        int update = jdbcTemplate.update(sql, 1);
        System.out.println(update);
    }

    @Test
    public void testQueryOne() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql="select * from t_user where id=?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 2);
        System.out.println(user);
    }

    @Test
    public void testQueryAll() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql="select * from t_user";
        List<User> querys = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        querys.stream().forEach(as-> System.out.println(as));
    }

    @Test
    public void testQueryOneValue() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql="select count(*) from t_user";
        Integer i = jdbcTemplate.queryForObject(sql, int.class);
        System.out.println("总记录条数:"+i);
    }


    @Test
    public void testBatchUpdate(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql="insert into t_user values (?,?,?)";
        Object[] obj1={null,"小花",21};
        Object[] obj2={null,"小王",22};
        Object[] obj3={null,"小贾",23};
        List<Object[]> list=new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        int[] ints = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(ints));
    }


    @Test
    public void testBatchUpdate2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql="update t_user set real_name=? , age=? where id=?";
        Object[] obj1={"贝贝",16,4};
        Object[] obj2={"京京",16,5};
        Object[] obj3={"莹莹",16,6};
        List<Object[]> list=new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        int[] ints = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(ints));
    }

}


