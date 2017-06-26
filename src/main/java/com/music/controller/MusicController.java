package com.music.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.music.dto.Music;

@Controller
public class MusicController {
	
	@RequestMapping(value="/show",method = RequestMethod.GET)
	public String getMusics(HttpServletRequest request,Model model){
		String path = request.getSession().getServletContext().getRealPath("/");
		File file = new File(path+"media/");
		File[] files = file.listFiles();
		Music<String> music = new Music<String>();
		music.setTitle("Moon Music");
		List<String> list = new ArrayList<String>();
		for(File f:files){
			if(f.isFile()){
				String name = f.getName();
				list.add(name.substring(0, name.lastIndexOf('.')));
			}
		}
		music.setList(list);
		model.addAttribute("music", music);
		return "index";
	}
}
