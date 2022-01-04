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
    public List<UserModel> getAllUsers() {
        return pkReadsService.getAllUsers();
    }

    @GetMapping("/me/{email}")
    public UserModel getUserInfo(@PathVariable String email) {
        return pkReadsService.getUserInfo(email);
    }

    @GetMapping("/userInfo/{id}")
    public UserModel getUserInfoById(@PathVariable String id) {
        return pkReadsService.getUserInfoById(Long.parseLong(id));
    }



    @PostMapping("/user/message")
    public void addMessage(@RequestBody Messages message){
        pkReadsService.addMessage(message);
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



    @GetMapping("/getComments/{bookId}")
    public List<CommentsModel> getComments(@PathVariable String bookId) {
        return pkReadsService.getComments(Long.parseLong(bookId));
    }

    @PostMapping("/user/addComment")
    public void PostComment(@RequestBody CommentsModel comment){
        pkReadsService.PostComment(comment);
    }

    @GetMapping("/getBookStatus/{bookId}/{userId}")
    public BookStatusModel getBookStatus(@PathVariable String bookId,@PathVariable String userId) {
        return pkReadsService.getBookStatus(Long.parseLong(bookId),Long.parseLong(userId));
    }

    @PutMapping("/user/updateBookStatus")
    public void updateBookStatus(@RequestBody BookStatusModel bookStatusModel){
         pkReadsService.updateBookStatus(bookStatusModel);
    }

    @PostMapping("/user/addBookStatus")
    public void postBookStatus(@RequestBody BookStatusModel bookStatusModel){
        pkReadsService.postBookStatus(bookStatusModel);
    }

    @GetMapping("/user/getBooksStatus/{userId}")
    public List<UserBooksStatusesModel> getUserBooksStatuses(@PathVariable String userId) {
        return pkReadsService.getUserBooksStatuses(Long.parseLong(userId));
    }

    @DeleteMapping("/deleteComment/{commentId}")
    public void deleteComment(@PathVariable String commentId){
        pkReadsService.deleteComment(Long.parseLong(commentId));
    }

    @DeleteMapping("/deleteForm/{formId}")
    public void deleteForm(@PathVariable String formId){
        pkReadsService.deleteForm(Long.parseLong(formId));
    }

    @GetMapping("/admin/getForms")
    public List<FormModel> getForms() {
        return pkReadsService.getForms();
    }

    @PostMapping("/admin/addBook")
    public void postBook(@RequestBody FormModel formModel){
        pkReadsService.postBook(formModel);
    }




}
