package com.jshop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.jshop.dao.GoodsTDao;
import com.jshop.dao.impl.GoodsTDaoImpl;
import com.jshop.entity.GoodsT;
import com.jshop.service.GoodsTService;
@Service("goodsTService")
@Scope("prototype")
public class GoodsTServiceImpl implements GoodsTService {

	private GoodsTDao goodsTDao;
	public GoodsTDao getGoodsTDao() {
		return goodsTDao;
	}

	public void setGoodsTDao(GoodsTDao goodsTDao) {
		this.goodsTDao = goodsTDao;
	}

	public int delGoods(String[] list, String creatorid) {
		return getGoodsTDao().delGoods(list, creatorid);
	}

	public int updateGoods(GoodsT g) {
		return getGoodsTDao().updateGoods(g);
	}

	public int updateGoodsSaleState(String[] goodsid, String salestate, String creatorid) {
		return getGoodsTDao().updateGoodsSaleState(goodsid, salestate, creatorid);
	}

	public int updateGoodsbargainprice(String[] goodsid, String bargainprice, String creatorid) {
		return getGoodsTDao().updateGoodsbargainprice(goodsid, bargainprice, creatorid);
	}

	public int updateGoodshotsale(String[] goodsid, String hotsale, String creatorid) {
		return getGoodsTDao().updateGoodshotsale(goodsid, hotsale, creatorid);
	}

	public int updateGoodsreadcount(String goodsid) {
		return getGoodsTDao().updateGoodsreadcount(goodsid);
	}

	public int updateGoodsrecommended(String[] goodsid, String recommended, String creatorid) {
		return getGoodsTDao().updateGoodsrecommended(goodsid, recommended, creatorid);
	}

	public int updateGoodsisNew(String[] goodsid, String isNew, String creatorid) {
		return getGoodsTDao().updateGoodsisNew(goodsid, isNew, creatorid);
	}

	public int updateGoodsismobileplatformgoods(String[] goodsid, String ismobileplatformgoods, String creatorid) {
		return getGoodsTDao().updateGoodsismobileplatformgoods(goodsid, ismobileplatformgoods, creatorid);
	}

	public int updateGoodsrelatedfit(String goodsid, String list) {
		return getGoodsTDao().updateGoodsrelatedfit(goodsid, list);
	}

	public int updateGoodsrelatedgoods(String goodsid, String list) {
		return getGoodsTDao().updateGoodsrelatedgoods(goodsid, list);
	}

	public int updateGoodsreplycount(String goodsid) {
		return getGoodsTDao().updateGoodsreplycount(goodsid);
	}

	public int updateGoodssortid(String goodsid, String goodsortid) {
		return getGoodsTDao().updateGoodssortid(goodsid, goodsortid);
	}

	public int updateGoodssortname(String goodsid, String goodssortname) {
		return getGoodsTDao().updateGoodssortname(goodsid, goodssortname);
	}

	public int updateSort(String goodsid, Integer sort) {
		return getGoodsTDao().updateSort(goodsid, sort);
	}

	public int updateFiveGoodsState(String[] goodsid, String recommended, String hotsale, String bargainprice, String isNew, String ismobileplatformgoods) {
		return getGoodsTDao().updateFiveGoodsState(goodsid, recommended, hotsale, bargainprice, isNew, ismobileplatformgoods);
	}

	public int addGoods(GoodsT g) {
		return getGoodsTDao().addGoods(g);
	}

	public int countAllGoods(String creatorid) {
		return getGoodsTDao().countAllGoods(creatorid);
	}

	public List<GoodsT> findAllGoods(int currentPage, int lineSize, String creatorid) {
		return getGoodsTDao().findAllGoods(currentPage, lineSize, creatorid);
	}

	public GoodsT findGoodsById(String goodsid) {
		return getGoodsTDao().findGoodsById(goodsid);
	}

	public List<GoodsT> findGoodsByKeyword(String keywordid, int currentPage, int lineSize) {
		return getGoodsTDao().findGoodsByKeyword(keywordid, currentPage, lineSize);
	}

	public int countfindGoodsByKeyword(String keywordid) {
		return getGoodsTDao().countfindGoodsByKeyword(keywordid);
	}

	public List<GoodsT> findGoodsByLtypeid(String ltypeid, String salestate, int currentPage, int lineSize) {
		return getGoodsTDao().findGoodsByLtypeid(ltypeid, salestate, currentPage, lineSize);
	}

