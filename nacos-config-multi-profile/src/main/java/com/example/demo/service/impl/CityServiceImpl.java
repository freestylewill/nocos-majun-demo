package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CityDao;
import com.example.demo.service.CityService;
import com.example.demo.vo.CityVo;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月12日 下午6:00:37 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
@Service
public class CityServiceImpl implements CityService{
	
	@Autowired
	private CityDao cityDao;
	
	/**
	 * 获得城市列表
	 */
	@Override
	public List<CityVo> listCities() {
		return this.cityDao.listCities();
	}

	/**
	 * 根据id，获得某个城市
	 */
	@Override
	public CityVo getCityById(Long id) {
		return this.cityDao.getCityById(id);
	}

}
