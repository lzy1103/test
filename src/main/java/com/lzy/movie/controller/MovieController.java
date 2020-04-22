package com.lzy.movie.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.lzy.movie.VO.MovieVO;
import com.lzy.movie.domain.Movie;
import com.lzy.movie.service.MovieService;

@Controller
public class MovieController {

	@Resource
	private MovieService movieService;
	
	@RequestMapping("selects")
	public String selects(Model model, MovieVO movieVO,@RequestParam(defaultValue="1")Integer pageNum,@RequestParam(defaultValue="2")Integer pageSize) {
		PageInfo<Movie> info = movieService.selects(movieVO, pageNum, pageSize);
	
		model.addAttribute("info", info);
		model.addAttribute("movieVO", movieVO);
		return "movies";
		
	}
	
	
}