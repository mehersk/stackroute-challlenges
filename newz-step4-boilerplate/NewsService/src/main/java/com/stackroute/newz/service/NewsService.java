package com.stackroute.newz.service;

import java.util.List;

import com.stackroute.newz.model.News;
import com.stackroute.newz.util.exception.NewsAlreadyExistsException;
import com.stackroute.newz.util.exception.NewsNotFoundException;

public interface NewsService {

	/*
	 * Should not modify this interface. You have to implement these methods in
	 * corresponding Impl classes
	 */

	public boolean addNews(News news) throws NewsAlreadyExistsException;

	public boolean deleteNews(String userId, int newsId) throws NewsNotFoundException;

	public boolean deleteAllNews(String userId) throws NewsNotFoundException;

	public News updateNews(News news, int id, String userId) throws NewsNotFoundException;

	public News getNewsByNewsId(String userId, int newsId) throws NewsNotFoundException;

	public List<News> getAllNewsByUserId(String userId);

}
