package com.baotrung;

import java.util.List;

public interface CategoryRepositoryCustom {

    List<Object> countProductsByCategories(MerchantStore store, List<Long> categoryIds);

    List<Category> listByStoreAndParent(MerchantStore store, Category category);

}
