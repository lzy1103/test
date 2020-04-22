package com.lzy.movie.dao;

import java.util.List;

import com.lzy.movie.VO.MovieVO;
import com.lzy.movie.domain.Movie;

public interface MovieMapper {

	
	//查询列表+附加条件
	List<Movie> selects(MovieVO movieVO);
}
