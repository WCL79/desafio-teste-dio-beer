package br.com.onedigitalinnovation.mapper;

import br.com.onedigitalinnovation.dto.BeerDTO;
import br.com.onedigitalinnovation.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
