package controller;

import com.prashanth.spring.transaction.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/transaction")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping(path="/add")
    public @ResponseBody
    String addRecord(@RequestParam String movie
            , @RequestParam String year) {
        movieService.createMovie();
        return "Saved";
    }

}
