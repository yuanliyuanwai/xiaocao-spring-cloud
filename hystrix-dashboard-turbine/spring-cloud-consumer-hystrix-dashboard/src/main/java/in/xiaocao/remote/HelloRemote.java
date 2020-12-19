package in.xiaocao.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "/hello1")
    String hello1(@RequestParam(value = "name") String name);
    
    @RequestMapping(value = "/hello2")
    String hello2(@RequestParam(value = "name") String name);

}
