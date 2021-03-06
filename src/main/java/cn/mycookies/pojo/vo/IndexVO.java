package cn.mycookies.pojo.vo;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @description 首页要展示的内容
 * @author Jann Lee
 * @date 2018-11-25 22:07
 */
@Setter
@Getter
@NoArgsConstructor
@ToString
@ApiModel("首页")
public class IndexVO {

    public PageInfo<BlogVO> blogList;

    public List<BlogVO> recommendList;

    public List<TagVO> categoryList;

    public List<TagVO> tagList;

}
