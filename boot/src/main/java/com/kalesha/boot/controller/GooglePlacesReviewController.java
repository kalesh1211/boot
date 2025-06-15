
package com.kalesha.boot.controller;

import com.kalesha.boot.model.Comment;
import com.kalesha.boot.model.Reviewer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/google_places/reviews")
public class GooglePlacesReviewController {

    @GetMapping("/{cid}")
    public Comment getReviewByCid(@PathVariable String cid) {
        if (!"2675994930679235192".equals(cid)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Review not found for cid: " + cid);
        }

        Reviewer reviewer = new Reviewer();
        reviewer.setId("105627868710866705653");
        reviewer.setName("Sukanti MOHANTY");
        reviewer.setPhotoUrl("https://lh3.googleusercontent.com/a-/ALV-UjUGXimwySS6y9tvFVlQfYZKgsAxn7uqCe6NP4vSGA9gh-qiIow=s1920-c-rp-mo-br100");

        Comment comment = new Comment();
        comment.setExternalId("Ci9DQUlRQUNvZENodHljRjlvT2tKWE1FWmtPSEZwTldkMGNEQm9PVFpHYmkxcmEyYxAB");
        comment.setText("After trying many fancy restaurants, I can say their service is just as good. It's quick, and the prices are fair for what you get. The waiter Bhagirathi suggested some food, That was really awesome. Thank u");
        comment.setReviewer(reviewer);
        comment.setRating(5.0);
        comment.setDate("2025-05-29T08:23:29.986Z");
        comment.setRelativeDate("an hour ago");
        comment.setSource("Google");
        comment.setSourceUrl("https://www.google.com/maps/reviews/data=!4m8!14m7!1m6!2m5!1sCi9DQUlRQUNvZENodHljRjlvT2tKWE1FWmtPSEZwTldkMGNEQm9PVFpHYmkxcmEyYxAB!2m1!1s0x0:0x25230b361fe1c278!3m1!1s2@1:CAIQACodChtycF9oOkJXMEZkOHFpNWd0cDBoOTZGbi1ra2c|0cD0a0uoJb5|?hl=en");

        return comment;
    }
}
