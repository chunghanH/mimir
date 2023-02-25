package com.thhsieh.mimir.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mimir/product")
public class ProductController {

    @RequestMapping(value = "/e/callback", method = RequestMethod.GET)
    public String ePriceCallback() {
        return "e price";
    }

    @RequestMapping(value = "/efq/callback", method = RequestMethod.GET)
    public String efqPriceCallback() {
        return "efq price";
    }
}
