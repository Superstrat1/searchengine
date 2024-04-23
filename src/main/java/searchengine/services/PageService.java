package searchengine.services;

public interface PageService<T> {


    void create(T page);
    void update(T page);
    T getById(Long id);
    void deleteById(Long id);
}
