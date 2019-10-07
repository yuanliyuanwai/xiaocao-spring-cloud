package in.xiaocao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.xiaocao.remote.InnerHelloRemote;
import in.xiaocao.remote.OuterHelloRemote;

@RestController
public class ConsumerController {

    @Autowired
    InnerHelloRemote innerHelloRemote;
    
    @Autowired
    OuterHelloRemote outerHelloRemote;
	
    @RequestMapping("/inner/hello/{name}")
    public String inner(@PathVariable("name") String name) {
        return innerHelloRemote.hello(name);
    }
    
    @RequestMapping("outer/hello/{name}")
    public String outer(@PathVariable("name") String name) {
        return outerHelloRemote.hello(name);
    }

}