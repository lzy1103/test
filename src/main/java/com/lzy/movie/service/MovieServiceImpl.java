package com.lzy.movie.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzy.movie.VO.MovieVO;
import com.lzy.movie.dao.MovieMapper;
import com.lzy.movie.domain.Movie;
@Service
public class MovieServiceImpl implements MovieService {

	@Resource
	private MovieMapper movieMapper;
	
	public PageInfo<Movie> selects(MovieVO movieVO, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Movie> list = movieMapper.selects(movieVO);
		return new PageInfo<Movie>(list);
	}

}
