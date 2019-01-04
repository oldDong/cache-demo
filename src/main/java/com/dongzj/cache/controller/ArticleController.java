package com.dongzj.cache.controller;

import com.dongzj.cache.service.ArticleService;
import com.dongzj.cache.vo.ResultVo;
import com.dongzj.common.dongzj.vo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2018/11/23
 * Time: 17:37
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("/add")
    public ResultVo addArticle(@RequestBody Article article) {
        System.out.println(article.toString());
        Integer result = articleService.addArticle(article);
        if (result >= 0) {
            return ResultVo.success(result);
        } else {
            return ResultVo.fail("新增失败");
        }
    }

    @GetMapping("/get")
    public ResultVo getArticle(@RequestParam("id") Integer id) {
        long start = System.currentTimeMillis();
        Article article = articleService.getArticle(id);
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
        if (null != article) {
            return ResultVo.success(article);
        }
        return ResultVo.fail("查询失败");
    }

    @GetMapping("/update")
    public ResultVo update(@RequestParam("content") String content, @RequestParam("id") Integer id) {
        final Integer result = articleService.updateContentById(content, id);
        if (result > 0) {
            return ResultVo.success(result);
        } else {
            return ResultVo.fail("更新失败");
        }
    }

    @GetMapping("/delete")
    public ResultVo delete(@RequestParam("id") Integer id) {
        final Integer result = articleService.removeArticleById(id);
        if (result > 0) {
            return ResultVo.success(result);
        } else {
            return ResultVo.fail("删除失败");
        }
    }

}
