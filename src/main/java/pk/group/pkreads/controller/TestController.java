package pk.group.pkreads.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pk.group.pkreads.entities.*;
import pk.group.pkreads.model.*;
import pk.group.pkreads.service.PKReadsService;

import java.util.List;

@RestController
@CrossOrigin
public class TestController {
    
    PKReadsService pkReadsService;

    @Autowired
    public TestController(PKReadsService pkReadsService) {
        this.pkReadsService = pkReadsService;
    }

    @GetMapping("/books")
    public List<BookModel> getBooksInfo(){
        return pkReadsService.getBooksInfo();
    }

    @GetMapping("/books/{bookId}")
    public BookModel getBookByID(@PathVariable String bookId){
        return pkReadsService.getBookById(Long.parseLong(bookId));
    }


    @PostMapping("/user/register")
    public void registerUser(@RequestBody RegisterModel registerModel){
        pkReadsService.registerUser(registerModel);
    }

    @PostMapping("/user/login")
    public String loginUser(@RequestBody LoginModel loginModel){
        return pkReadsService.loginUser(loginModel);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return pkReadsService.getAllUsers();
    }

    @GetMapping("/me/{email}")
    public UserModel getUserInfo(@PathVariable String email) {
        return pkReadsService.getUserInfo(email);
    }

    @GetMapping("/reservations/{userId}")
    public List<UserReservationsModel> getReservations(@PathVariable String userId) {
        return pkReadsService.getReservations(Long.parseLong(userId));
    }

    @PostMapping("/user/message")
    public void addMessage(@RequestBody Messages message){
        pkReadsService.addMessage(message);
    }

    @PostMapping("/book/reservation")
    @ResponseBody
    public ResponseEntity  reserveBook(@RequestBody ReservationModel reservationModel){
        if(pkReadsService.reserveBook(reservationModel)) return new ResponseEntity(HttpStatus.OK);
        else return new ResponseEntity(HttpStatus.FORBIDDEN);
    }

    @PostMapping("/rating")
    public void addRating(@RequestBody RatingModel ratingModel){
         pkReadsService.addRating(ratingModel);
    }

    @GetMapping("/ratings/{userId}")
    public List<RatingModel> getRatings(@PathVariable String userId) {
        return pkReadsService.getRatings(Long.parseLong(userId));
    }

    @GetMapping("/avgRatings")
    public List<AvgRatingModel> getAvgRatings() {
        return pkReadsService.getAvgRatings();
    }

    @PutMapping("user/changePassword")
    public String changePassword(@RequestBody ChangePasswordModel changePasswordModel){
        return pkReadsService.changePassword(changePasswordModel);
    }

    @PostMapping("/user/form")
    public void PostForm(@RequestBody FormModel form){
        pkReadsService.PostForm(form);
    }

    @PutMapping("/user/changeEmail")
    public String changeEmail(@RequestBody ChangeEmailModel changeEmailModel){
        return pkReadsService.changeEmail(changeEmailModel);
    }

    @GetMapping("/borrowedBooks/{userId}")
    public List<UserBorrowModel> getBorrowedBooks(@PathVariable String userId) {
        return pkReadsService.getBorrowedBooks(Long.parseLong(userId));
    }

    @GetMapping("/getComments/{bookId}")
    public List<CommentsModel> getComments(@PathVariable String bookId) {
        return pkReadsService.getComments(Long.parseLong(bookId));
    }

    @PostMapping("/user/addComment")
    public void PostComment(@RequestBody CommentsModel comment){
        pkReadsService.PostComment(comment);
    }


}
