package hystrix;

import com.galaxy.hystrix.HelloService;
import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHello() {
        return "hello world";
    }
}
