package hystrix;

import com.galaxy.hystrix.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloServiceImpl implements HelloService{

    @Override
    public String sayHello() {
        try {
            Thread.sleep(200l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello world";
    }
}
