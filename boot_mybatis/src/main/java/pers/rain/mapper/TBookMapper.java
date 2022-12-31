package pers.rain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import pers.rain.bean.TBook;
import pers.rain.bean.TBookExample;

import javax.annotation.ManagedBean;

@Mapper
public interface TBookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Fri Nov 25 20:52:54 CST 2022
     */
    int countByExample(TBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Fri Nov 25 20:52:54 CST 2022
     */
    int deleteByExample(TBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Fri Nov 25 20:52:54 CST 2022
     */
    int deleteByPrimaryKey(Integer bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Fri Nov 25 20:52:54 CST 2022
     */
    int insert(TBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Fri Nov 25 20:52:54 CST 2022
     */
    int insertSelective(TBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Fri Nov 25 20:52:54 CST 2022
     */
    List<TBook> selectByExample(TBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Fri Nov 25 20:52:54 CST 2022
     */
    TBook selectByPrimaryKey(Integer bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Fri Nov 25 20:52:54 CST 2022
     */
    int updateByExampleSelective(@Param("record") TBook record, @Param("example") TBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Fri Nov 25 20:52:54 CST 2022
     */
    int updateByExample(@Param("record") TBook record, @Param("example") TBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Fri Nov 25 20:52:54 CST 2022
     */
    int updateByPrimaryKeySelective(TBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Fri Nov 25 20:52:54 CST 2022
     */
    int updateByPrimaryKey(TBook record);
}