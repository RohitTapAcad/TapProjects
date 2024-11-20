import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	public Test() {
		System.out.println("test class object is created");
	}
	
	
	@RequestMapping("/first")
	public void testacceptre1()
	{
		System.out.println("first req");
	}
}
