package com.example.demo.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.CityDao;
import com.example.demo.vo.CityVo;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月12日 下午5:56:58 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
@Component
public class CityDaoImpl implements CityDao{
	@Autowired
	public SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<CityVo> listCities() {
		// TODO Auto-generated method stub
		return this.sqlSessionTemplate.selectList("listCities");
	}

	@Override
	public CityVo getCityById(Long id) {
		// TODO Auto-generated method stub
		return this.sqlSessionTemplate.selectOne("getCityById",id);
	}

}
