package com.examples.ivmdiaz.service;

import com.examples.ivmdiaz.dto.AnimeDto;
import com.examples.ivmdiaz.repository.AnimeRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MainServiceImpl implements MainService {

    private final AnimeRepository mAnimeRepository;

    @Override
    public List<AnimeDto> getAllAnime() {
        return mAnimeRepository.findAll().stream()
                .map(x -> new ModelMapper().map(x, AnimeDto.class))
                .collect(Collectors.toList());
    }
}
