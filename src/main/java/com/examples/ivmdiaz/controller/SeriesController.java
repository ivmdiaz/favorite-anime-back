package com.examples.ivmdiaz.controller;

import com.examples.ivmdiaz.dto.master.SeriesDto;
import com.examples.ivmdiaz.service.SeriesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
@AllArgsConstructor
public class SeriesController {

    private final SeriesService mSeriesService;

    @GetMapping("/anime")
    public List<SeriesDto> getAllAnime() {
        return mSeriesService.getAllAnime();
    }
}
