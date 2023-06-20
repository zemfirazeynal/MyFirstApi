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
        if (number/10 == 1)
            return "Onluq mərtəbəsi";
        else if (number/100 == 1 )
            return "Yüzlük mərtəbəsi";
        else if (number/1000 == 1)
            return "Minlik mərtəbəsi";
        else if (number/10000 == 1)
            return "On Minlik mərtəbəsi";
        else
            return "404 Not Found!";
    }

    @GetMapping("/city/{number}")
    public String myApi2(@PathVariable(name = "number") Integer m) { // or Integer number

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

    @GetMapping("/month/{day}")
    public String myApi3(@PathVariable Long day) { // or Integer number

        if (day == 31L) {
            return "January,\nMarch,\nMay,\nJuly,\nAugust,\nOctober,\nDecember";
        } else if (day == 30L) {
            return "April,\nJune,\nSeptember,\nNowember";
        } else if (day == 28L) {
            return "February";
        } else {
            return "No information found in the database!";
        }
    }

    @GetMapping("/squad/{year}")
    public String myApi3(@PathVariable int year) { // or Integer number

        switch(year){
            case 1903:
                return "Beshiktash";
            case 1905:
                return "Galatasaray";
            case 1907:
                return "FenerBahche";
            default:
            return "No information found in the database!";
        }
    }

    @GetMapping("/cartoon")
    public String myApi4(@RequestParam Long year) { // or Integer number


        if (year == 2001) {
            return "Shrek";
        } else if (year == 2002) {
            return "Ice Age";
        } else if (year == 2003) {
            return "Finding Nemo, Brother Bear";
        } else if (year == 2005) {
            return "Madagascar";
        } else if (year == 2007) {
            return "Cars";
        }
        return "No information found in the database!";
    }

    @PostMapping
    public String addStudent(@RequestBody String  student){
        
        return student;
    }
}