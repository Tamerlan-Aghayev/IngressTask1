package com.company.ingress.service;

import com.company.ingress.entity.CountEntity;
import com.company.ingress.repository.CountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountService {
    private final CountRepository countRepository;
    public String addCount(){
        if (countRepository.count()>0) {
            CountEntity countEntity = countRepository.getFirstElement();
            int count = countEntity.getCount();
            count++;
            countEntity.setCount(count);
            countRepository.save(countEntity);
            return "Hello from ms1 " + count;
        }
        else{
            CountEntity countEntity=new CountEntity();
            countEntity.setCount(0);
            countRepository.save(countEntity);
            return "Hello from ms1 1";
        }
    }
}
