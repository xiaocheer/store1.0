package com.store.web.dao;

import java.util.List;

/**
 * image图片获取
 * @author xj
 *
 */
public interface ImageDao {
	   List<String>  getSingleImages(String[] imageUrls);
}
