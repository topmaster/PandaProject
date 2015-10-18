package by.goncharov.dao;

import by.goncharov.entity.GoodsCategory;

/**
 * Description of GoodsCategoryDAO class
 *
 * @author Mikita Hancharou
 * @created 24.05.13 10:20
 */
public interface GoodsCategoryDAO {

    void save(GoodsCategory goodsCategory);

    void delete(GoodsCategory goodsCategory);

    GoodsCategory find(Long goodsCatId);
}
