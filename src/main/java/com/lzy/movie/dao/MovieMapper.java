package com.lzy.movie.dao;

import java.util.List;

import com.lzy.movie.VO.MovieVO;
import com.lzy.movie.domain.Movie;

public interface MovieMapper {

	
	//��ѯ�б�+��������
	List<Movie> selects(MovieVO movieVO);
}
