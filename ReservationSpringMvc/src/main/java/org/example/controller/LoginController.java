package org.example.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.example.model.Users;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@Autowired

	@Qualifier("UserService")
	private UserService userService;

	static Users user;


	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, HttpSession session, Model model)
			throws SQLException, ClassNotFoundException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		System.out.println(email);
		System.out.println(password);

		if (userService.validate(email, password) == true) {
			user = userService.getByEmail(email);

			session.setAttribute("userId", user.getIdUsers());
			session.setAttribute("role", user.getRoles());

			String nom = user.getNom();
			String prenom = user.getPrenom();
			if (user.getRoles().getRoleType().equals("admin")) {
				model.addAttribute("model", nom);
				model.addAttribute("model", prenom);
				return "redirect:/reservation";
			}

			else if(user.getRoles().getRoleType().equals("student")) {
				model.addAttribute("model", nom);
				model.addAttribute("model", prenom);
				System.out.println(nom);
				System.out.println(prenom);
				return "redirect:/reservationlist";
			}

		} else {
			System.out.println("ACCOUNT NOR EXISET");
			
			return "redirect:/login";
		}
		return null;
	}
	
	
	
	@RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        System.out.println("logout succeed");
        return "redirect:/login";
    }

}