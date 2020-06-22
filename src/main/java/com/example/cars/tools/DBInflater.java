package com.example.cars.tools;

import com.example.cars.model.Brand;
import com.example.cars.model.Engine;
import com.example.cars.model.Model;
import com.example.cars.repositories.BrandRepository;
import com.example.cars.repositories.EngineRepository;
import com.example.cars.repositories.ModelRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DBInflater implements ApplicationListener<ContextRefreshedEvent> {

    public DBInflater(ModelRepository modelsRepository, BrandRepository brandsRepository, EngineRepository enginesRepository) {
        this.modelRepository = modelRepository;
        this.brandRepository = brandRepository;
        this.engineRepository = engineRepository;
    }

    private ModelRepository modelRepository;
    private BrandRepository brandRepository;
    private EngineRepository engineRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Brand Audi = new Brand("Audi", "VW AG");
        Engine cmm3197 = new Engine("3.2");
        Model A5 = new Model("audi", "A5", "F5", "2016+", "VW AG");
        Audi.getModels().add(A5);
        A5.getBrands().add(Audi);
        engineRepository.save(cmm3197);
        brandRepository.save(Audi);
        modelRepository.save(A5);

        Brand BMW = new Brand("BMW", "Bayerische Motoren Werke");
        Engine cmm1998 = new Engine("2.0");
        Model E3 = new Model("BMW", "E3", "G20", "2018+", "Bayerische Motoren Werke");
        BMW.getModels().add(E3);
        E3.getBrands().add(BMW);
        engineRepository.save(cmm1998);
        brandRepository.save(BMW);
        modelRepository.save(E3);

    }
}

