package com.twitter.service.inter;

import java.util.List;

import com.twitter.model.CategoryCountVO;
import com.twitter.model.CategoryInfo;
import com.twitter.model.ClassifierInfo;
import com.twitter.model.HashTagsVO;
import com.twitter.model.ProbabilityInfo;
import com.twitter.model.StatusInfo;
import com.twitter.model.StopWordsVO;
import com.twitter.model.TweetInfo;
import com.twitter.model.UserInfo;

public interface TwitterServiceIF {

	public StatusInfo addStopWord(String stopword);

	public List<StopWordsVO> viewStopWords();

	public StatusInfo removeStopword(String stopWord);

	
	public StatusInfo retriveTweetsAndStore();

	public StatusInfo addHashTag(String hashTag);

	public List<HashTagsVO> viewHashTags();

	public List<TweetInfo> viewTweets();

	public StatusInfo removeNoise();

	public List<TweetInfo> viewCleanTweets();

	public StatusInfo removeTableData(String tableDataToRemove);

	public StatusInfo insertCategory(CategoryInfo categoryInfo);

	public List<CategoryInfo> viewCatWords();

	public StatusInfo removeCatWord(CategoryInfo categoryInfo);

	public StatusInfo doProbability();

	public List<ProbabilityInfo> viewProbability();

	
	public StatusInfo classifyTweet();

	
	public List<ClassifierInfo> viewClassifier();

	public List<CategoryCountVO> viewClassifierCount();  

}
