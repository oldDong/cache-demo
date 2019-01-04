package com.dongzj.cache.service;

import com.dongzj.common.dongzj.dao.ArticleDao;
import com.dongzj.common.dongzj.vo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2018/11/23
 * Time: 17:15
 */
@Service
@CacheConfig(cacheNames = "articleCache")
public class ArticleService {

    private AtomicInteger count = new AtomicInteger(0);

    @Autowired
    private ArticleDao articleDao;

    /**
     * 增加一篇文章，每次都进行缓存
     *
     * @param article
     */
    @CachePut
    public Integer addArticle(Article article) {
        Integer result = articleDao.insert(article);
        if (result > 0) {
            System.out.println("--执行增加操作成功--id: " + article.getId());
        }
        return article.getId();
    }

    /**
     * 获取文章，以传入的id为键，当state为0的时候不进行缓存
     *
     * @param id
     * @return
     */
    @Cacheable(key = "#id", unless = "#result.state==0")
    public Article getArticle(Integer id) {
        try {
            //模拟耗时操作
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        final Article article = articleDao.selectByPrimaryKey(id);
        System.out.println("--执行数据库查询操作" + count.incrementAndGet() + "次" + "id: " + id);
        return article;
    }

    /**
     * 通过id更新内容，清除以id作为键的缓存
     *
     * @param content
     * @param id
     * @return
     */
    @CacheEvict(key = "#id")
    public Integer updateContentById(String content, Integer id) {
        Article article = new Article();
        article.setId(id);
        article.setContent(content);
        Integer result = articleDao.updateByPrimaryKeySelective(article);
        System.out.println("--执行更新操作--id: " + id);
        return result;
    }

    /**
     * 通过移除文章
     *
     * @param id
     * @return
     */
    @CacheEvict(key = "#id")
    public Integer removeArticleById(Integer id) {
        final Integer result = articleDao.deleteByPrimaryKey(id);
        System.out.println("--执行删除操作--id: " + id);
        return result;
    }
}
