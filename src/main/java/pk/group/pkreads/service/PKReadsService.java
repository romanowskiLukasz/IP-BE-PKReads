package pk.group.pkreads.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import pk.group.pkreads.entities.*;
import pk.group.pkreads.model.*;
import pk.group.pkreads.repo.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@org.springframework.stereotype.Service
public class PKReadsService {

    private static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

    BookRepo bookRepo;
    UserRepo userRepo;
    MessageRepo messageRepo;
    ReservationRepo reservationRepo;
    RatingRepo ratingRepo;
    FormRepo formRepo;
    BorrowedRepo borrowedRepo;
    CommentsRepo commentsRepo;
    BookStatusRepo bookStatusRepo;

    @Autowired
    public PKReadsService(BookRepo bookRepo, UserRepo userRepo, MessageRepo messageRepo, ReservationRepo reservationRepo, RatingRepo ratingRepo, FormRepo formRepo, BorrowedRepo borrowedRepo,CommentsRepo commentsRepo,BookStatusRepo bookStatusRepo) {
        this.bookRepo=bookRepo;
        this.userRepo = userRepo;
        this.messageRepo=messageRepo;
        this.reservationRepo=reservationRepo;
        this.ratingRepo=ratingRepo;
        this.formRepo=formRepo;
        this.borrowedRepo=borrowedRepo;
        this.commentsRepo=commentsRepo;
        this.bookStatusRepo=bookStatusRepo;
    }

    public List<BookModel> getBooksInfo() {
        return bookRepo.getBooksInfo();
    }

    public List<UserModel> getAllUsers() {
        return userRepo.getAllUsers();
    }

    public void registerUser(RegisterModel registerModel) {
        User user = User.builder()
                .name(registerModel.getName())
                .email(registerModel.getEmail())
                .password(PASSWORD_ENCODER.encode(registerModel.getPassword()))
                .build();
        userRepo.save(user);
    }

    public void addMessage(Messages messages) {
        Messages message = Messages.builder()
                .email(messages.getEmail())
                .topic(messages.getTopic())
                .contents(messages.getContents())
                .build();
        messageRepo.save(message);
    }

    public String loginUser(LoginModel loginModel){
        User user = userRepo.findByEmail(loginModel.getEmail());
        if(user == null){
            return "2";
        }
        if(PASSWORD_ENCODER.matches(loginModel.getPassword(), user.getPassword())){
            return "0";
        }else {
            return "1";
        }
    }

    public BookModel getBookById(Long id){
        return bookRepo.getInfoById(id);
    }


    public UserModel getUserInfo(String email){
        return userRepo.findModelByEmail(email);
    }

    public UserModel getUserInfoById(Long id){
        return userRepo.findUserById(id);
    }

    public void addRating(RatingModel ratingModel){
        Rating rating=Rating.builder()
                .starsCount(ratingModel.getStars_count())
                .book(bookRepo.getById(ratingModel.getBook_book_id()))
                .user(userRepo.getById(ratingModel.getUser_id()))
                .build();
        ratingRepo.save(rating);

    }

    public List<RatingModel> getRatings(Long userId){
        return ratingRepo.getInfoById(userId);
    }



    public void PostForm(FormModel form){
        Form newForm=Form.builder()
                .author(form.getAuthor())
                .title(form.getTitle())
                .publishingHouse(form.getPublishingHouse())
                .user(userRepo.getById(form.getUserId()))
                .build();
        formRepo.save(newForm);
    }

    public String changeEmail(ChangeEmailModel changeEmailModel){

        User updatedUser= userRepo.getById(changeEmailModel.getId());
        if(PASSWORD_ENCODER.matches(changeEmailModel.getPassword(), updatedUser.getPassword())){
            updatedUser.setEmail(changeEmailModel.getNewEmail());
            userRepo.save(updatedUser);
            return "0";
        }
        else {
            return "1";
        }
    }

    public String changePassword(ChangePasswordModel changePasswordModel){
        User updatedUser= userRepo.getById(changePasswordModel.getId());
        if(PASSWORD_ENCODER.matches(changePasswordModel.getPassword(), updatedUser.getPassword())){
            updatedUser.setPassword(PASSWORD_ENCODER.encode(changePasswordModel.getNewPassword()));
            userRepo.save(updatedUser);
            return "0";
        }
        else {
            return "1";
        }

    }

    public void updateBookStatus(BookStatusModel bookStatusModel){
        BookStatus updatedBookStatus=bookStatusRepo.getById(bookStatusModel.getId());
        updatedBookStatus.setBookStatus(bookStatusModel.getBookStatus());
        bookStatusRepo.save(updatedBookStatus);
    }


    public List<AvgRatingModel> getAvgRatings(){
        List<AvgRatingModel> avgBooksRatings=new ArrayList<>();
        for(long i=1;i<=7;i++) avgBooksRatings.add(ratingRepo.getAvgBookRating(i));
        return avgBooksRatings;
    }

    public List<CommentsModel> getComments(Long bookId){
        return commentsRepo.getComments(bookId);
    }

    public void PostComment(CommentsModel comment){
        Comments newComment= Comments.builder()
                .content(comment.getContent())
                .book(bookRepo.getById(comment.getBook_book_id()))
                .user(userRepo.getById(comment.getUser_id()))
                .build();
        commentsRepo.save(newComment);
    }

    public void postBookStatus(BookStatusModel bookStatusModel){
        BookStatus newBookStatus=BookStatus.builder()
                .id(bookStatusModel.getId())
                .bookStatus(bookStatusModel.getBookStatus())
                .book(bookRepo.getById(bookStatusModel.getBook_book_id()))
                .user(userRepo.getById(bookStatusModel.getUser_id()))
                        .build();
        bookStatusRepo.save(newBookStatus);
    }

    public BookStatusModel getBookStatus(Long bookId,Long userId){
        return bookStatusRepo.getBookStatus(bookId,userId);
    }

    public List<UserBooksStatusesModel> getUserBooksStatuses(Long userId){
        return bookStatusRepo.getBookStatusByUserId(userId);
    }

    public void deleteComment(Long commentId){
        commentsRepo.deleteById(commentId);
    }



}
