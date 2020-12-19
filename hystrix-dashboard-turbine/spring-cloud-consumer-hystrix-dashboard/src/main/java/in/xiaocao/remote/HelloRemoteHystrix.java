package in.xiaocao.remote;

import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote{

	@Override
	public String hello1(String name) {
        return "hello1 " +name+", this messge send failed ";
	}

	@Override
	public String hello2(String name) {
		return "hello2 " +name+", this messge send failed ";
	}
}
