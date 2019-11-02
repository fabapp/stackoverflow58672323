package com.baotrung;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepositoryCustomImpl implements CategoryRepositoryCustom {
    @Override
    public List<Object> countProductsByCategories(MerchantStore store, List<Long> categoryIds) {
        return null;
    }

    @Override
    public List<Category> listByStoreAndParent(MerchantStore store, Category category) {
        return null;
    }

// some method impl
}