	public List<GoodsT> findGoodsByNavid(String navid, String salestate, final int currentPage, final int lineSize) {
		return getGoodsTDao().findGoodsByNavid(navid, salestate, currentPage, lineSize);
	}

	public int countfindGoodsByNavid(String navid, String salestate) {
		return getGoodsTDao().countfindGoodsByNavid(navid, salestate);
	}

	public int countfindGoodsByLtypeid(String ltypeid, String salestate) {
		return getGoodsTDao().countfindGoodsByLtypeid(ltypeid, salestate);
	}

	public List<GoodsT> findGoodsByStypeid(String stypeid, String salestate) {
		return getGoodsTDao().findGoodsByStypeid(stypeid, salestate);
	}

	public List<GoodsT> findGoodsBybrand(String brand) {
		return getGoodsTDao().findGoodsBybrand(brand);
	}

	public List<GoodsT> findGoodsBymodel(String model) {
		return getGoodsTDao().findGoodsBymodel(model);
	}

	public List<GoodsT> findGoodsByprice(String price) {
		return getGoodsTDao().findGoodsByprice(price);
	}

	public List<GoodsT> findGoodsByusersetnum(String usersetnum) {
		return getGoodsTDao().findGoodsByusersetnum(usersetnum);
	}

	public List<GoodsT> findGoodsForoptiontransferselect(String navid, String ltypeid, String stypeid, String goodsname) {
		return getGoodsTDao().findGoodsForoptiontransferselect(navid, ltypeid, stypeid, goodsname);
	}

	public List<GoodsT> findAllGoodstWithoutSplitpage() {
		return getGoodsTDao().findAllGoodstWithoutSplitpage();
	}

	public List<GoodsT> findGoodsLimitByGoodsType(String nlstypeid, int limit) {
		return getGoodsTDao().findGoodsLimitByGoodsType(nlstypeid, limit);
	}

	public List<GoodsT> findSamepriceGoods(int limit, double minprice, double maxprice, String goodsid) {
		return getGoodsTDao().findSamepriceGoods(limit, minprice, maxprice, goodsid);
	}

	public List<GoodsT> findGoodsByGoodsname(int currentPage, int lineSize, String goodsname) {
		return getGoodsTDao().findGoodsByGoodsname(currentPage, lineSize, goodsname);
	}

	public List<GoodsT> findMoreGoodsByGoodsType(String nlstypeid, int currentPage, int lineSize) {
		return getGoodsTDao().findMoreGoodsByGoodsType(nlstypeid, currentPage, lineSize);
	}

	public int countfindMoreGoodsByGoodsType(String nlstypeid) {
		return getGoodsTDao().countfindMoreGoodsByGoodsType(nlstypeid);
	}

	public int countfindSearchGoods(String goodsname) {
		return getGoodsTDao().countfindSearchGoods(goodsname);
	}

	public List<GoodsT> findSearchGoods(String goodsname, int currentPage, int lineSize) {
		return getGoodsTDao().findSearchGoods(goodsname, currentPage, lineSize);
	}

	public int countfindAllGoodslistMore(String salestate) {
		return getGoodsTDao().countfindAllGoodslistMore(salestate);
	}

	public List<GoodsT> findAllGoodslistMore(int currentPage, int lineSize, String salestate) {
		return getGoodsTDao().findAllGoodslistMore(currentPage, lineSize, salestate);
	}

	public int countfindMoreBargainPriceGoods() {
		return getGoodsTDao().countfindMoreBargainPriceGoods();
	}

	public int countfindMoreBargainPriceGoodsByGoodsType(String nlstypeid) {
		return getGoodsTDao().countfindMoreBargainPriceGoodsByGoodsType(nlstypeid);
	}

	public int countfindMoreHotSaleGoodsByGoodsType(String nlstypeid) {
		return getGoodsTDao().countfindMoreHotSaleGoodsByGoodsType(nlstypeid);
	}

	public int countfindMoreRecommendedGoodsByGoodsType(String nlstypeid) {
		return getGoodsTDao().countfindMoreRecommendedGoodsByGoodsType(nlstypeid);
	}

	public List<GoodsT> findMoreBargainPriceGoods(int currentPage, int lineSize) {
		return getGoodsTDao().findMoreBargainPriceGoods(currentPage, lineSize);
	}

	public List<GoodsT> findMoreBargainPriceGoodsByGoodsType(String nlstypeid, int currentPage, int lineSize) {
		return getGoodsTDao().findMoreBargainPriceGoodsByGoodsType(nlstypeid, currentPage, lineSize);
	}

