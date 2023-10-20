package com.sublinksapp.sublinksappapi.api.lemmy.v3.controllers;

import com.sublinksapp.sublinksappapi.api.lemmy.v3.models.requests.CreateCustomEmoji;
import com.sublinksapp.sublinksappapi.api.lemmy.v3.models.requests.DeleteCustomEmoji;
import com.sublinksapp.sublinksappapi.api.lemmy.v3.models.requests.EditCustomEmoji;
import com.sublinksapp.sublinksappapi.api.lemmy.v3.models.responses.CustomEmojiResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(path = "/api/v3/custom_emoji")
public class CustomEmojiController {
    @PostMapping
    CustomEmojiResponse create(@Valid CreateCustomEmoji createCustomEmojiForm) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    @PutMapping
    CustomEmojiResponse update(@Valid EditCustomEmoji editCustomEmojiForm) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping("delete")
    CustomEmojiResponse delete(@Valid DeleteCustomEmoji deleteCustomEmojiForm) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }
}