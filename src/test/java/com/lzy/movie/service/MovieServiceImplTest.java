package com.lzy.movie.service;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.lzy.movie.VO.MovieVO;
import com.lzy.movie.dao.MovieMapper;
import com.lzy.movie.domain.Movie;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class MovieServiceImplTest {
	@Resource
	private MovieService movieService;
	@Test
	public void testSelects() {
		PageInfo<Movie> selects = movieService.selects(new MovieVO(), 1, 10);
	System.out.println(selects);
	}

}
