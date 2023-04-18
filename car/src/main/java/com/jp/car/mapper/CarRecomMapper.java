package com.jp.car.mapper;

import java.util.List;


import com.jp.car.model.CarRecom;



public interface CarRecomMapper {
	public List<CarRecom> getAllCar();
	
	
	
	
	
	/*
	 * <select id="getCarList" parameterType="model.CarRecom"
	 * resultType="model.CarRecom"> select autoName, autoMaker, origin, price,
	 * overLength, overWidth, overHeight, totEmission, vehWeight from carRecom_tbl
	 * where origin = #{origin}
	 */
///*</select>
//
//<!-- <select id="getDetailByMsg" parameterType="model.Present" resultType="model.FloSort">
//	select floname, mok, gwa, sok, flo_size as flosize, color, habitat, 
//	life, picurl, bloom, acaname, engname from flor_sorttbl_spr 
//	where floname in (select floname from flor_present_spr where flomsg like '%' || #{ flomsg} || '%')
//</select>
//	
//<select id="getFloMsgs" resultType="String">
//	select distinct flomsg from flor_present_spr
//</select>
//<select id="getFloDetail" parameterType="model.FloSort" resultType="model.FloSort">
//	select floname, mok, gwa, sok, flo_size as flosize, color, habitat, 
//	life, picurl, bloom, acaname, engname from flor_sorttbl_spr 
//	where floname = #{floname} and mok = #{mok} and gwa = #{gwa}
//</select>
//<select id="getMGSNno" parameterType="String" resultType="Integer">
//	select count(mok) from flor_sorttbl_spr where floname = #{name}
//</select>
//<select id="getFloMGSN" parameterType="String" resultType="model.FloSort">
//	select floname, mok, gwa, sok, flo_size as flosize, color, habitat, 
//	life, picurl, bloom, acaname, engname from flor_sorttbl_spr where floname = #{name}
//</select>
//<select id="getFloSortName" resultType="model.FloSort">
//	select distinct floname from flor_sorttbl_spr
//</select>
//<select id="getFloMemb" parameterType="model.FloMemb" resultType="model.FloMemb">
//	select membId, membPwd, membName from flor_memtbl_spr 
//	where membId = #{membId} and membPwd = #{membPwd}
//</select>
//<insert id="putFloMemb" parameterType="model.FloMemb">
//	insert into flor_memtbl_spr values(#{membId}, #{membPwd}, #{membName})
//</insert> -->*/
}
