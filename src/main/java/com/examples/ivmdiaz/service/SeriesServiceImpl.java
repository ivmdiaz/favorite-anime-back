package com.examples.ivmdiaz.service;

import com.examples.ivmdiaz.dto.master.SeriesDto;
import com.examples.ivmdiaz.enums.CategorySeriesEnum;
import com.examples.ivmdiaz.repository.master.SeriesRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SeriesServiceImpl implements SeriesService {

    private final SeriesRepository mSeriesRepository;

    @Override
    public List<SeriesDto> getAllAnime() {
        return mSeriesRepository.findByCategoryCode(CategorySeriesEnum.ANIME.getCode()).stream()
                .map(x -> new ModelMapper().map(x, SeriesDto.class))
                .collect(Collectors.toList());
    }
}
