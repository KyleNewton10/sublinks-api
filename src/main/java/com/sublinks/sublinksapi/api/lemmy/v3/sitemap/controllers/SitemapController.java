package com.sublinks.sublinksapi.api.lemmy.v3.sitemap.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class SitemapController {
    @GetMapping("api/v3/sitemap.xml")
    String index() {

        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }
}
