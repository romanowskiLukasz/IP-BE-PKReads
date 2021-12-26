package pk.group.libraryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pk.group.libraryapp.entities.*;
import pk.group.libraryapp.model.*;
import pk.group.libraryapp.service.LibraryService;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin
public class TestController {
    
    LibraryService libraryService;

    @Autowired
    public TestController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/books")
    public List<BookModel> getBooksInfo(){
        return libraryService.getBooksInfo();
    }

    @GetMapping("/books/{bookId}")
    public BookModel getBookByID(@PathVariable String bookId){
        return libraryService.getBookById(Long.parseLong(bookId));
    }


    @PostMapping("/user/register")
    public void registerUser(@RequestBody RegisterModel registerModel){
        libraryService.registerUser(registerModel);
    }

    @PostMapping("/user/login")
    public String loginUser(@RequestBody LoginModel loginModel){
        return libraryService.loginUser(loginModel);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return libraryService.getAllUsers();
    }

    @GetMapping("/me/{email}")
    public User getUserInfo(@PathVariable String email) {
        return libraryService.getUserInfo(email);
    }

    @GetMapping("/reservations/{userId}")
    public List<UserReservationsModel> getReservations(@PathVariable String userId) {
        return libraryService.getReservations(Long.parseLong(userId));
    }

    @PostMapping("/user/message")
    public void addMessage(@RequestBody Messages message){
        libraryService.addMessage(message);
    }

    @PostMapping("/book/reservation")
    @ResponseBody
    public ResponseEntity  reserveBook(@RequestBody ReservationModel reservationModel){
        if(libraryService.reserveBook(reservationModel)) return new ResponseEntity(HttpStatus.OK);
        else return new ResponseEntity(HttpStatus.FORBIDDEN);
    }


}
