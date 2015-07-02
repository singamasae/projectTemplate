package com.project.template.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.template.model.User;
import com.project.template.services.UserServices;
import com.project.template.util.APPConst;
import com.project.template.xml.Response;
import com.project.template.xml.Result;

@Controller
public class UserController {
	@Autowired
	private UserServices userServices;

	private static Logger log = LoggerFactory.getLogger(UserController.class);

	@RequestMapping(value = "/getUser.api", params = { "userName" }, method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public @ResponseBody Result login(@RequestParam(value = "userName") String userName) throws Exception {
		Result result = new Result();
		Response response = new Response();

		User user = userServices.findByUserName(userName.trim());

		if (user == null) {
			response.setCode(APPConst.RESPONSE_ERROR);
			response.setDescription("user is not registered");
			result.setResponse(response);
			return result;
		}

		response.setCode(APPConst.RESPONSE_SUCCESS);
		response.setDescription("user: " + user.getUserName() + " is registered");

		result.setResponse(response);
		return result;
	}

	@ExceptionHandler(Exception.class)
	public @ResponseBody Result errorHandle(Exception e) {
		Result result = new Result();

		Response response = new Response();
		response.setCode(APPConst.RESPONSE_ERROR);
		response.setDescription(e.getMessage());

		result.setResponse(response);

		log.error(e.getMessage(), e);
		return result;
	}
}
