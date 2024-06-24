package com.cobra.SpringLearning.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews(Long CompanyId);
}
