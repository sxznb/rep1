package aop_annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean3.xml")
public class PersonTest {
    @Autowired
    private Person person;

    @Test
    public void test(){
        person.addPerson();   //前置
        //person.deletePerson(); //后置
        //person.updatePerson();  //异常
        //person.queryPerson();
       // person.batchDeletePerson();
    }
}
