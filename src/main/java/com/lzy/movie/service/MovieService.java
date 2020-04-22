package com.lzy.movie.service;

import com.github.pagehelper.PageInfo;
import com.lzy.movie.VO.MovieVO;
import com.lzy.movie.domain.Movie;

public interface MovieService {

	
	PageInfo<Movie> selects(MovieVO movieVO,Integer pageNum,Integer pageSize);
}
