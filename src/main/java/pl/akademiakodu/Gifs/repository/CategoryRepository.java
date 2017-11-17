package pl.akademiakodu.Gifs.repository;

import org.springframework.stereotype.Repository;
import pl.akademiakodu.Gifs.model.Category;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepository {

    private List<Category> listCategories = new ArrayList<>();


    public CategoryRepository() {
        listCategories.add(new Category(1, "mems"));
        listCategories.add(new Category(2, "android"));
        listCategories.add(new Category(3, "sport"));
        listCategories.add(new Category(4, "funny"));
    }

    public List<Category> getListCategories() {
        return listCategories;
    }

    public void setListCategories(List<Category> listCategories) {
        this.listCategories = listCategories;
    }

    public List<Category> getAll() {
        return listCategories;
    }
}

