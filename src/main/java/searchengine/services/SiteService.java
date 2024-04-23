package searchengine.services;

import searchengine.model.SiteEntity;

public interface SiteService<T> {

    void create(T site);
    void update(T site);
    T getById(Long id);
    void deleteById(Long id);
}