	public List<GoodsT> findMoreHotSaleGoodsByGoodsType(String nlstypeid, int currentPage, int lineSize) {
		return getGoodsTDao().findMoreHotSaleGoodsByGoodsType(nlstypeid, currentPage, lineSize);
	}

	public List<GoodsT> findMoreRecommendedGoodsByGoodsType(String nlstypeid, int currentPage, int lineSize) {
		return getGoodsTDao().findMoreRecommendedGoodsByGoodsType(nlstypeid, currentPage, lineSize);
	}

	public List<GoodsT> findAllGoodsByismobileplatformgoods(int currentPage, int lineSize, String creatorid) {
		return getGoodsTDao().findAllGoodsByismobileplatformgoods(currentPage, lineSize, creatorid);
	}

	public int countfindAllGoodsByismobileplatformgoods(String creatorid) {
		return getGoodsTDao().countfindAllGoodsByismobileplatformgoods(creatorid);
	}

	public List<GoodsT> findAllGoodsForImgT() {
		return getGoodsTDao().findAllGoodsForImgT();
	}

	public List<GoodsT> findAllGoodsBynavid(String navid, String salestate) {
		return getGoodsTDao().findAllGoodsBynavid(navid, salestate);
	}

	public int updateHtmlPath(String goodsid, String htmlPath) {
		return getGoodsTDao().updateHtmlPath(goodsid, htmlPath);
	}

	public int updatecommentsumBygoodsid(String goodsid, int totalcomment) {
		return getGoodsTDao().updatecommentsumBygoodsid(goodsid, totalcomment);
	}

	public int updatestarsumBygoodsid(String goodsid, int star) {
		return getGoodsTDao().updatestarsumBygoodsid(goodsid, star);
	}

	public List<GoodsT> finaAllGoodsT(String salestate) {
		return getGoodsTDao().finaAllGoodsT(salestate);
	}

	public List<GoodsT> findGoodsByLtypeid(String ltypeid, String salestate) {
		return getGoodsTDao().findGoodsByLtypeid(ltypeid, salestate);
	}

	public int updatestarusersumBygoodsid(String goodsid, int staruser) {
		return getGoodsTDao().updatestarusersumBygoodsid(goodsid, staruser);
	}

	public List<GoodsT> findAllGoodsBynavidorderbyParams(String navid, String salestate, String sales, String memberprice, String totalcomment, String bargainprice, String hotsale, String recommended, String isNew, String value) {
		return getGoodsTDao().findAllGoodsBynavidorderbyParams(navid, salestate, sales, memberprice, totalcomment, bargainprice, hotsale, recommended, isNew, value);
	}

	public List<GoodsT> findAllGoodsByLtypeidorderbyParams(String ltypeid, String salestate, String sales, String memberprice, String totalcomment, String bargainprice, String hotsale, String recommended, String isNew, String value) {
		return getGoodsTDao().findAllGoodsByLtypeidorderbyParams(ltypeid, salestate, sales, memberprice, totalcomment, bargainprice, hotsale, recommended, isNew, value);
	}

	public List<GoodsT> sortAllGoods(int currentPage, int lineSize, String creatorid, String queryString) {
		return this.getGoodsTDao().sortAllGoods(currentPage, lineSize, creatorid, queryString);
	}

	public int updateGoodsTypeNameBygoodsTypeId(String goodsTypeName, String goodsTypeId) {
		return this.getGoodsTDao().updateGoodsTypeNameBygoodsTypeId(goodsTypeName, goodsTypeId);
	}

	public int updateGoodsCategoryBynlsid(String queryString) {
		return this.getGoodsTDao().updateGoodsCategoryBynlsid(queryString);
	}

	public int updateGoodsSaleState(String goodsTypeId, String salestate) {
		return this.getGoodsTDao().updateGoodsSaleState(goodsTypeId, salestate);
	}

	public List<GoodsT> findshuffleGoods(int currentPage, int lineSize, String salestate, String recommended) {
		return this.getGoodsTDao().findshuffleGoods(currentPage, lineSize, salestate, recommended);
	}

	public List<GoodsT> findGoodsByattrs(int currentPage, int lineSize, String attr, String salestate) {
		return this.getGoodsTDao().findGoodsByattrs(currentPage, lineSize, attr, salestate);
	}

	@Override
	public List<GoodsT> findGoodsByNavid(String navid, String salestate,
			String ismobileplatformgoods) {
		return this.getGoodsTDao().findGoodsByNavid(navid, salestate, ismobileplatformgoods);
	}

}
