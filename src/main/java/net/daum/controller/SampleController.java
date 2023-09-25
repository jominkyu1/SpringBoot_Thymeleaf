package net.daum.controller;

import net.daum.vo.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SampleController {

	@GetMapping("/start_thymeleaf")
	public ModelAndView start_thymeleaf() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("greeting", "안녕하세요. 타임리프");
		mv.setViewName("/thymeleaf/start_thymeLeaf");

		return mv;
	}

	@RequestMapping("/listTest")
	public void listTest(Model model) {
		List<String> list = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			list.add("Data:" + i);
		}

		model.addAttribute("cont_title", "타임리프로 복수 값 가져오기");
		model.addAttribute("list", list);
	}

	@GetMapping("/sample2")
	public void sample2(Model model) {
		MemberVO vo =
				new MemberVO(123, "u00", "00", "홍길동", new Timestamp(System.currentTimeMillis()));

		model.addAttribute("vo", vo);
	}

	@GetMapping("/sample3")
	public String sample3(Model model) {
		List<MemberVO> list = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			list.add(new MemberVO(123 + i, "u0" + i, "p0" + i, "홍길동" + i,
					new Timestamp(System.currentTimeMillis())));
		}
		model.addAttribute("list", list);
		return "sample3";
	}

	@GetMapping("/sample5")
	public String sample5(Model model){
		String result = "SUCCESS";
		model.addAttribute("result", result);
		return "sample5";
	}
}
