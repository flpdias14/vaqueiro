package uname.group.vaqueiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import uname.group.vaqueiro.model.Aboio;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class AboioController {

    private static final String template = "Ooohhh! %s";
    private final AtomicLong counter = new AtomicLong();


    @GetMapping("/aboio")
    @ResponseBody
    public Aboio sayOohh(@RequestParam(name="name", required=false, defaultValue="Gado!") String name) {
        return new Aboio(counter.incrementAndGet(), String.format(template, name));
    }
}
