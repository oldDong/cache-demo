package com.dongzj.common.dongzj.dao;

import com.dongzj.common.dongzj.condition.ArticleCoCondition;
import com.dongzj.common.dongzj.vo.Article;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleDao {
    /**
     * @mbg.generated
     */
    long countByCondition(ArticleCoCondition example);

    /**
     * @mbg.generated
     */
    int deleteByCondition(ArticleCoCondition example);

    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated
     */
    int insert(Article record);

    /**
     * @mbg.generated
     */
    int insertSelective(Article record);

    /**
     * @mbg.generated
     */
    List<Article> selectByConditionWithBLOBs(ArticleCoCondition example);

    /**
     * @mbg.generated
     */
    List<Article> selectByCondition(ArticleCoCondition example);

    /**
     * @mbg.generated
     */
    Article selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated
     */
    Article selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Article.Column ... selective);

    /**
     * @mbg.generated
     */
    int updateByConditionSelective(@Param("record") Article record, @Param("example") ArticleCoCondition example);

    /**
     * @mbg.generated
     */
    int updateByConditionWithBLOBs(@Param("record") Article record, @Param("example") ArticleCoCondition example);

    /**
     * @mbg.generated
     */
    int updateByCondition(@Param("record") Article record, @Param("example") ArticleCoCondition example);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Article record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Article record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(Article record);

    /**
     * @mbg.generated
     */
    List<Article> selectByExampleSelective(@Param("example") ArticleCoCondition example, @Param("selective") Article.Column ... selective);

    /**
     * @mbg.generated
     */
    int batchInsert(@Param("list") List<Article> list);

    /**
     * @mbg.generated
     */
    int batchInsertSelective(@Param("list") List<Article> list, @Param("selective") Article.Column ... selective);
}