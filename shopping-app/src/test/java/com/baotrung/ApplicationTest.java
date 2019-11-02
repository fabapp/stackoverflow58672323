package com.baotrung;

import com.baotrung.CategoriesRepository;
import com.baotrung.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    CategoriesRepository categoriesRepository;

    @Test
    public void test() {
        Category category = new Category();
        category.setName("foo");
        Category category1 = categoriesRepository.save(category);
        assertThat(category1.getId()).isNotNull();
    }
}
