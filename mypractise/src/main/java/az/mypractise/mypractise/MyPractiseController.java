package az.mypractise.mypractise;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyPractiseController {

    @GetMapping("/first")//api/first
    public String myFirstApi() {
        return "It is myFirstApp";
    }

    @GetMapping("/second")//api/second
    public String mySecondApi() {
        return "It is mySecondApp";
    }

    @GetMapping("/third")//api/third
    public List<Integer> myThirdApi() {
        return List.of(1, 3, 5, 7, 9, 11, 13, 15);
    }

    @GetMapping("/name")
    public String myApi(@RequestParam Long number) {
        if (number%10==0)
            return "Onluq mərtəbəsi";
         else if (number%100==0)
            return "Yüzlük mərtəbəsi";
         else if (number%1000==0)
            return "Minlik mərtəbəsi";
         else if (number%10000==0)
            return "On Minlik mərtəbəsi";
         else
            return "404 Not Found!";
        }

    @GetMapping("/name2/{number2}")
    public String myApi2(@PathVariable(name = "number2") Integer m) { // or Integer number

        switch (m) {
            case 90:
                return "Baku";
            case 42:
                return "Lankaran";
            case 40:
                return "Guba";
            case 70:
                return "Naxchivan";
            case 20:
                return "Ganja";
            case 36:
                return "Gabala";
            case 55:
                return "Shaki";
            default:
                return "No information found in the database!";
        }
    }
}