package teamB.GraduateJob.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import teamB.GraduateJob.po.Company;
import teamB.GraduateJob.po.Graduate;
import teamB.GraduateJob.service.AdminService;
import teamB.GraduateJob.service.CompanyService;
import teamB.GraduateJob.service.StudentService;


@Controller
public class LoginController {
	@Autowired
	private CompanyService companyService;
	@Autowired
	private StudentService studentService;

	@RequestMapping("/login.action")
	public String login(HttpServletRequest request, int userId, String password) throws IOException{
		if(userId == 123456 &&password.equals("123456")) {
			return "forward:/jsp/admin/admin_home.jsp";
		}
		else {
			Graduate graduate = studentService.findGraduateByGraduateId(userId);
			if(password.equals(graduate.getStupassword())){
				//将userID,userName,stu本身存入session
				request.getSession().setAttribute("graduateid", graduate.getGraduateid());
				request.getSession().setAttribute("graduate", graduate);
				return "forward:/stu_home.action";
			}
			return "forward:/jsp/login.jsp";
		}
	}
	@RequestMapping("/companylogin.action")
	public String companylogin(HttpServletRequest request, int userId, String password) throws IOException{
		Company company = companyService.selectByCompanyId(userId);
		if(password.equals(company.getCompanypassword())) {
			request.getSession().setAttribute("userId", company.getCompanyid());
			request.getSession().setAttribute("userName", company.getCompanyname());
			request.getSession().setAttribute("company", company);
			return "forward:/company_home.action";
		}
		else {
			String message="账号或密码错误，请重新输入";
			request.setAttribute("message", message);
			return "forward:/jsp/companylogin.jsp";
		}
	}
}
