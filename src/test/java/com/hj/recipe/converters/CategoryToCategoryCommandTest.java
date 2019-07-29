package com.hj.recipe.converters;

import com.hj.recipe.command.CategoryCommand;
import com.hj.recipe.domain.Category;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class CategoryToCategoryCommandTest {
    public static final String ID_VALUE = "1";
    public static final String DESCRIPTION = "description";
    CategoryToCategoryCommand categoryToCategoryCommand;

    @Before
    public void setUp() throws Exception {
        categoryToCategoryCommand = new CategoryToCategoryCommand();
    }

    @Test
    public void testNullObject(){
        assertNull(categoryToCategoryCommand.convert(null));
    }

    @Test
    public void testBlanObject(){
        assertNotNull(categoryToCategoryCommand.convert(new Category()));
    }
    @Test
    public void convert() {
        Category category = new Category();
        category.setId(ID_VALUE);
        category.setDescription(DESCRIPTION);

        CategoryCommand categoryCommand = categoryToCategoryCommand.convert(category);
        assertEquals(ID_VALUE, categoryCommand.getId());
        assertEquals(DESCRIPTION, categoryCommand.getDescription());
    }
}