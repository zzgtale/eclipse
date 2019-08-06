package cn.itcast.controller;

@RequestMapping("/product")
@Controller
public class DemoController {

	@RequestMapping("/findAll.do")
	public String findAll() {
		System.out.println("123");
		return "success";
	}
}
