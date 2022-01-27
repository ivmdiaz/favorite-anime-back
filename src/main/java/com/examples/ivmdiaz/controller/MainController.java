package com.examples.ivmdiaz.controller;

import com.examples.ivmdiaz.dto.AnimeDto;
import com.examples.ivmdiaz.service.MainService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/main")
@AllArgsConstructor
public class MainController {

    private final MainService mMainService;

    @GetMapping("/anime")
    public List<AnimeDto> getAllAnime() {
        return mMainService.getAllAnime();
    }
}
