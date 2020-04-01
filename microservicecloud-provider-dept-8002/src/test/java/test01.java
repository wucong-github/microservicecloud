
import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.service.impl.DeptServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class test01 {
    @Autowired
    DeptDao deptDao;
    @Autowired
    DeptServiceImpl deptService;

    @Test
    public void test01() {

        System.out.println(deptService.get(1L));
    }
}
