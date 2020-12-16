package de.cosh.azure.service;

import de.cosh.azure.repository.GeoPredio19Repositorio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cosh on 06.12.2016.
 */
@Service
public class PersonServiceImpl implements PersonService {

    private final static  Logger LOGGER = LoggerFactory.getLogger(PersonServiceImpl.class);


    @Autowired
    private GeoPredio19Repositorio geoPredio19Repositorio;

    @Override
    public Integer test(){
        return geoPredio19Repositorio.getOne(46).getIdObjeto();
    }
}
