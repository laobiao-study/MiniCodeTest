import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MiniCode.class)
public class Test {

    @Autowired
    MiniCode miniCode;

    @org.junit.Test
    public void test(){
        

        int [] inputNum = {9};
        miniCode.fun(inputNum,0,"");

    }

}
