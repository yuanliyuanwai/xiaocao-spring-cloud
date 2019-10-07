package in.xiaocao.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(name = "xxx", url = "http://localhost:9001")
@FeignClient(name = "xxx", url = "${outer.producer.url}")
public interface OuterHelloRemote {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);


}
