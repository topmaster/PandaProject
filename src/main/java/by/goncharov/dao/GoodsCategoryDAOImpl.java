package by.goncharov.dao;

import by.goncharov.entity.GoodsCategory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description of GoodsCategoryDAOImpl class
 *
 * @author Mikita Hancharou
 * @created 24.05.13 10:22
 */
@Repository
public class GoodsCategoryDAOImpl extends AbstractBaseDAO implements GoodsCategoryDAO {

    @Transactional(readOnly = false)
    public void save(GoodsCategory goodsCategory) {
        super.save(goodsCategory);
    }

    @Transactional(readOnly = false)
    public void delete(GoodsCategory goodsCategory) {
        super.delete(goodsCategory);
    }

    @Transactional(readOnly = true)
    public GoodsCategory find(Long goodsCatId) {
        return (GoodsCategory) super.find(GoodsCategory.class, goodsCatId);
    }
}
