package cn.itcast.lucene.dao;

import cn.itcast.lucene.pojo.Book;

import java.util.List;

public interface BookDao {

    /**
     * 查询数据库中所有书单
     * @return 书单列表
     */
    List<Book> queryBookList();
}
