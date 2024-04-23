package searchengine.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import searchengine.model.PageEntity;
import searchengine.repositories.PageRepository;

@Component
public class PageServiceImpl implements PageService<PageEntity>{

    @Autowired
    private PageRepository pageRepository;
    @Override
    public void create(PageEntity page) {
        pageRepository.save(page);
    }

    @Override
    public void update(PageEntity page) {
        pageRepository.save(page);
    }

    @Override
    public PageEntity getById(Long id) {
        return pageRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteById(Long id) {
        pageRepository.deleteById(id);
    }
}
