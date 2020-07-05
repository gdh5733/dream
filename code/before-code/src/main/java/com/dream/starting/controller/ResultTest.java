package com.dream.starting.controller;
import com.dream.starting.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

/** 返回给前端结果参照案例 后续可删
 * @author gaodehan
 * @date 2020/06/23
 */
@RestController
@RequestMapping("/test/result")
public class ResultTest {

    @GetMapping("getres")
    public R getChapterVideo() {
        List<Object>  res = new ArrayList<>();
        res.add("1");
        res.add("2");
        return R.ok().data("result",res);
    }

}
