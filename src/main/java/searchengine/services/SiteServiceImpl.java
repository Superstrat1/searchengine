package searchengine.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import searchengine.model.SiteEntity;
import searchengine.repositories.SiteRepository;

@Component
public class SiteServiceImpl implements SiteService<SiteEntity>{

    @Autowired
    private SiteRepository siteRepository;


    @Override
    public void create(SiteEntity site) {
        siteRepository.save(site);
    }

    @Override
    public void update(SiteEntity site) {
        siteRepository.save(site);
    }

    @Override
    public SiteEntity getById(Long id) {
        return siteRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteById(Long id) {
        siteRepository.deleteById(id);
    }
}
