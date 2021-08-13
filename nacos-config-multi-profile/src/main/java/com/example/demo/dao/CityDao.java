package com.example.demo.dao;

import java.util.List;

import com.example.demo.vo.CityVo;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月12日 下午5:54:25 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
public interface CityDao {
	public List<CityVo> listCities();

	public CityVo getCityById(Long id);
}
