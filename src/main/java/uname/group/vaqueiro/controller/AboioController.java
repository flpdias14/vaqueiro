package uname.group.vaqueiro.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import uname.group.vaqueiro.model.Aboio;

import java.util.concurrent.atomic.AtomicLong;

@Api(value = "Aboio")
@Controller
public class AboioController {

    private static final String template = "Ooohhh! %s";
    private final AtomicLong counter = new AtomicLong();

    @ApiOperation(value = "Shouts an aboio")
    @GetMapping("/aboio")
    @ResponseBody
    public Aboio sayOohh(@RequestParam(name="name", required=false, defaultValue="Gado!") String name) {
        return new Aboio(counter.incrementAndGet(), String.format(template, name));
    }
}
