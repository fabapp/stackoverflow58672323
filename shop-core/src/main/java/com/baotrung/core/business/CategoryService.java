package com.baotrung.core.business;

import com.baotrung.Category;
import com.baotrung.MerchantStore;

import java.util.List;

public interface CategoryService {

    List<Object> countProductsByCategories(MerchantStore store, List<Long> categoryIds);

    List<Category> listByStoreAndParent(MerchantStore store, Category category);

    PersistableCategory saveCategories(MerchantStore store, PersistableCategory persistableCategory);

    Category findById(Long id);

    List<ReadableCategory> findCategories(MerchantStore store, int dept, Language language, List<String> filters);
}